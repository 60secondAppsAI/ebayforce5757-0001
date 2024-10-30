package com.ebayforce5757.dao;

import java.util.List;

import com.ebayforce5757.dao.GenericDAO;
import com.ebayforce5757.domain.Watchlist;





public interface WatchlistDAO extends GenericDAO<Watchlist, Integer> {
  
	List<Watchlist> findAll();
	






}


