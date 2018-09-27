package com.prema.sales.dao;

import java.util.*;
import com.prema.sales.entity.*;

public interface ProductCompetitorDao {

	public String insert(ProductCompetitor pc);

	public String update(ProductCompetitor pc);

	public String delete(int compId);

	public List<ProductCompetitor> selectAll(int orgId);
	
	public List<ProductCompetitor> selectAllActive(int orgId);

	public ProductCompetitor findByCompId(int compId);

	public List<ProductCompetitor> findByProductId(int productId);

	public List<ProductCompetitor> findByCompName(String compName);

	public List<ProductCompetitor> findByProductType(String productType);

	public List<ProductCompetitor> findByProductProvider(String productProvider);

}
