package com.prema.sales.dao;

import java.util.*;

import com.prema.sales.entity.RegOrg;
import com.prema.sales.entity.RegOrgStatusView;
import com.prema.sales.entity.Student;

public interface RegOrgDao {
/*public String insert(RegOrg ro);*/
public String update(RegOrg ro);
//public String delete(int orgId);
public List<RegOrg> selectALL();
public RegOrg findById(int orgId);
public List<RegOrg> findByName(String orgName);
public boolean blockAndUnblock(int ro,String status);
public List<RegOrg> findAllWithStatus();
public List<RegOrgStatusView> selectRegOrgView();

}
