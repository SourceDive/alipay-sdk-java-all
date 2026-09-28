package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 晓叶AI定向邀约明细信息批量查询
 *
 * @author auto create
 * @since 1.0, 2026-09-24 13:54:03
 */
public class AlipayCommerceCareerOpenbaseInvitationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7499879839638447399L;

	/**
	 * 平台批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 外部批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/**
	 * 外部业务明细单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
