package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChargeOption;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpaydirect.charge.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-25 14:47:53
 */
public class AlipayAipayNowpaydirectChargeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3563863573972536873L;

	/** 
	 * 最终收费模式
	 */
	@ApiField("billing_mode")
	private String billingMode;

	/** 
	 * 商品状态
	 */
	@ApiField("capability_status")
	private String capabilityStatus;

	/** 
	 * 可售档位
	 */
	@ApiField("charging_options")
	private ChargeOption chargingOptions;

	/** 
	 * 使用该地址进入商品管理
	 */
	@ApiField("management_url")
	private String managementUrl;

	/** 
	 * 商品图标
	 */
	@ApiField("product_icon_url")
	private String productIconUrl;

	/** 
	 * 商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/** 
	 * 额度包单位
	 */
	@ApiField("quota_unit")
	private String quotaUnit;

	public void setBillingMode(String billingMode) {
		this.billingMode = billingMode;
	}
	public String getBillingMode( ) {
		return this.billingMode;
	}

	public void setCapabilityStatus(String capabilityStatus) {
		this.capabilityStatus = capabilityStatus;
	}
	public String getCapabilityStatus( ) {
		return this.capabilityStatus;
	}

	public void setChargingOptions(ChargeOption chargingOptions) {
		this.chargingOptions = chargingOptions;
	}
	public ChargeOption getChargingOptions( ) {
		return this.chargingOptions;
	}

	public void setManagementUrl(String managementUrl) {
		this.managementUrl = managementUrl;
	}
	public String getManagementUrl( ) {
		return this.managementUrl;
	}

	public void setProductIconUrl(String productIconUrl) {
		this.productIconUrl = productIconUrl;
	}
	public String getProductIconUrl( ) {
		return this.productIconUrl;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName( ) {
		return this.productName;
	}

	public void setQuotaUnit(String quotaUnit) {
		this.quotaUnit = quotaUnit;
	}
	public String getQuotaUnit( ) {
		return this.quotaUnit;
	}

}
