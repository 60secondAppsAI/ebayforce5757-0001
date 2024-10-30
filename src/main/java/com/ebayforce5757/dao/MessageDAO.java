package com.ebayforce5757.dao;

import java.util.List;

import com.ebayforce5757.dao.GenericDAO;
import com.ebayforce5757.domain.Message;





public interface MessageDAO extends GenericDAO<Message, Integer> {
  
	List<Message> findAll();
	






}


