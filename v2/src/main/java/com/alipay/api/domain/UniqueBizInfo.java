package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-26 10:37:29
 */
public class UniqueBizInfo extends AlipayObject {

	private static final long serialVersionUID = 2412492649368555713L;

	/**
	 * 子业务单号对应的子使用人手机号
	 */
	@ApiField("sub_phone_no")
	private String subPhoneNo;

	/**
	 * 子业务单号
	 */
	@ApiField("sub_unique_biz_no")
	private String subUniqueBizNo;

	public String getSubPhoneNo() {
		return this.subPhoneNo;
	}
	public void setSubPhoneNo(String subPhoneNo) {
		this.subPhoneNo = subPhoneNo;
	}

	public String getSubUniqueBizNo() {
		return this.subUniqueBizNo;
	}
	public void setSubUniqueBizNo(String subUniqueBizNo) {
		this.subUniqueBizNo = subUniqueBizNo;
	}

}
