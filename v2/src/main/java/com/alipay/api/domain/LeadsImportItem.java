package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:57:51
 */
public class LeadsImportItem extends AlipayObject {

	private static final long serialVersionUID = 7733379394976918652L;

	/**
	 * 司机主要营运出租业务的城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 司机所属出租车公司 如果不填则默认为个体工商户
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 司机身份证号
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/**
	 * 司机名称
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机运营出租车牌照号码 可不填
	 */
	@ApiField("driver_plate")
	private String driverPlate;

	/**
	 * 在税务局登记的税号 可以是个人税号或者所属公司的税号
	 */
	@ApiField("driver_tax_no")
	private String driverTaxNo;

	/**
	 * 联系电话号码
	 */
	@ApiField("phone_one")
	private String phoneOne;

	/**
	 * 备用手机号
	 */
	@ApiField("phone_three")
	private String phoneThree;

	/**
	 * 备用手机号
	 */
	@ApiField("phone_two")
	private String phoneTwo;

	/**
	 * 录入人对本司机的备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 标识自己的数据来源 数值找支付宝端申请分配
	 */
	@ApiField("source")
	private String source;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDriverCertNo() {
		return this.driverCertNo;
	}
	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPlate() {
		return this.driverPlate;
	}
	public void setDriverPlate(String driverPlate) {
		this.driverPlate = driverPlate;
	}

	public String getDriverTaxNo() {
		return this.driverTaxNo;
	}
	public void setDriverTaxNo(String driverTaxNo) {
		this.driverTaxNo = driverTaxNo;
	}

	public String getPhoneOne() {
		return this.phoneOne;
	}
	public void setPhoneOne(String phoneOne) {
		this.phoneOne = phoneOne;
	}

	public String getPhoneThree() {
		return this.phoneThree;
	}
	public void setPhoneThree(String phoneThree) {
		this.phoneThree = phoneThree;
	}

	public String getPhoneTwo() {
		return this.phoneTwo;
	}
	public void setPhoneTwo(String phoneTwo) {
		this.phoneTwo = phoneTwo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
