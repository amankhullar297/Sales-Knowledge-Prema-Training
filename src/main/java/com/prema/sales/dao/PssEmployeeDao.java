package com.prema.sales.dao;
import java.util.*;

import com.prema.sales.entity.Feedback;
import com.prema.sales.entity.PssEmployee;
import com.prema.sales.entity.Student;

public interface PssEmployeeDao {
	 public String insert(PssEmployee pssemp);
	 public String update(PssEmployee pssemp);
	 public String delete(int id);
	//public List <PssEmployee>selectALL();
	 public List <PssEmployee>selectAllByBlock(char status);
	 public PssEmployee findById(int Id);
	 public boolean blockById(int Id,String status);
	 public List<PssEmployee>selectAllNameStartingWith(String name);
	 
	public List<PssEmployee> selectAll();
}
