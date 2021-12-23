package com.telecom.portal.dto;

import com.telecom.portal.model.Customer;

public class SimcardDto {

	private Integer id;
	private Integer sIMNumber;
	private Integer iMSINumber;
	private Customer customer;

	public SimcardDto(Integer id, Integer sIMNumber, Integer iMSINumber) {
		super();
		this.id = id;
		this.sIMNumber = sIMNumber;
		this.iMSINumber = iMSINumber;
	}

}