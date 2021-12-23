package com.telecom.portal.service;

import com.telecom.portal.dto.CustomerDto;

public interface CustomerService {
	Integer createCustomer(CustomerDto customerDto);

	CustomerDto retrieveCustomer(Integer custId);


}
