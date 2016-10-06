package com.copart.cas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionServiceImpl implements AuctionService{

	@Autowired
	private AuctionDAO auctionDAO;
	
	
	@Override
	public List<Auction> findAll() {
	
		return this.auctionDAO.findAll();
	}

	
}
