package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-24 13:57:54
 */
public class CareerOpenBaseInvitationDetail extends AlipayObject {

	private static final long serialVersionUID = 6624531521277471459L;

	/**
	 * sm4加密后的手机号密文
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部平台的岗位id
	 */
	@ApiField("out_job_id")
	private String outJobId;

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

}
