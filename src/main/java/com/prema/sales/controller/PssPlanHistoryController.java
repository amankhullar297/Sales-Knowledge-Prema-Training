package com.prema.sales.controller;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;

	import com.prema.sales.dao.PlanHistoryDao;
	import com.prema.sales.dao.*;
	import com.prema.sales.entity.PlanHistory;

	@Controller

	public class PssPlanHistoryController {
		@Autowired
		PlanHistoryDao phd;
		
		@RequestMapping(value="/planHistoryAdmin", method=RequestMethod.GET)
		public ModelAndView planHistoryLoad(ModelMap model ) {
			List<PlanHistory> list = phd.selectAll();
			PlanHistory planHistory =new PlanHistory();
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("pssAdminPlanHistory");
			modelAndView.addObject("planHistoryList",list);
			
			modelAndView.addObject(planHistory);
			
			return modelAndView;
			
			
			
			
		}
//			System.out.println(p);
//			String result="";
//			if(p.getPlanHId()>0) {
//				result =phd.update(p);
//			}else@RequestMapping(value="/planHistoryAdminInsert", method=RequestMethod.POST)
//		
//			{
//				result=phd.insert(p);
//				
//			}
//			ModelAndView modelAndView =new ModelAndView();
//			modelAndView.setViewName("planHistory");
//			List<PlanHistory> list = phd.selectAll();
//			modelAndView.addObject("planHistoryList",list);
//			p =new PlanHistory();
//			modelAndView.addObject("planHistory",p);
//			return modelAndView;
//			
//		}
//
//	@RequestMapping(value="/planHistoryDelete", method=RequestMethod.POST)
//	public ModelAndView planHistoryDelete(@RequestParam("planHId") int planHId) {
//		String result=phd.delete(planHId);
//		ModelAndView modelAndView =new ModelAndView();
//		modelAndView.setViewName("planHistory");
//		List<PlanHistory> list = phd.selectAll();
//		modelAndView.addObject("planHistoryList",list);
//		PlanHistory p =new PlanHistory();
//		modelAndView.addObject(p);
//		return modelAndView;
//	}
//	@RequestMapping(value="/planHistoryFind", method=RequestMethod.POST)
//	public ModelAndView planHistoryFind(@RequestParam("planHId") int planHId) {
//		PlanHistory p =phd.findByplanHId(planHId);
//		ModelAndView modelAndView =new ModelAndView();
//		modelAndView.setViewName("planHistory");
//		List<PlanHistory> list = phd.selectAll();
//		modelAndView.addObject("planHistoryList",list);
//		modelAndView.addObject("planHistory",p);
//		return modelAndView;
//		
//		
//	}
//	}
//		

		
		



			

}
