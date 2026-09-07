package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.appinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 10:52:17
 */
public class AlipaySecurityAppinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8511145667171266895L;

	/** 
	 * 1
	 */
	@ApiField("bbb")
	private String bbb;

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
	public String getBbb( ) {
		return this.bbb;
	}

}
