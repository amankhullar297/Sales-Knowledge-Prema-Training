package com.prema.sales.dao;
import java.util.List;

import com.prema.sales.entity.PssRate;
import com.prema.sales.entity.PssRate;

public interface PssRateDao {
	public String insert(PssRate k);
	public String update(PssRate k);
	public List<PssRate> selectAll();
	public PssRate findById(int RateId);
}
