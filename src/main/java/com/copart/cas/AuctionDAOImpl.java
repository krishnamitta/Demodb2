package com.copart.cas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AuctionDAOImpl implements AuctionDAO {
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Auction> findAll() {
		
		return this.jdbcTemplate.query("SELECT * FROM MISRKS.TODAYAUCTIONS",
				new BeanPropertyRowMapper<Auction>(Auction.class));
	}

}
