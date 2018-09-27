package com.prema.sales.controller;
	import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.ProductDao;
	import com.prema.sales.entity.Product;
import com.prema.sales.entity.RegOrg;

import java.util.*;

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
		@Controller
		public class ProductController {
			@Autowired
			ProductDao product;
			
			@RequestMapping(value="/OrgEmpProductView" ,method=RequestMethod.GET)
			public ModelAndView OrgEmpProductView(ModelMap model, HttpServletRequest request) {
				HttpSession session = request.getSession();
				SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
				ModelAndView modelAndView = new ModelAndView();
				System.out.println(sessionBean);
				if(sessionBean!=null)
				{
				List<Product> list = product.selectAllByOrgId(sessionBean.getOrgId());
				Product pd = new Product();
				
				modelAndView.setViewName("OrgEmpProductView");
				modelAndView.addObject("productList", list);
				modelAndView.addObject(new Product());}
				return modelAndView;
			}
			
			
			
		@RequestMapping(value="/OrgAddProductInsert",method=RequestMethod.POST)
			public ModelAndView OrgAddproductInsert(@ModelAttribute("pd") Product p,HttpSession session) {
			System.out.println(p);
			SessionBean sessionBean=  (SessionBean )session.getAttribute("sessionBean");
			int orgId=sessionBean.getOrgId();
			RegOrg org = new RegOrg();
			org.setOrgId(orgId);
			p.setOrgId(org);
			//p.setProductStatus(productStatus);
			String result  = "";
			/*if (p.getOrgId().getOrgId()>0) {
				result=product.update(p);		
			}else  
			{*/
			result=product.insert(p);
			//}
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("orgAdminProductView");
			List<Product> list = product.selectAll();
			
		    modelAndView.addObject("productList",list);
		    p= new Product();
		    modelAndView.addObject(p);
		    return modelAndView;
		    }
		@RequestMapping(value="/OrgAddproductDelete",method=RequestMethod.POST)
		public ModelAndView OrgAddproductDelete(@RequestParam("id") int id) {
		String result  = product.delete(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("product");
		List<Product> list = product.selectAll();
		modelAndView.addObject("productList",list);
		Product p= new Product();
		modelAndView.addObject(p);
		return modelAndView;
		}
		@RequestMapping(value="/OrgAddProductFind",method=RequestMethod.POST)
		public ModelAndView OrgAddproductFind(@RequestParam("id") int id) {
	    Product pd = product.findById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgAdminProductView");
		List<Product> list = product.selectAll();
		modelAndView.addObject("productList",list);
		modelAndView.addObject("pd",pd);
        return modelAndView;
			}

		@RequestMapping(value="/orgAdminProductView" ,method=RequestMethod.GET)
		public ModelAndView OrgAddproductView(ModelMap model, HttpServletRequest request) {
			HttpSession session = request.getSession();
			SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
			if(sessionBean!=null) {
			List<Product> list = product.selectAll();
			Product pd = new Product();
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("orgAdminProductView");
			modelAndView.addObject("productList", list);
			modelAndView.addObject("pd",pd);
			return modelAndView;
		}
			else {
				return new ModelAndView("redirect:/");
			}
		}
		}
		  

		             
		                  







