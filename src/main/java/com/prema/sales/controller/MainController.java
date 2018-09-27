package com.prema.sales.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.prema.sales.common.SessionBean;


@Controller
public class MainController {

	//@RequestMapping(value="/testSession",method=RequestMethod.GET)
	public ModelAndView indexPagekjhj(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		System.out.println(sessionBean);
		return new ModelAndView("loginPage");
	}
	
	//@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView indexPage()
	{
		return new ModelAndView("loginPage");
	}
	
	
	
	
	@RequestMapping(value="/getLogin",method=RequestMethod.POST)
	public ModelAndView getLogin(@RequestParam("id") int id, HttpServletRequest request)
	{//,HttpResponse response
		ModelAndView mav = new ModelAndView();
		SessionBean sessionBean = null;
	HttpSession session=request.getSession();
		switch (id) {
		case 1:
			sessionBean= new SessionBean(0, "Pss", 1, "abc@pss.com", "A");
		mav.setViewName("pss_admin");
//			mav.setViewName("pssDashboard");
			mav.addObject("result", "U are logged in as pss admin");
         
			break;
		case 2:
			sessionBean= new SessionBean(0, "Pss", 2, "emp@pss.com", "E");
			mav.setViewName("pss_employee");
		//	mav.setViewName("pssDashboard");
			mav.addObject("result", "U are logged in as pss employee");
			break;
		case 3:
			sessionBean= new SessionBean(1, "Byteby Pvt. Ltd.", 2, "abc@byteby.com", "A");
			mav.setViewName("org_admin");
//			mav.setViewName("orgDashboard");
			mav.addObject("result", "U are logged in as org admin");
			break;
		case 4:
			sessionBean= new SessionBean(1, "Byteby Pvt. Ltd.", 3, "peter@byteby.com", "E");
			mav.setViewName("org_employee");
//			mav.setViewName("orgDashboard");
			mav.addObject("result", "U are logged in as org emp");
			break;

		default:
			sessionBean=null;
			mav.setViewName("/");
			break;
		}
		session.setAttribute("sessionBean", sessionBean);
		return mav;
	}
}
