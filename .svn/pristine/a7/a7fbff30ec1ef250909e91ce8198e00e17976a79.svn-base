package com.prema.sales.controller;
import com.prema.sales.dao.Studentdao;
import com.prema.sales.entity.Student;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

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
public class StudentController {
	@Autowired
	Studentdao sd;
	
	@RequestMapping(value="/student" ,method=RequestMethod.POST)
	public ModelAndView studentLoad(ModelMap model) {
		List<Student> list = sd.selectALL();
		Student student = new Student();
		ModelAndView modelAndView = 
				new ModelAndView();
		modelAndView.setViewName("student");
		modelAndView.addObject("studentList", list);
		modelAndView.addObject(student);
		return modelAndView;
	}
@RequestMapping(value="/studentInsert",method=RequestMethod.POST)
	public ModelAndView studentInsert(@ModelAttribute("student") Student s) {
	System.out.println(s);
	String result  = "";
	if (s.getId()>0) {
		result=sd.update(s);		
	}else 
	{
	result=sd.insert(s);
	}
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("student");
	List<Student> list = sd.selectALL();
    modelAndView.addObject("studentList",list);
    s= new Student();
    modelAndView.addObject("student",s);
    return modelAndView;
    }
@RequestMapping(value="/studentDelete",method=RequestMethod.POST)
public ModelAndView studentDelete(@RequestParam("id") int id) {
String result  = sd.delete(id);
ModelAndView modelAndView = new ModelAndView();
modelAndView.setViewName("student");
List<Student> list = sd.selectALL();
modelAndView.addObject("studentList",list);
Student s = new Student();
modelAndView.addObject(s);
return modelAndView;
}
@RequestMapping(value="/studentFind",method=RequestMethod.POST)
public ModelAndView studentFind(@RequestParam("id") int id) {
Student s = sd.findById(id);
ModelAndView modelAndView = new ModelAndView();
modelAndView.setViewName("student");
List<Student> list = sd.selectALL();
modelAndView.addObject("studentList",list);
modelAndView.addObject("student",s);

return modelAndView;
	}
}