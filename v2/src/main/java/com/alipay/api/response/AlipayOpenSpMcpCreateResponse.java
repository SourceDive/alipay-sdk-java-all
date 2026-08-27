package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 21:52:51
 */
public class AlipayOpenSpMcpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7696793223743638873L;

	/** 
	 * 申请单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
