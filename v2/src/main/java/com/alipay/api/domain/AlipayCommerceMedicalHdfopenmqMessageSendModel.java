package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫消息变更
 *
 * @author auto create
 * @since 1.0, 2026-08-19 14:50:33
 */
public class AlipayCommerceMedicalHdfopenmqMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 7753259344844471638L;

	/**
	 * 好大夫变更消息体
	 */
	@ApiField("hdfbody")
	private String hdfbody;

	public String getHdfbody() {
		return this.hdfbody;
	}
	public void setHdfbody(String hdfbody) {
		this.hdfbody = hdfbody;
	}

}
