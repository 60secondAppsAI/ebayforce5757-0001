package com.ebayforce5757.dao;

import java.util.List;

import com.ebayforce5757.dao.GenericDAO;
import com.ebayforce5757.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


