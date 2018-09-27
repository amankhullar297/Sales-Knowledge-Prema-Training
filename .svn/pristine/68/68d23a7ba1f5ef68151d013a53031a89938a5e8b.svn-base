package com.prema.sales.controller;

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
import com.prema.sales.dao.ClientCategoryDao;
import com.prema.sales.dao.ClientCompanyDao;
import com.prema.sales.entity.ClientCategory;
import com.prema.sales.entity.Student;

@Controller
public class ClientCategoryController {
	@Autowired
	ClientCategoryDao sd;
	@Autowired
	ClientCompanyDao clientCompanyDao;
	
	@RequestMapping(value="/ClientCategoryEmp" ,method=RequestMethod.GET)
	public ModelAndView clientCategoryLoadEmp(ModelMap model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean!=null)
		{
		int x=sessionBean.getOrgId();
		List<ClientCategory> list = sd.selectAll(x);
		ClientCategory clientCategory = new ClientCategory();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgEmpClientCategory");
		modelAndView.addObject("ClientCategoryList", list);
		modelAndView.addObject("clientList", clientCompanyDao.selectAll());
		modelAndView.addObject(clientCategory);
		return modelAndView;
	}else
	{
		return new ModelAndView("redirect:/");
	}
	}
	
	@RequestMapping(value="/ClientCategoryAdmin" ,method=RequestMethod.GET)
	public ModelAndView clientCategoryLoadAdmin(ModelMap model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean!=null)
		{
		int x=sessionBean.getOrgId();
		List<ClientCategory> list = sd.selectAll(x);
		ClientCategory clientCategory = new ClientCategory();
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("orgAdminClientCategory");
		modelAndView.addObject("ClientCategoryList", list);
		modelAndView.addObject(clientCategory);
		return modelAndView;
		}else
		{
			return new ModelAndView("redirect:/");
		}
	}
	
	@RequestMapping(value="/ClientCategoryFind" ,method=RequestMethod.POST)
	public ModelAndView clientCategoryLoadFind(@RequestParam("catId") int catId,ModelMap model,HttpServletRequest request) {
		ClientCategory clientCategory = sd.findByCategoryId(catId);
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean!=null)
		{
		int x=sessionBean.getOrgId();
		List<ClientCategory> list = sd.selectAll(x);
		System.out.println(clientCategory);
		modelAndView.setViewName("orgEmpClientCategory");
		modelAndView.addObject("ClientCategoryList", list);
		modelAndView.addObject("clientList", clientCompanyDao.selectAll());
		modelAndView.addObject(clientCategory);
		return modelAndView;
	}
		else
		{
			return new ModelAndView("redirect:/");
		}
	}
	@RequestMapping(value="/ClientCategoryInsert",method=RequestMethod.POST)
	public ModelAndView clientCategoryInsert(@ModelAttribute ClientCategory clientCategory,HttpServletRequest request) {
	ModelAndView modelAndView = new ModelAndView();	
	System.out.println(clientCategory.getCatId());
	String result  = "";
	if (clientCategory.getCatId()>0) {
		result=sd.update(clientCategory);
		modelAndView.setViewName("orgEmpClientCategory");
		modelAndView.addObject("result", "Record Updated !");
		
	}else 
	{
	result=sd.insert(clientCategory);
	modelAndView.setViewName("orgEmpClientCategory");
	modelAndView.addObject("result", "Record Inserted !");
	}
	HttpSession session = request.getSession();
	SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
	if(sessionBean!=null)
	{
	int x=sessionBean.getOrgId();
	List<ClientCategory> list = sd.selectAll(x);
    modelAndView.addObject("ClientCategoryList",list);
    modelAndView.addObject("clientList", clientCompanyDao.selectAll());
    clientCategory= new ClientCategory();
    modelAndView.addObject("clientCategory",clientCategory);
    return modelAndView;
    }		else
	{
		return new ModelAndView("redirect:/");
	}
}
	
	@RequestMapping(value="/ClientCategoryDelete",method=RequestMethod.POST)
	public ModelAndView ClientCategoryDelete(@RequestParam("catId") int catId) {
	String result  = sd.delete(catId);
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("orgEmpClientCategory");
	List<ClientCategory> list = sd.selectAll(1);
	modelAndView.addObject("ClientCategoryList",list);
	ClientCategory s = new ClientCategory();
	modelAndView.addObject(s);
	return modelAndView;
	}
	@RequestMapping(value="/ClientCategoryFindByCategoryId",method=RequestMethod.POST)
	public ModelAndView ClientCategoryFindByCategoryId(@RequestParam("catId") int catId) {
	ClientCategory s = sd.findByCategoryId(catId);
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("orgEmpClientCategory");
	List<ClientCategory> list = sd.selectAll(1);
	modelAndView.addObject("ClientCategoryList",list);
	modelAndView.addObject("ClientCategory",s);

	return modelAndView;
		}
	@RequestMapping(value="/ClientCategoryFindByClientId",method=RequestMethod.POST)
	public ModelAndView ClientCategoryFindByClientId(@RequestParam("clientId") int clientId) {
	List<ClientCategory> s = sd.findByClientId(clientId);
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("orgEmpClientCategory");
	List<ClientCategory> list = sd.selectAll(1);
	modelAndView.addObject("ClientCategoryList",list);
	modelAndView.addObject("ClientCategory",s);

	return modelAndView;
		}
	@RequestMapping(value="/ClientCategoryFindByCategory",method=RequestMethod.POST)
	public ModelAndView ClientCategoryFindByCategory(@RequestParam("category") String category) {
	List<ClientCategory> s = sd.findByCategory(category);
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("orgEmpClientCategory");
	List<ClientCategory> list = sd.selectAll(1);
	modelAndView.addObject("ClientCategoryList",list);
	modelAndView.addObject("ClientCategory",s);

	return modelAndView;
		}
}
