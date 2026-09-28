package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可售档位
 *
 * @author auto create
 * @since 1.0, 2026-09-25 14:47:53
 */
public class ChargeOption extends AlipayObject {

	private static final long serialVersionUID = 4571211318179123682L;

	/**
	 * 档位名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 时长包周期类型
	 */
	@ApiField("duration_period")
	private String durationPeriod;

	/**
	 * 展示价格，十进制，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 额度数量
	 */
	@ApiField("quota_amount")
	private Long quotaAmount;

	/**
	 * 档位标识
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDurationPeriod() {
		return this.durationPeriod;
	}
	public void setDurationPeriod(String durationPeriod) {
		this.durationPeriod = durationPeriod;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(Long quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
