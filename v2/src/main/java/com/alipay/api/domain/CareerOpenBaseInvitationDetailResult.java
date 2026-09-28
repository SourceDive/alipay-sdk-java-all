package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-24 13:54:03
 */
public class CareerOpenBaseInvitationDetailResult extends AlipayObject {

	private static final long serialVersionUID = 5898583138457191956L;

	/**
	 * 业务描述信息
	 */
	@ApiField("desc_msg")
	private String descMsg;

	/**
	 * 业务明细执行状态
	 */
	@ApiField("detail_status")
	private String detailStatus;

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

	public String getDescMsg() {
		return this.descMsg;
	}
	public void setDescMsg(String descMsg) {
		this.descMsg = descMsg;
	}

	public String getDetailStatus() {
		return this.detailStatus;
	}
	public void setDetailStatus(String detailStatus) {
		this.detailStatus = detailStatus;
	}

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
