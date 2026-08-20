package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通行费统计
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:51:43
 */
public class EtcTollFeeTollStatsDTO extends AlipayObject {

	private static final long serialVersionUID = 2279524893479754186L;

	/**
	 * 平均通行费(元）
	 */
	@ApiField("avg")
	private String avg;

	/**
	 * 最小通行费(元）
	 */
	@ApiField("max")
	private String max;

	/**
	 * 中位数通行费(元）
	 */
	@ApiField("median")
	private String median;

	/**
	 * 最小通行费(元）
	 */
	@ApiField("min")
	private String min;

	/**
	 * TOP three通行费分布
	 */
	@ApiListField("top_three")
	@ApiField("etc_toll_fee_top_three_d_t_o")
	private List<EtcTollFeeTopThreeDTO> topThree;

	public String getAvg() {
		return this.avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getMax() {
		return this.max;
	}
	public void setMax(String max) {
		this.max = max;
	}

	public String getMedian() {
		return this.median;
	}
	public void setMedian(String median) {
		this.median = median;
	}

	public String getMin() {
		return this.min;
	}
	public void setMin(String min) {
		this.min = min;
	}

	public List<EtcTollFeeTopThreeDTO> getTopThree() {
		return this.topThree;
	}
	public void setTopThree(List<EtcTollFeeTopThreeDTO> topThree) {
		this.topThree = topThree;
	}

}
