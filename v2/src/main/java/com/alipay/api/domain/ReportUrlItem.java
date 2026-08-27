package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告链接(status=COMPLETED 时返回)
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:17:29
 */
public class ReportUrlItem extends AlipayObject {

	private static final long serialVersionUID = 4187927155657114231L;

	/**
	 * 报告文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 报告链接路径
	 */
	@ApiField("url")
	private String url;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
