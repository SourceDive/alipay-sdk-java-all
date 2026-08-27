package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 14:57:45
 */
public class AlipayTradeCustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4649796692285928348L;

	/** 
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

}
