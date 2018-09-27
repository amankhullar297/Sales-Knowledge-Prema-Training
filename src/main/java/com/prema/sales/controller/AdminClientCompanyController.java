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

import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.ClientCompanyDao;
import com.prema.sales.entity.ClientCompany;

@Controller
public class AdminClientCompanyController {

	
	@Autowired
	ClientCompanyDao ccd;
	
	@RequestMapping(value = "/ClientCompany", method = RequestMethod.GET)
	public ModelAndView clientCompanyLoad(ModelMap model,HttpServletRequest request) {

		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		int orgId = sessionBean.getOrgId();
		// to show all data call StudentDao all select function
		List<ClientCompany> list = ccd.selectByOrgId(orgId);
		// to send empty data
		ClientCompany cc = new ClientCompany();
		ModelAndView modelAndView = new ModelAndView("orgadminClientCompany"); // jsp file: student(name of view passed to
																	// ViewResolver)

		modelAndView.addObject("ClientCompanyList", list); // place data(model) to jsp found above
		modelAndView.addObject("msg", ""); 
		modelAndView.addObject(cc); // obj bindind
		
		return modelAndView;
		
	}
}
