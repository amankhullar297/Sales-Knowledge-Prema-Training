package com.prema.sales.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.KnowledgeRateDao;
import com.prema.sales.dao.SalesKnowledgeDao;
import com.prema.sales.entity.ClientCompany;
import com.prema.sales.entity.KnowledgeRate;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.SalesKnowledge;

@Controller
public class KnowledgeRateController {
	@Autowired
		KnowledgeRateDao dao;
	@Autowired
	SalesKnowledgeDao salesKnowledgeDao;
   @RequestMapping(value ="/KnowledgeRate",method = RequestMethod.POST)
   public ModelAndView KnowledgeRateLoad(@RequestParam("salesId") int salesId,ModelMap modelMap,@ModelAttribute("knowledgeRate")KnowledgeRate k, HttpServletRequest request) {
	   HttpSession session=request.getSession();
			SessionBean bean = (SessionBean)session.getAttribute("sessionBean");
			int empId=bean.getEmpId();
			OrgEmployee orgEmployee=new OrgEmployee();
			orgEmployee.setEmpId(empId);
			k.setOrgEmployee(orgEmployee);
			System.out.println(empId);
			
	   KnowledgeRate knowledgeRate=new KnowledgeRate();	
	   ModelAndView modelAndView=new ModelAndView();
	   modelAndView.setViewName("orgEmployeeKnowledgeRate");
	   modelAndView.addObject("salesKnowledges", salesKnowledgeDao.findById(salesId));
	   modelAndView.addObject("knowledgeRate",knowledgeRate);
	   modelAndView.addObject("knowledgeRateList", dao.findByempId(bean.getEmpId()	));
	   return modelAndView ;
	   	}
   @RequestMapping(value ="/KnowledgeRate1",method = RequestMethod.GET)
   public ModelAndView KnowledgeRateLoad1(ModelMap modelMap) {
	   List<KnowledgeRate> list =dao.selectAll(1);
	   KnowledgeRate knowledgeRate=new KnowledgeRate();
	   ModelAndView modelAndView=new ModelAndView();
	   modelAndView.setViewName("orgAdminKnowledgeRate");
	   modelAndView.addObject("KnowledgeRateList", list);
	   modelAndView.addObject(knowledgeRate);
	   return modelAndView ;
	   	}
   		@RequestMapping(value="/KnowledgeRateInsert",method=RequestMethod.POST)
   		public ModelAndView KnowledgeRateInsert(@ModelAttribute("knowledgeRate")KnowledgeRate k, HttpServletRequest request)
   		{
   			Date d=new Date(System.currentTimeMillis());
   			k.setKnowDate(d);
   			k.setRateStatus('L');
   			HttpSession session=request.getSession();
   			SessionBean bean = (SessionBean)session.getAttribute("sessionBean");
   			int empId=bean.getEmpId();
   			OrgEmployee orgEmployee=new OrgEmployee();
   			orgEmployee.setEmpId(empId);
   			k.setOrgEmployee(orgEmployee);
   			System.out.println("Function called");
   			System.out.println(k);
   			String result ="";
   			if(k.getKnowId()>0) {
   				k.setRateStatus('H');
   				result=dao.update(k);
   			}else {
   				result=dao.insert(k);	
   			}
   			System.out.println(result);
   			ModelAndView modelAndView=new ModelAndView("orgEmployeeKnowledgeRate");
   			//modelAndView.setViewName("orgEmployeeKnowledgeRate");
   			
   			List<KnowledgeRate> list =dao.selectAll(bean.getEmpId());
   			
   			k=new KnowledgeRate();
   			modelAndView.addObject("knowledgeRateList", dao.findByempId(bean.getEmpId()	));
   			modelAndView.addObject("knowledgeRate",k);
   			modelAndView.addObject("KnowledgeRateList",list);
   			modelAndView.addObject("show","sucessfully");
   			return modelAndView;
   			}
   		@RequestMapping(value="KnowledgeRateFind",method=RequestMethod.POST)
   		public ModelAndView KnowledgeRateFind(@RequestParam("knowId")int knowId) {
   			ModelAndView modelAndView=new ModelAndView();
   			modelAndView.setViewName("KnowledgeRate");
   			List<KnowledgeRate>list=dao.selectAll(1);
   			modelAndView.addObject("KnowledgeRateList",list);
   			
   		 modelAndView.addObject("knowledgeRateList", dao.findByknowId(0));
   			return modelAndView;
   		}
   		@RequestMapping(value = "/KnowledgeRateUpdate", method = RequestMethod.POST)
   		public ModelAndView KnowledgeRateFind(@RequestParam( "knowId")int knowId,@RequestParam("salesId")int salesId, ModelMap model,HttpSession session) {
			
   			ModelAndView modelAndView = new ModelAndView("orgEmployeeKnowledgeRate");
   			SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
   			List<KnowledgeRate> list =dao.selectAll(sessionBean.getOrgId());
   		 modelAndView.addObject("knowledgeRateList", list);
   		 modelAndView.addObject("salesKnowledges", salesKnowledgeDao.findById(salesId));
   		 System.out.println(salesId+knowId);
   		 KnowledgeRate kn=dao.findByknowId(knowId);
   		 System.out.println("updated value is"+kn);
   		 modelAndView.addObject("knowledgeRate", dao.findByknowId(knowId));
   			return modelAndView;
   	}
   		@RequestMapping(value = "/KnowledgeRateConfirm", method = RequestMethod.POST)
   		public ModelAndView KnowledgeRateConfirm(@ModelAttribute("knowledgeRate")KnowledgeRate k,@RequestParam( "knowId")int knowId,@RequestParam("salesId")int salesId, ModelMap model) {
			k.setRateStatus('H');
   			ModelAndView modelAndView = new ModelAndView("orgEmployeeKnowledgeRate");
   		 modelAndView.addObject("knowledgeRateList", dao.findByknowId(knowId));
   		 modelAndView.addObject("salesKnowledges", salesKnowledgeDao.findById(salesId));
   		 modelAndView.addObject("knowledgeRate", new KnowledgeRate());
   			return modelAndView;
   	}
}
