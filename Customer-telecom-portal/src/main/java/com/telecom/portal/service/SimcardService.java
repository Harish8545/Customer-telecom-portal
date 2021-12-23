package com.telecom.portal.service;

import com.telecom.portal.dto.SimcardDto;

public interface SimcardService {
	Integer createSimcard(SimcardDto simcardDto, Integer custId);

	SimcardDto retreiveCustomerSims(Integer simcardId);

}
