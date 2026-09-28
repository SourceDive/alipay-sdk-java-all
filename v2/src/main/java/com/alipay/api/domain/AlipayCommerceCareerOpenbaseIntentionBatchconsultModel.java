package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 晓叶AI意向雷达批量咨询
 *
 * @author auto create
 * @since 1.0, 2026-09-24 10:52:52
 */
public class AlipayCommerceCareerOpenbaseIntentionBatchconsultModel extends AlipayObject {

	private static final long serialVersionUID = 1259824356755367226L;

	/**
	 * null
	 */
	@ApiListField("batch_details")
	@ApiField("career_open_base_intention_ladar_batch_detail")
	private List<CareerOpenBaseIntentionLadarBatchDetail> batchDetails;

	/**
	 * 外部批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public List<CareerOpenBaseIntentionLadarBatchDetail> getBatchDetails() {
		return this.batchDetails;
	}
	public void setBatchDetails(List<CareerOpenBaseIntentionLadarBatchDetail> batchDetails) {
		this.batchDetails = batchDetails;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

}
