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
import com.prema.sales.dao.RegOrgDao;
import com.prema.sales.entity.Plan;
import com.prema.sales.entity.RegOrg;
import com.prema.sales.entity.RegOrgStatusView;
import com.prema.sales.entity.Student;

@Controller
public class RegOrgController {
	@Autowired
	RegOrgDao rodao;
	@RequestMapping(value="/RegOrg", method=RequestMethod.GET)
	public ModelAndView studentLoad(ModelMap model) {

		List<RegOrgStatusView> list=rodao.selectRegOrgView();
		RegOrg ro  = new RegOrg();
		ModelAndView modelAndView = new ModelAndView("PssAdminRegOrgView");
		modelAndView.addObject("RegOrgStatusViewList",list);
		System.out.println(list);
		modelAndView.addObject(ro);
		return modelAndView;

}
	@RequestMapping(value="/RegOrgFind", method=RequestMethod.GET)
	public ModelAndView RegOrgFind(@RequestParam("orgName") String orgName) {
		List<RegOrg> list =rodao.findByName(orgName);
		ModelAndView modelAndView =new ModelAndView("PssAdminRegOrgView");
		modelAndView.addObject("RegOrgNameList",list);
		return modelAndView;
		
}
	
	@RequestMapping(value="/RegOrgblock", method=RequestMethod.POST)
	public ModelAndView RegOrgblock(@RequestParam("regOrg") int regOrg,@RequestParam("status") String status) {
		boolean i =rodao.blockAndUnblock(regOrg,status);
		List<RegOrgStatusView> list=rodao.selectRegOrgView();
		System.out.println(i+""+regOrg);
		ModelAndView modelAndView =new ModelAndView("PssAdminRegOrgView");
		modelAndView.addObject("RegOrgStatusViewList",list);
		return modelAndView;
	}
	@RequestMapping(value="/RegOrgFindById",method=RequestMethod.GET)
	public ModelAndView studentFind(HttpServletRequest request) {
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		System.out.println(sessionBean);
		RegOrg i =rodao.findById(sessionBean.getOrgId());
	ModelAndView modelAndView = new ModelAndView("OrgAdminRegOrgView");
	modelAndView.addObject("RegOrg",i);
	return modelAndView;

	}
	
	
	
	@RequestMapping(value="/RegOrgUpdate",method=RequestMethod.POST)
	public ModelAndView planUpdate(@ModelAttribute("RegOrg")RegOrg regOrg,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		System.out.println(sessionBean);
		
		RegOrg dbRegOrg =rodao.findById(sessionBean.getOrgId());
		dbRegOrg.setOrgName(regOrg.getOrgName());
		dbRegOrg.setOrgAddress(regOrg.getOrgAddress());
		dbRegOrg.setContactNo(regOrg.getContactNo());
		String result="";
		if(regOrg.getOrgId()>0) {
			result=rodao.update(dbRegOrg);	
		}

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("OrgAdminRegOrgView");
		modelAndView.addObject("RegOrg",dbRegOrg);
		return modelAndView;
	}
	
}
