package com.prema.sales.dao;
import com.prema.sales.entity.*;
import java.util.*;
public interface PlanDao {
public String insert(Plan p);
public String update(Plan p);
public String delete(int p);
public List<Plan>selectAllActivePlans();
public List<Plan>selectActivePlans();
public Plan findByPlanId(int planId);

}



