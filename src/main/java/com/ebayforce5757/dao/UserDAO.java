package com.ebayforce5757.dao;

import java.util.List;

import com.ebayforce5757.dao.GenericDAO;
import com.ebayforce5757.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


