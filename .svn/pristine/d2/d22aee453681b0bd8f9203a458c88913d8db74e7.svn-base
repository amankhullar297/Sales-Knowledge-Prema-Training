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
public class PssAdminPlanController {
	@Autowired
	PlanDao pd;
	@RequestMapping(value="/plan",method=RequestMethod.GET)
public ModelAndView planLoad(ModelMap model) {
	List <Plan>list=pd.selectAllActivePlans();
	Plan plan=new Plan();
	ModelAndView modelAndView=new ModelAndView("pssAdminPlanView");
	modelAndView.addObject("planList",list);
	modelAndView.addObject("plan",plan);
	modelAndView.addObject("result",null);
	return modelAndView;
	
}
	
	@RequestMapping(value="/planUpdate",method=RequestMethod.POST)
	public ModelAndView planUpdate(@RequestParam("planId")int planId ,ModelMap model) {
		List <Plan>list=pd.selectAllActivePlans();
		ModelAndView modelAndView=new ModelAndView("pssAdminPlanView");
		modelAndView.addObject("planList",list);
		modelAndView.addObject("plan",pd.findByPlanId(planId));
		return modelAndView;
		
	}
	@RequestMapping(value="/planDelete",method=RequestMethod.POST)
	public ModelAndView planDelete(@RequestParam("planId")int planId ,ModelMap model) {
		String result=pd.delete(planId);
		List <Plan>list=pd.selectAllActivePlans();
		ModelAndView modelAndView=new ModelAndView("pssAdminPlanView");
		modelAndView.addObject("planList",list);
		modelAndView.addObject("result","Plan Deleted");
		modelAndView.addObject("plan",new Plan());
		return modelAndView;
		
	}
@RequestMapping(value="/planInsert",method=RequestMethod.POST)
public ModelAndView planInsert(@ModelAttribute("plan")Plan p) {
	String result="";
	ModelAndView modelAndView=new ModelAndView();
	if (p.getPlanId()>0) {
		result=pd.update(p);	
		modelAndView.addObject("result","Plan Updated");
	}else 
	{
		modelAndView.addObject("result","Plan Inserted");
		
	result=pd.insert(p);
	};

	modelAndView.setViewName("pssAdminPlanView");
	List<Plan>list=pd.selectAllActivePlans();
	modelAndView.addObject("planList",list);
	modelAndView.addObject("plan",new Plan());

	return modelAndView;
}
@RequestMapping(value="/planFind",method=RequestMethod.POST)
public ModelAndView planFind(@RequestParam("planId")int planId) {
	Plan p=pd.findByPlanId(planId);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("pssAdminPlanView");
	List<Plan>list=pd.selectAllActivePlans();
	modelAndView.addObject("planList",list);
	modelAndView.addObject(p);
	return modelAndView;
}

}
