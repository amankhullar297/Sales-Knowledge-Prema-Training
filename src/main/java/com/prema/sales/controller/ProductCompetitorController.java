package com.prema.sales.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.ProductCompetitorDao;
import com.prema.sales.dao.ProductDao;
import com.prema.sales.entity.Product;
import com.prema.sales.entity.ProductCompetitor;

@Controller
public class ProductCompetitorController {
	@Autowired
	ProductCompetitorDao pcd;
	@Autowired
	ProductDao pd;

	// @RequestMapping(value ="/pc", method = RequestMethod.GET)
	// String showHome() {
	// return "redirect:/productCompetitor";
	// }

	@RequestMapping(value = "/productCompetitor", method = RequestMethod.GET)
	public ModelAndView productCompetitorLoad(ModelMap model, HttpServletRequest request) {
		// to show all data call pcDao all select function
		HttpSession session = request.getSession();
		System.out.println("session is created");
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		System.out.println("session is session bean created");
		int orgId = sessionBean.getOrgId();
		System.out.println("org id: " + orgId);
		// orgId = 1;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgAdminProductCo");

		List<ProductCompetitor> list = pcd.selectAll(orgId);
		// to send empty data
		ProductCompetitor pc = new ProductCompetitor();
		modelAndView.addObject("competitorList", list);
		List<Product> productList = pd.selectAllByOrgId(orgId);
		System.out.println("product list " + productList);

		modelAndView.addObject("productList", productList);

		modelAndView.addObject(pc);
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorEmp", method = RequestMethod.GET)
	public ModelAndView productCompetitorEmpLoad(ModelMap model, HttpServletRequest request) {
		// to show all data call pcDao all select function
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		int orgId = sessionBean.getOrgId();
		System.out.print("org id: " + orgId);
		// orgId = 1;
		List<ProductCompetitor> list = pcd.selectAllActive(orgId);
		// to send empty data
		ProductCompetitor pc = new ProductCompetitor();
		ModelAndView modelAndView = new ModelAndView("orgEmpProductCo");
		modelAndView.addObject("competitorList", list);
		modelAndView.addObject(pc);
		return modelAndView;
	}

	// @RequestMapping(value = "/validateDetails", method = RequestMethod.POST)
	// public String validateDetail(@Valid ProductCompetitor productcomp,
	// BindingResult result) {
	// if(result.hasErrors()) {
	// return "sales_knowledge/productCompetitor";
	// } else {
	// return "productCompetitorInsert";
	// }
	// }
	@RequestMapping(value = "/productCompetitorInsert", method = RequestMethod.POST)
	public ModelAndView productCompetitorInsert(@ModelAttribute("productCompetitor") ProductCompetitor pc,
			HttpServletRequest request) {

		String result = null;
		System.out.print("comp id: " + pc.getCompId());
		System.out.print("comp id: " + pc.getProductType());
		
		if (pc.getCompId() > 0) {
			result = pcd.update(pc);
		} else {
			result = pcd.insert(pc);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgAdminProductCo");
		// int orgId = 1;
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		int orgId = sessionBean.getOrgId();
		System.out.print("org id: " + orgId);
		List<ProductCompetitor> list = pcd.selectAll(orgId);
		modelAndView.addObject("competitorList", list);
		List<Product> productList = pd.selectAllByOrgId(orgId);
		System.out.println("product list " + productList);
		modelAndView.addObject("productList", productList);
		pc = new ProductCompetitor();
		modelAndView.addObject(pc);
		if (result.equals("error")) {
			modelAndView.addObject("result", "FAILED!!!");
		} else {
			modelAndView.addObject("result", "DONE!!!");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorFindByCompId", method = RequestMethod.POST)
	public ModelAndView productCompetitorFindByCompId(@RequestParam("compId") int compId, HttpServletRequest request) {
		System.out.println(compId);
		ProductCompetitor pc = pcd.findByCompId(compId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgAdminProductCo");
		HttpSession session = request.getSession();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		int orgId = sessionBean.getOrgId();
		System.out.print("org id: " + orgId);
		List<ProductCompetitor> list = pcd.selectAll(orgId);
		modelAndView.addObject("competitorList", list);
		List<Product> productList = pd.selectAllByOrgId(orgId);
		System.out.println("product list " + productList);

		modelAndView.addObject("productList", productList);
		modelAndView.addObject(pc);
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorFindByProductId", method = RequestMethod.POST)
	public ModelAndView productCompetitorFindByProductId(@RequestParam("productId") int productId) {
		ProductCompetitor pc = pcd.findByCompId(productId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("productCompetitor");
		// int orgId = 1;
		// List<ProductCompetitor> list = pcd.selectAll(orgId);
		// modelAndView.addObject("competitorList", list);
		// modelAndView.addObject(pc);
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorFindByCompName", method = RequestMethod.POST)
	public ModelAndView productCompetitorFindByCompName(@RequestParam("compName") String compName) {
		List<ProductCompetitor> compList = pcd.findByCompName(compName);
		ProductCompetitor pc = new ProductCompetitor();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("productCompetitor");
		modelAndView.addObject("competitorList", compList);
		modelAndView.addObject(pc);
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorFindByProductType", method = RequestMethod.POST)
	public ModelAndView productCompetitorFindByProductType(@RequestParam("productType") String productType) {
		List<ProductCompetitor> compList = pcd.findByProductType(productType);
		ProductCompetitor pc = new ProductCompetitor();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("productCompetitor");
		modelAndView.addObject("competitorList", compList);
		modelAndView.addObject(pc);
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorFindByProductProvider", method = RequestMethod.POST)
	public ModelAndView productCompetitorFindByProductProvider(
			@RequestParam("productProvider") String productProvider) {
		List<ProductCompetitor> providerList = pcd.findByProductType(productProvider);
		ProductCompetitor pc = new ProductCompetitor();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("productCompetitor");
		modelAndView.addObject("competitorList", providerList);
		modelAndView.addObject(pc);
		return modelAndView;
	}

	@RequestMapping(value = "/productCompetitorDelete", method = RequestMethod.POST)
	public ModelAndView productCompetitorDelete(@RequestParam("compId") int compId, HttpServletRequest request) {
		String result = pcd.delete(compId);
		HttpSession session = request.getSession();
		System.out.println("session is created");
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		System.out.println("session is session bean created");
		int orgId = sessionBean.getOrgId();
		System.out.println("org id: " + orgId);
		// orgId = 1;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("orgAdminProductCo");

		List<ProductCompetitor> list = pcd.selectAll(orgId);
		// to send empty data
		ProductCompetitor pc = new ProductCompetitor();
		modelAndView.addObject("competitorList", list);
		List<Product> productList = pd.selectAllByOrgId(orgId);
		System.out.println("product list " + productList);
		modelAndView.addObject("productList", productList);
		if (result.equals("error")) {
			modelAndView.addObject("result", "FAILED!!!");
		} else {
			modelAndView.addObject("result", "DONE!!!");
		}
		modelAndView.addObject(pc);
		return modelAndView;
	}

}
