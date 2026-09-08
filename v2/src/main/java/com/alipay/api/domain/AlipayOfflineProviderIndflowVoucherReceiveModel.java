package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 领奖二阶段receive接口
 *
 * @author auto create
 * @since 1.0, 2026-09-02 14:52:48
 */
public class AlipayOfflineProviderIndflowVoucherReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 8843852448767645344L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 发奖记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * null
	 */
	@ApiListField("send_order_ids")
	@ApiField("string")
	private List<String> sendOrderIds;

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public List<String> getSendOrderIds() {
		return this.sendOrderIds;
	}
	public void setSendOrderIds(List<String> sendOrderIds) {
		this.sendOrderIds = sendOrderIds;
	}

}
