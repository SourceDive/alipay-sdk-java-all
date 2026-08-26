package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下物料卡
 *
 * @author auto create
 * @since 1.0, 2026-08-25 20:51:51
 */
public class YpzOfflineQrCodeCardOne extends AlipayObject {

	private static final long serialVersionUID = 8218282888169181164L;

	/**
	 * 图片URL
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 跳转URL
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
