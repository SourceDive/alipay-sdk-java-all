package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CareerOpenBaseInvitationDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.openbase.invitation.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-24 13:54:03
 */
public class AlipayCommerceCareerOpenbaseInvitationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6517721789195425931L;

	/** 
	 * null
	 */
	@ApiListField("batch_details")
	@ApiField("career_open_base_invitation_detail_result")
	private List<CareerOpenBaseInvitationDetailResult> batchDetails;

	/** 
	 * 平台批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次状态
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 外部批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public void setBatchDetails(List<CareerOpenBaseInvitationDetailResult> batchDetails) {
		this.batchDetails = batchDetails;
	}
	public List<CareerOpenBaseInvitationDetailResult> getBatchDetails( ) {
		return this.batchDetails;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}
	public String getOutBatchNo( ) {
		return this.outBatchNo;
	}

}
