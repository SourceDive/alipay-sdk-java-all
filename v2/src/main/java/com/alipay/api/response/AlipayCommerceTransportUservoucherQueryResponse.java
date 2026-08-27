package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAvailableVoucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.uservoucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 16:44:45
 */
public class AlipayCommerceTransportUservoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1787127968949722224L;

	/** 
	 * null
	 */
	@ApiListField("user_available_voucher_list")
	@ApiField("user_available_voucher")
	private List<UserAvailableVoucher> userAvailableVoucherList;

	public void setUserAvailableVoucherList(List<UserAvailableVoucher> userAvailableVoucherList) {
		this.userAvailableVoucherList = userAvailableVoucherList;
	}
	public List<UserAvailableVoucher> getUserAvailableVoucherList( ) {
		return this.userAvailableVoucherList;
	}

}
