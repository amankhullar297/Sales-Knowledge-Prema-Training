package com.prema.sales.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.OrgEmployeeDao;
import com.prema.sales.entity.ClientCompany;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.Product;
import com.prema.sales.entity.PssEmployee;
import com.prema.sales.entity.RegOrg;
import com.prema.sales.entity.RegOrgStatusView;
import com.prema.sales.entity.SalesKnowledge;
import com.prema.sales.entity.Student;
@Controller
public class OrgEmployeeController {
	
	@Autowired
	OrgEmployeeDao dao;
	
   @RequestMapping(value="/orgemployee",method=RequestMethod.GET)
	public ModelAndView studentLoad(ModelMap model) {
	   
		List<OrgEmployee> list=dao.selectOrgEmpView();
		OrgEmployee orgemployee  = new OrgEmployee();
		ModelAndView modelAndView = new ModelAndView("orgEmpProfile");
		modelAndView.addObject("orgEmployeeList",list);
		System.out.println(list);
		modelAndView.addObject("orgemployee",orgemployee);
		return modelAndView;

	}
   
   @RequestMapping(value="/orgemployeeadd",method=RequestMethod.GET)
	public ModelAndView Add(ModelMap model) {
	   
		List<OrgEmployee> list=dao.selectOrgEmpView();
		OrgEmployee re  = new OrgEmployee();
		ModelAndView modelAndView = new ModelAndView("orgAdminEmp");
		modelAndView.addObject("orgEmployeeList",list);
		System.out.println(list);
		modelAndView.addObject(re);
		return modelAndView;

	}
   
   @RequestMapping(value="/orgemployeeInsert",method=RequestMethod.POST)
	public ModelAndView OrgEmployeeInsert(@ModelAttribute("orgemployee")OrgEmployee o,HttpServletRequest request) {
      
	   ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgEmpProfile");
		//System.out.println("email=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +  o);
		String result = "";
		if(o.getEmpId()>0) {
			RegOrg ro = new RegOrg();
			HttpSession session = request.getSession();
			SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
			ro.setOrgId(sessionBean.getOrgId());
			o.setOrganization(ro);
			result=dao.update(o);
		}else {
			RegOrg ro = new RegOrg();
			HttpSession session = request.getSession();
			SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
			ro.setOrgId(sessionBean.getOrgId());
			o.setBlockStatus("U");
			o.setOrganization(ro);
		result=dao.insert(o);
		}
		
		
		//List <OrgEmployee> list = dao.selectAllNameStartingWith("");	
		List <OrgEmployee> list = dao.selectAll();	
		modelAndView.addObject("orgEmployeeList",list);
		OrgEmployee emp= new OrgEmployee();
		modelAndView.addObject("orgemployee",emp);
       return modelAndView;
	   
	   
   }
	
   @RequestMapping(value="/orgemployeeUpdate",method=RequestMethod.POST)
	public ModelAndView orgemployeeUpdate(@ModelAttribute("OrgEmployee")OrgEmployee orgEmp,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		System.out.println(sessionBean);
		
		OrgEmployee org =dao.findByEmpId(sessionBean.getOrgId());
		org.setEmpName(orgEmp.getEmpName());
		org.setEmpAddress(orgEmp.getEmpAddress());
		org.setMobileNo(orgEmp.getMobileNo());
		String result="";
		if(orgEmp.getEmpId()>0) {
			result=dao.update(org);	
		}

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("orgEmpProfile");
		modelAndView.addObject("OrgEmployee",org);
		return modelAndView;
	}
   @RequestMapping(value="/orgemployeeDelete",method=RequestMethod.POST)
	public ModelAndView orgemployeeDelete(@RequestParam("id") int id) {
	   int result  = dao.delete(id);
	   ModelAndView modelAndView = new ModelAndView();
	   modelAndView.setViewName("orgemployee");
	   List<OrgEmployee> list = dao.selectAll();
	   modelAndView.addObject("orgEmployeeList",list);
	   OrgEmployee o = new OrgEmployee();
	   modelAndView.addObject(o);
	   return modelAndView;
   }
   @RequestMapping(value="/orgemployeeFind",method=RequestMethod.POST)
   public ModelAndView EmployeeFind(@RequestParam("id") int id) {
   OrgEmployee o = dao.findByEmpId(id);
   ModelAndView modelAndView = new ModelAndView();
   modelAndView.setViewName("orgEmpProfile");
   List<OrgEmployee> list = dao.selectAll();
   modelAndView.addObject("orgEmployeeList",list);
   modelAndView.addObject("orgemployee",o);

   return modelAndView;
   	}
   
   
   @RequestMapping(value="/orgemployeeBlock", method=RequestMethod.POST)
	public ModelAndView orgemployeeBlock(@RequestParam("id") int id,@RequestParam("status") String status) {
		boolean i =dao.blockAndUnblock(id,status);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgAdminEmp");
		List <OrgEmployee> list = dao.selectAll();	
			modelAndView.addObject("orgEmployeeList",list);
			OrgEmployee emp = new OrgEmployee();
	       modelAndView.addObject("employeeList", list);
	   modelAndView.addObject("OrgEmployee",emp);
        return modelAndView;
		
	}
   }

