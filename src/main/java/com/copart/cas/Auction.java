package com.copart.cas;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data 
public class Auction {
    

	private int yardNumber;
	private String YardName;
	private String yardCity;
	private String yardState;
	private String yardCountry;
	private int auctionStartTimeLocal;
	private int auctionPrestartTime;
	private int prestartDuration;
	private int offsetHoursFromServer;
	private int startTimeBasedOnServer;
	private String lane;
	private String laneHighLights;
	private String statusCode;
	private String statusDescriptions;
	private long lotsAssigned;
	private String auctionServerAssignTo;
	private String siteCode;
	private String siteCodeExtensionValue;
	
	
}


