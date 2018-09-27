package com.prema.sales.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prema.sales.common.Login;
import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.LoginDao;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.PssEmployee;

@Controller
public class LoginController {
	
	@Autowired
	LoginDao ld;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView Index()
	{
		ModelAndView mav=new ModelAndView("index");
		//mav.addObject("loginModel",new Login());
		return mav;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView LoginPage()
	{
		ModelAndView mav=new ModelAndView("Login");
		mav.addObject("loginModel",new Login());
		return mav;
	}
	
	
	@RequestMapping(value="/loginNow",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("loginModel")Login loginModel, HttpServletRequest request )
	{
		String u ="U";
		String a ="A";
		String e ="E";
		System.out.println(loginModel);
		ModelAndView mav = new ModelAndView();
		PssEmployee pssEmployee =ld.getPssEmpByEmailPwd(loginModel.getEmail(),loginModel.getPwd());
		HttpSession session=request.getSession();
		if(pssEmployee==null)
		{
			OrgEmployee orgEmployee = ld.getOrgEmpByEmailPwd(loginModel.getEmail(),loginModel.getPwd());
			System.out.println(orgEmployee);
			if(orgEmployee==null)
			{
				mav.setViewName("Login");
				mav.addObject("loginModel",new Login());
				mav.addObject("result", "Either emailID or Password is incorrect");
			}
			else
			{
				java.util.Date today = new Date();
				java.sql.Date doe =orgEmployee.getDoj();
				if(today.before(doe))
				{
					if(orgEmployee.getBlockStatus().equals(u))
						{
											if(orgEmployee.getRole().equals(a) )
											{
												mav.setViewName("org_admin");
												mav.addObject("result", "U are logged in as Organisation Admin");
												session.setAttribute("orgEmployee", orgEmployee);
												SessionBean sessionBean = new SessionBean(orgEmployee.getOrganization().getOrgId(), orgEmployee.getOrganization().getOrgName(), orgEmployee.getEmpId(), orgEmployee.getEmail(), orgEmployee.getRole());
												session.setAttribute("sessionBean", sessionBean);
											}
											else if(orgEmployee.getRole().equals(e))
											{
												mav.setViewName("org_employee");
												mav.addObject("result", "U are logged in as Organisation Employee");
												session.setAttribute("orgEmployee", orgEmployee);
												SessionBean sessionBean = new SessionBean(orgEmployee.getOrganization().getOrgId(), orgEmployee.getOrganization().getOrgName(), orgEmployee.getEmpId(), orgEmployee.getEmail(), orgEmployee.getRole());
												session.setAttribute("sessionBean", sessionBean);
											}
					}
					else
					{
						mav.setViewName("Login");
						mav.addObject("loginModel",new Login());
						mav.addObject("result", "your email ID is blocked");
					}
			}
				else
				{
					mav.setViewName("Login");
					mav.addObject("loginModel",new Login());
					mav.addObject("result", "your session is expired");
				}
		}
		}
			else
			{
				if(pssEmployee.getBlockStatus().equals(u))
					{
					
							if(pssEmployee.getRole().equals(a))
								{
									mav.setViewName("pss_admin");
									mav.addObject("result", "U are logged in as pss admin");
									session.setAttribute("pssEmployee", pssEmployee);
									SessionBean sessionBean = new SessionBean(0, "Pss", pssEmployee.getEmpId(), pssEmployee.getEmail(), pssEmployee.getRole());
									session.setAttribute("sessionBean", sessionBean);
								}
								else if(pssEmployee.getRole().equals(e))
								{
									mav.setViewName("pss_employee");
									mav.addObject("result", "U are logged in as pss employee");
									session.setAttribute("pssEmployee", pssEmployee);
									SessionBean sessionBean = new SessionBean(0, "Pss", pssEmployee.getEmpId(), pssEmployee.getEmail(), pssEmployee.getRole());
									session.setAttribute("sessionBean", sessionBean);
								}
					
					}
				else
				{
					mav.setViewName("Login");
					mav.addObject("loginModel",new Login());
					mav.addObject("result", "your email ID is blocked");
				}
			}
		
		return mav;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logOut(HttpServletRequest request)
	{
		System.out.println("iybadgkul");
		HttpSession session=request.getSession();
		session.invalidate();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");//redirect:/
		mav.addObject("loginModel",new Login());
		return mav;
	}
}
