package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solution.batch.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-24 10:52:50
 */
public class AlipayMerchantSolutionBatchCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4713165952664368776L;

	/** 
	 * 退出成功后，在支付宝侧生成的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

}
