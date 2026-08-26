package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查面试状态与结果
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:17:29
 */
public class AlipayEbppJobinterviewInterviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7728334947771134217L;

	/**
	 * 候选人唯一ID（即创建会话时下发的 candidateId），空则报"候选人ID不能为空"
	 */
	@ApiField("candidate_id")
	private String candidateId;

	/**
	 * 租户ID，接入方统一租户标识，空则报"租户ID不能为空"
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getCandidateId() {
		return this.candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
