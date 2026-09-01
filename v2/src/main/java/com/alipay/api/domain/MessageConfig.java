package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消息配置
 *
 * @author auto create
 * @since 1.0, 2026-08-26 19:23:14
 */
public class MessageConfig extends AlipayObject {

	private static final long serialVersionUID = 5719588859718749538L;

	/**
	 * null
	 */
	@ApiListField("channels")
	@ApiField("channels")
	private List<Channels> channels;

	/**
	 * 消息分发渠道
	 */
	@ApiField("dispatch_mode")
	private String dispatchMode;

	public List<Channels> getChannels() {
		return this.channels;
	}
	public void setChannels(List<Channels> channels) {
		this.channels = channels;
	}

	public String getDispatchMode() {
		return this.dispatchMode;
	}
	public void setDispatchMode(String dispatchMode) {
		this.dispatchMode = dispatchMode;
	}

}
