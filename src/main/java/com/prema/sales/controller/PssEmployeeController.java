package com.prema.sales.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prema.sales.dao.PssEmployeeDao;
import com.prema.sales.entity.PssEmployee;

@Controller
public final class PssEmployeeController {

		
		@Autowired
		PssEmployeeDao psem;
	    @RequestMapping(value="/pssEmployeeAdd" ,method=RequestMethod.GET)
		public ModelAndView pssemployeeLoad(ModelMap model) {
	    	System.out.println("email=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PssEmployeeAdd1 " );
			
	    	//List<PssEmployee> list =  psem.selectAllByBlock('U');
			//System.out.println(list);
			PssEmployee pssemployee = new PssEmployee();
			ModelAndView modelAndView = new ModelAndView("PssEmployeeAdd1");
	      // modelAndView.addObject("employeeList", list);
	       modelAndView.addObject("pssemployee",pssemployee);
	       return modelAndView;
	   
	       
		}
		@RequestMapping(value="/pssemployeeInsert",method=RequestMethod.POST)
		public ModelAndView pssemployeeInsert(@ModelAttribute("pssemployee") PssEmployee pssemp) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("pssEmployeeView");
			System.out.println("email=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +  pssemp);
			String result = "";
			if(pssemp.getEmpId()>0) {
				PssEmployee dbPssEmp = psem.findById(pssemp.getEmpId());
				dbPssEmp.setEmpName(pssemp.getEmpName());
				dbPssEmp.setEmpAddress(pssemp.getEmpAddress());
				dbPssEmp.setMobileNo(pssemp.getMobileNo());	 
				dbPssEmp.setPwd(pssemp.getPwd());
				
				result=psem.update(pssemp);
				modelAndView.addObject("result","record updated");
			}else {
				pssemp.setRole("E");
				java.util.Date today = new Date();
				
				pssemp.setDoj(today);
				pssemp.setPwdstatus("A");
				pssemp.setBlockStatus("U");
			result=psem.insert(pssemp);
			modelAndView.addObject("result","record inserted");
			}
			//List <PssEmployee> list = psem.selectAllNameStartingWith("");	
			List <PssEmployee> list = psem.selectAll();	
			modelAndView.addObject("pssemployeeList",list);
			
			PssEmployee pssemployee= new PssEmployee();
			modelAndView.addObject("pssemployee",pssemployee);
			
	        return modelAndView;
		}
		 @RequestMapping(value="/pssEmployeeView" ,method=RequestMethod.GET)
			public ModelAndView pssemployeeView(ModelMap model) {
			 System.out.println("Select All called");
				//List<PssEmployee> list =  psem.selectALL();
			 ModelAndView modelAndView = new ModelAndView("pssEmployeeView");
			List <PssEmployee> list = psem.selectAll();	
				modelAndView.addObject("pssemployeeList",list);
				PssEmployee pssemployee = new PssEmployee();
				
				
				
				
		       modelAndView.addObject("employeeList", list);
		      
		       modelAndView.addObject("pssemployee",pssemployee);
		       return modelAndView;
		   
		       
			}
		
		@RequestMapping(value="/pssemployeeDelete",method=RequestMethod.POST)
		public ModelAndView pssemployeeDelete(@RequestParam("id") int id) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>pssemployeeDelete " );
			
			String result = psem.delete(id);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("pssemployee");
			List <PssEmployee> list = psem.selectAllNameStartingWith("");
			modelAndView.addObject("pssemployeeList",list);
			PssEmployee pssemp= new PssEmployee();
			modelAndView.addObject("pssemployee", pssemp);
			modelAndView.addObject(id);
	        return modelAndView;
		}
		@RequestMapping(value="/pssemployeeFind",method=RequestMethod.POST)
		public ModelAndView pssemployeeFind(@RequestParam("id") int id) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>pssemployeeFind " );
			
			
			PssEmployee pssemp = psem.findById(id);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("PssEmployeeAdd1");
			//List <PssEmployee> list = psem.selectAllNameStartingWith("");
			//modelAndView.addObject("pssemployeeList",list);
		   modelAndView.addObject("pssemployee",pssemp);
			//modelAndView.addObject(id);
	        return modelAndView;
		}
		@RequestMapping(value="/block",method=RequestMethod.POST)
		public ModelAndView pssemployeeblock(@RequestParam("id") int id,@RequestParam("status") String status) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>block " );
			
			boolean p = psem.blockById(id,status);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("pssEmployeeView");
			List <PssEmployee> list = psem.selectAll();	
				modelAndView.addObject("pssemployeeList",list);
				PssEmployee pssemp = new PssEmployee();
		       modelAndView.addObject("employeeList", list);
		   modelAndView.addObject("pssemployee",pssemp);
	        return modelAndView;
		}

		
	}

