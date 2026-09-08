package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdVoucherPrizeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.indflow.prize.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 14:57:52
 */
public class AlipayOfflineProviderIndflowPrizeRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5829434186748362898L;

	/** 
	 * 推荐奖品详情
	 */
	@ApiField("recommend_prizes")
	private AdVoucherPrizeDetail recommendPrizes;

	/** 
	 * 发奖记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecommendPrizes(AdVoucherPrizeDetail recommendPrizes) {
		this.recommendPrizes = recommendPrizes;
	}
	public AdVoucherPrizeDetail getRecommendPrizes( ) {
		return this.recommendPrizes;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
