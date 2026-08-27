package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.grantbyphoneno.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 15:42:55
 */
public class AlipayCommerceMedicalServicepackageGrantbyphonenoCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2776439314196589457L;

	/** 
	 * null
	 */
	@ApiListField("fail_order_no_list")
	@ApiField("string")
	private List<String> failOrderNoList;

	public void setFailOrderNoList(List<String> failOrderNoList) {
		this.failOrderNoList = failOrderNoList;
	}
	public List<String> getFailOrderNoList( ) {
		return this.failOrderNoList;
	}

}
