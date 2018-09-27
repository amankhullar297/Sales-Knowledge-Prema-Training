package com.prema.sales.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.Date;
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
import com.prema.sales.dao.FeedbackDao;
import com.prema.sales.dao.PssRateDao;
import com.prema.sales.entity.Feedback;
import com.prema.sales.entity.PssRate;

@Controller
public class PssRateController {
	@Autowired
		PssRateDao dao;
	@Autowired
	FeedbackDao fdao;
	
	@Autowired
	PssRateDao pssRateDao;
   
   		@RequestMapping(value="/PssRate",method=RequestMethod.POST)
   		public ModelAndView PssRate(@RequestParam("fbid") int fbId)
   		{
   			ModelAndView modelAndView = new ModelAndView("pssAdminPssRate");
   			modelAndView.addObject("feedbackData", fdao.findById(fbId));
   			modelAndView.addObject("pssrate",new PssRate());
   			return modelAndView;
   		}
   		
   		@RequestMapping(value="/PssRateInsert",method=RequestMethod.POST)
   		public ModelAndView PssRateInsert(@ModelAttribute("pssrate")  PssRate pssRate,HttpServletRequest request)
   		{
   			//session se emp id lekar aao
   			HttpSession session = request.getSession();
   			SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
   			System.out.println(sessionBean);
   			ModelAndView modelAndView = new ModelAndView("pssAdminPssRate");
   			if(pssRate.getRateId()>0) {
   				pssRateDao.update(pssRate);
   			}
   			else {
   				java.util.Date javaDate = new java.util.Date();
				java.sql.Date rateDate = new java.sql.Date(javaDate.getTime());
   				pssRate.setRateDate(rateDate);
   			pssRateDao.insert(pssRate);
   			}
   			
   			//modelAndView.addObject("feedback", );
   			
   			modelAndView.addObject("pssrate",new PssRate());
   			return modelAndView;
   		}
   		
   		
   		@RequestMapping(value="PssRateFind",method=RequestMethod.GET)
   		public ModelAndView PssRateFind(@RequestParam("RateId")int RateId) {
   			PssRate k=dao.findById(RateId);
   			ModelAndView modelAndView=new ModelAndView();
   			modelAndView.setViewName("PssRate");
   			List<PssRate>list=dao.selectAll();
   			modelAndView.addObject("PssRateList",list);
   			modelAndView.addObject("PssRate",k);
   			return modelAndView;
   		}
   		@RequestMapping(value="PssAdminRatingView",method=RequestMethod.GET)
   		public ModelAndView PssAdminRatingView() {
   			
   			ModelAndView modelAndView=new ModelAndView();
   			modelAndView.setViewName("pssAdminRatingView");
   			List<PssRate>list=dao.selectAll();
   			modelAndView.addObject("PssRateList",list);
   			return modelAndView;
   		}
   		
   		@RequestMapping(value="show",method=RequestMethod.GET)
   		public ModelAndView Showmsg() {
   			
   			ModelAndView modelAndView=new ModelAndView("show");
   			modelAndView.addObject("msg","THis is my msg");
   			return modelAndView;
   		}
   		
}