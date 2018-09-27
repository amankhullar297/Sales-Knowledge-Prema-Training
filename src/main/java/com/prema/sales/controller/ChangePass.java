package com.prema.sales.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.PssEmpCngPasDao;
import com.prema.sales.dao.PssEmployeeDao;
import com.prema.sales.entity.PssEmpCngPass;
import com.prema.sales.entity.PssEmployee;
import com.prema.sales.entity.RegOrg;

@Controller
public class ChangePass {
	
	@Autowired
	PssEmpCngPasDao fd;
	
	
		//@RequestMapping(value="/changePassword", method=RequestMethod.GET)
		//public ModelAndView changePass(ModelMap model, HttpServletRequest request)
	/*	{
			System.out.println("Requesting session");
			HttpSession session = request.getSession();
			SessionBean sb=	(SessionBean)session.getAttribute("sessionBean");
			System.out.println("Session variable sb set to="+sb);
			
			//if(sb==null) {
				//System.out.println("The session was not set, Asked to log in first");
				//ModelAndView modelAndView = new ModelAndView("index");
				//modelAndView.addObject("msg","Please Login First");
				
				//return modelAndView;
			//}
			//else {
				//System.out.println("The session was set");
			
			PssEmployeePassChange employee = new PssEmployeePassChange();
			List<PssEmployeePassChange> list=fd.selectAll();
					
			ModelAndView modelAndView = new ModelAndView("pssEmployeeChangePass");
			modelAndView.addObject("employeeList",list);
			modelAndView.addObject(employee);
			return modelAndView;
			
		}*/
		
		@RequestMapping(value="/changePassword", method=RequestMethod.GET)
		public ModelAndView formLoad(@ModelAttribute("employee") PssEmpCngPass employee) {
			//List<PssEmployeePassChange> list=fd.selectAll();
			//PssEmployeePassChange employee = new PssEmployeePassChange();
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("pssEmployeeChangePass");
			//modelAndView.addObject("employeeList", list);
			modelAndView.addObject(employee);
			return modelAndView;
		}
		
		
		@RequestMapping(value="/validateChangePassword", method=RequestMethod.GET)
		public ModelAndView formValidate(@ModelAttribute("employee") PssEmpCngPass employee, HttpServletRequest request) {
			
			System.out.println("Requesting session");
			HttpSession session = request.getSession();
			SessionBean sb=	(SessionBean)session.getAttribute("sessionBean");
			System.out.println("Session variable sb set to="+sb);
			
			System.out.println("empId "+sb.getEmpId());
			System.out.println("old pass is "+employee.getChkPass());
			System.out.println("new 1 is "+employee.getConfirmNewPass());
			System.out.println("new 2 is "+employee.getNewPass());
			List<PssEmpCngPass> list=fd.selectPassByEmpId(sb.getEmpId());
			//PssEmployeePassChange employee = new PssEmployeePassChange();
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("pssEmployeeChangePass");
			//modelAndView.addObject("employeeList", list);
			modelAndView.addObject(employee);
			return modelAndView;
		}

	}
