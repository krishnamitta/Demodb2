package com.copart.cas;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuctionController {
	
	@Autowired
	private AuctionService auctionService;
	
	@Autowired
	private Auction auction;
	
	@RequestMapping(value="/auctions", method= RequestMethod.GET)
	@ResponseBody
	public Collection<Auction> getAuctions (ModelMap modelMap){
		
		 return auctionService.findAll();
	 
	
	}

}
