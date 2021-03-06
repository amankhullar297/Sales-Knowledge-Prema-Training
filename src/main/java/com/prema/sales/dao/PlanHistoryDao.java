package com.prema.sales.dao;

import java.util.*;

import com.prema.sales.entity.*;

public interface PlanHistoryDao {
	public String insert (PlanHistory  p);
	
	public String update (PlanHistory  p);
	
	public String delete (int  p);
	
	public List<PlanHistory> selectAll();
	
	public PlanHistory findByplanHId(int  planHId);
	
	public List<PlanHistory> findByOrgId(String orgId);

	
	
//	public PlanHistory findByDate(Date planDate);
//	public PlanHistory findByBetweenDate( Date planDate);
//	public PlanHistory findByAfterDate(Date planDate);
//	public PlanHistory findByBeforeDate(Date planDate);
//	public PlanHistory findByOrgId(int  planOrgId);
//	public PlanHistory findByPlanId(int  planId);
//	
//	
}
