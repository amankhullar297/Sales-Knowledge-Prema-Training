package com.prema.sales.controller;
import com.prema.sales.dao.*;
import com.prema.sales.entity.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrgAdminPlanController {
	@Autowired
	PlanDao pd;
	@RequestMapping(value="/planAdmin",method=RequestMethod.GET)
public ModelAndView planLoadAdmin(ModelMap model) {
	List <Plan>list=pd.selectActivePlans();
	Plan plan=new Plan();
	ModelAndView modelAndView=new ModelAndView("orgAdminPlanView");
	modelAndView.addObject("planList",list);
	modelAndView.addObject(plan);
	return modelAndView;
	
}
@RequestMapping(value="/planFindAdmin",method=RequestMethod.POST)
public ModelAndView planFindAdmin(@RequestParam("planId")int planId) {
	Plan p=pd.findByPlanId(planId);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("orgAdminPlanView");
	List<Plan>list=pd.selectAllActivePlans();
	modelAndView.addObject("planList",list);
	modelAndView.addObject(p);
	return modelAndView;
}

}
