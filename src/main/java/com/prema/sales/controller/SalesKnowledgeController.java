package com.prema.sales.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import com.prema.sales.common.SessionBean;
import com.prema.sales.dao.ClientCompanyDao;
import com.prema.sales.dao.ProductDao;
import com.prema.sales.dao.SalesKnowledgeDao;
import com.prema.sales.entity.ClientCompany;
import com.prema.sales.entity.OrgEmployee;
import com.prema.sales.entity.Product;
import com.prema.sales.entity.SalesKnowledge;

@Controller
public class SalesKnowledgeController {
	@Autowired
	SalesKnowledgeDao skdao;
	@Autowired
	ClientCompanyDao cdao;
	@Autowired
	ProductDao pdao;

	@RequestMapping(value = "/temp", method = RequestMethod.GET)
	public ModelAndView salesKnowledgeTemp(HttpSession session) {
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		ModelAndView modelAndView = new ModelAndView();
		if (sessionBean == null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "session expired");
		} else {
			int orgId = sessionBean.getOrgId();

			modelAndView.setViewName("orgEmpSalesKnowledgeAdd");

			List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
			System.out.println(clientsList);
			modelAndView.addObject("clientsList", clientsList);
			List<Product> productsList = pdao.selectAllByOrgId(orgId);
			modelAndView.addObject("productsList", productsList);
			SalesKnowledge salesKnowledge = new SalesKnowledge();
			int empId = sessionBean.getEmpId();
			System.out.println("employee is-->>>" + empId);
			List<SalesKnowledge> salesKnowledgeList = skdao.selectByEmpId(empId);
			System.out.println("sales knowledge list of login emp->>>>>>>" + salesKnowledgeList);
			modelAndView.addObject("salesKnowledgeList", salesKnowledgeList);
			modelAndView.addObject(salesKnowledge);
            
		}
		return modelAndView;
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView salesKnowledgeView(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if (sessionBean == null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		} else {
			int orgId = sessionBean.getOrgId();

			modelAndView.setViewName("orgEmpSalesKnowledgeSelect");
			List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
			modelAndView.addObject("clientsList", clientsList);
			List<Product> productsList = pdao.selectAllByOrgId(orgId);
			modelAndView.addObject("productsList", productsList);
			SalesKnowledge salesKnowledge = new SalesKnowledge();
			modelAndView.addObject(salesKnowledge);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/salesKnowledgeInsert", method = RequestMethod.POST)
	public ModelAndView salesKnowledgeInsert(@ModelAttribute("salesKnowledge") SalesKnowledge salesKnowledge,
			HttpSession session) {
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		ModelAndView modelAndView = new ModelAndView();
		if(sessionBean==null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
		System.out.println(salesKnowledge.getSalesDate());
		String result = "";
		System.out.println("SalesKnow before insert -->"+salesKnowledge);
		int empId = sessionBean.getEmpId();
		List<SalesKnowledge> list=skdao.selectByEmpId(empId);
		if (salesKnowledge.getSalesId() > 0) {
			result = skdao.update(salesKnowledge);
			 modelAndView.addObject("success", "Sales knowledge record has been successfully updated");
		} 
		else {
			java.util.Date date = new java.util.Date();
			java.sql.Date entryDate = new java.sql.Date(date.getTime());
			salesKnowledge.setEntryDate(entryDate);
			
			
			OrgEmployee regEmployee = new OrgEmployee();
			regEmployee.setEmpId(empId);
			salesKnowledge.setRegEmployee(regEmployee);
			System.out.println(salesKnowledge);
			salesKnowledge.setKnowStatus("T");
			result = skdao.insert(salesKnowledge);
			
			
			if(result.equals("Error")) {
				modelAndView.addObject("error", "Sales knowledge record couldn't be inserted, please try again later");
			}
			else {
				 modelAndView.addObject("success", "Sales knowledge record has been successfully inserted");
			}
			
	
		}
		modelAndView.addObject("salesKnowledgeList",list);
		modelAndView.setViewName("orgEmpSalesKnowledgeAdd");
		int orgId=sessionBean.getOrgId();
		List<ClientCompany> clientsList=cdao.selectByOrgId(orgId);
		
		List<Product> productsList=pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);
		 salesKnowledge=new SalesKnowledge();
		 modelAndView.addObject(salesKnowledge);
		
		}
		return modelAndView;
	}

	@RequestMapping(value = "/salesKnowledgeDelete", method = RequestMethod.POST)
	public ModelAndView salesKnowledgeDelete(@RequestParam("salesId") int salesId,
			@RequestParam("productId") int productId, @RequestParam("clientId") int clientId, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
		String result = skdao.delete(salesId);
		if(result.equals("Error")) {
			modelAndView.addObject("error", "Sales knowledge record couldn't be deleted, try again later");
		}
		else {
			modelAndView.addObject("success", "Sales Knowledge record deleted successfully");
		}
		System.out.println(productId + "," + clientId);
		
		modelAndView.setViewName("orgEmpSalesKnowledgeAdd");
		SalesKnowledge salesKnowledge = new SalesKnowledge();
		
		int orgId = sessionBean.getOrgId();
		int empId = sessionBean.getEmpId();
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);
		List<SalesKnowledge> salesKnowledgeList = skdao.selectByEmpId(empId);
		modelAndView.addObject("salesKnowledgeList", salesKnowledgeList);
		modelAndView.addObject(salesKnowledge);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/salesKnowledgeLoad", method = RequestMethod.POST)
	public ModelAndView salesKnowledgeLoad(@RequestParam(name ="clientCompany.clientId") int clientId,
			@RequestParam(name ="product.productId") int productId, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
		modelAndView.setViewName("orgEmpSalesKnowledgeSelect");
		
		int orgId = sessionBean.getOrgId();
		modelAndView.getModelMap().addAttribute("clientId", clientId);
		modelAndView.getModelMap().addAttribute("productId", productId);
		SalesKnowledge salesKnowledge = new SalesKnowledge();
		modelAndView.addObject(salesKnowledge);
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);
		List<SalesKnowledge> list=null;

		if (clientId > 0 && productId > 0 && orgId > 0) {
			  list=skdao.selectByClientAndProductAndOrgId(clientId, productId, orgId);
			modelAndView.addObject("salesKnowledgeList", list);
			

		} else if (clientId > 0 && productId == 0 && orgId == 0) {
			list= skdao.selectByClientId(clientId);
			modelAndView.addObject("salesKnowledgeList", list);
		} else if (productId > 0 && clientId == 0 && orgId == 0) {
			list=skdao.selectByProductId(productId);
			modelAndView.addObject("salesKnowledgeList", list);

		} else if (clientId > 0 && productId > 0 && orgId == 0) {
			list=skdao.selectByClientAndProductId(clientId, productId);
			modelAndView.addObject("salesKnowledgeList", list);
		} else if (orgId > 0 && clientId == 0 && productId > 0) {
			list= skdao.selectByOrgAndProductId(orgId, productId);
			modelAndView.addObject("salesKnowledgeList", list);

		} else if (orgId > 0 && clientId == 0 && productId == 0) {
			list=skdao.selectByOrgId(orgId);
			modelAndView.addObject("salesKnowledgeList", list);

		}

		else if (orgId > 0 && clientId > 0 && productId == 0) {
			list=skdao.selectByOrgAndClientId(orgId, clientId);
			modelAndView.addObject("salesKnowledgeList", list);

		}
		if(list!=null) {
			modelAndView.addObject("success", "Data found according to your search request");
			
		}
		else {
			modelAndView.addObject("error", "No data found, change your search conditions try different combinations of search");
		}
		}
		return modelAndView;
	}

	@RequestMapping(value = "/salesKnowledgeFind", method = RequestMethod.POST)
	public ModelAndView salesKnowledgeFind(@RequestParam("salesId") int salesId, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
			System.out.println();
		SalesKnowledge salesKnowledge = skdao.findById(salesId);
		
		modelAndView.setViewName("orgEmpSalesKnowledgeAdd");
		modelAndView.addObject(salesKnowledge);
		
		int empId = sessionBean.getEmpId();
		List<SalesKnowledge> salesKnowledgeList = skdao.selectByEmpId(empId);
		int orgId = sessionBean.getOrgId();
		modelAndView.addObject("salesKnowledgeList", salesKnowledgeList);
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);

		}
		return modelAndView;
	}

	@RequestMapping(value = "/salesKnowledgeConfirm", method = RequestMethod.POST)
	public ModelAndView salesKnowledgeConfirm(@RequestParam("salesId") int salesId, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
		String result = skdao.confirmKnowStatus(salesId);
		if(result.equals("Error")) {
			modelAndView.addObject("error", "Sales knowledge status couldn't be  updated to local from temporary");
		}
		else {
		modelAndView.addObject("success", "Sales knowledge status has been successfully updated to local from temporary");
		}
		
		int empId = sessionBean.getEmpId();
		int orgId = sessionBean.getOrgId();
		List<SalesKnowledge> salesKnowledgeList = skdao.selectByEmpId(empId);
		
		modelAndView.addObject("salesKnowledgeList", salesKnowledgeList);
		SalesKnowledge salesKnowledge = new SalesKnowledge();
		modelAndView.addObject(salesKnowledge);
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);
		modelAndView.setViewName("orgEmpSalesKnowledgeAdd");
		
		}
		return modelAndView;

	}

	@RequestMapping(value = "/adminView", method = RequestMethod.GET)
	public ModelAndView salesKnowledgeAdminView(HttpSession session) {
		ModelAndView view = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			view.setViewName("loginPage");
			view.addObject("info", "Session expired");
		}
		else {
		int orgId = sessionBean.getOrgId();
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		view.addObject("clientsList", clientsList);
		view.addObject("productsList", productsList);
		SalesKnowledge salesKnowledge = new SalesKnowledge();
		view.addObject(salesKnowledge);
		view.setViewName("orgAdminSalesKnowledgeView");
		}
		return view;

	}

	@RequestMapping(value = "/postToHive", method = RequestMethod.POST)
	public ModelAndView salesKnowledgePostToHive(@RequestParam("salesId") int salesId, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			modelAndView.addObject("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
			
		}
		int empId = sessionBean.getEmpId();
		int orgId = sessionBean.getOrgId();
		List<SalesKnowledge> salesKnowledgeList = skdao.selectByEmpId(empId);
		modelAndView.addObject("salesKnowledgeList", salesKnowledgeList);
		SalesKnowledge salesKnowledge = new SalesKnowledge();
		modelAndView.addObject(salesKnowledge);
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);
		String result = skdao.postToHive(salesId);
		if(result.equals("Error")) {
			modelAndView.addObject("error", "Sales knowledge status couldn't be updated to hive");
		}
		else {
			modelAndView.addObject("success", "Sales knowledge status successfully updated to hive");
		}
		modelAndView.setViewName("orgEmpSalesKnowledgeAdd");
		System.out.println(result);

		return modelAndView;
	}

	@RequestMapping(value = "/adminLoad", method = RequestMethod.POST)
	public ModelAndView adminLoad(@RequestParam(name = "clientCompany.clientId") int clientId,
			@RequestParam(name = "product.productId") int productId, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
		if(sessionBean==null) {
			modelAndView.setViewName("loginPage");
			modelAndView.addObject("info", "Session expired");
		}
		else {
		modelAndView.setViewName("orgAdminSalesKnowledgeView");
		
		int orgId = sessionBean.getOrgId();
		modelAndView.getModelMap().addAttribute("clientId", clientId);
		modelAndView.getModelMap().addAttribute("productId", productId);
		SalesKnowledge salesKnowledge = new SalesKnowledge();
		modelAndView.addObject(salesKnowledge);
		List<ClientCompany> clientsList = cdao.selectByOrgId(orgId);
		List<Product> productsList = pdao.selectAllByOrgId(orgId);
		modelAndView.addObject("clientsList", clientsList);
		modelAndView.addObject("productsList", productsList);
		List<SalesKnowledge> list = null;
		
		if (clientId > 0 && productId > 0 && orgId > 0) {
			skdao.selectByClientAndProductAndOrgId(clientId, productId, orgId);
			modelAndView.addObject("salesKnowledgeList", list);

		} else if (clientId > 0 && productId == 0 && orgId == 0) {
			 skdao.selectByClientId(clientId);
			modelAndView.addObject("salesKnowledgeList", list);
		} else if (productId > 0 && clientId == 0 && orgId == 0) {
			skdao.selectByProductId(productId);
			modelAndView.addObject("salesKnowledgeList", list);

		} else if (clientId > 0 && productId > 0 && orgId == 0) {
			 skdao.selectByClientAndProductId(clientId, productId);
			modelAndView.addObject("salesKnowledgeList", list);
		} else if (orgId > 0 && clientId == 0 && productId > 0) {
			 skdao.selectByOrgAndProductId(orgId, productId);
			modelAndView.addObject("salesKnowledgeList", list);

		} else if (orgId > 0 && clientId == 0 && productId == 0) {

 skdao.selectByOrgId(orgId);
			modelAndView.addObject("salesKnowledgeList", list);

		}

		else if (orgId > 0 && clientId > 0 && productId == 0) {

 skdao.selectByOrgAndClientId(orgId, clientId);
			modelAndView.addObject("salesKnowledgeList", list);

		}
		if(list!=null) {
			modelAndView.addObject("success", "Data found according to search conditions");
		}
		else {
			modelAndView.addObject("error", "No data found, change your search conditions and try different combinations of search");
		}}

		return modelAndView;
	}




}
