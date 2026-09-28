package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.factor.certify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-28 14:37:53
 */
public class AlipayCommerceMedicalHdfFactorCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3737991935488857574L;

	/** 
	 * 结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
