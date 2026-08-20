package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceOperationShopDeviceCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.operation.shop.device.create request
 * 
 * @author auto create
 * @since 1.0, 2026-08-20 14:02:50
 */
public class AlipayCommerceOperationShopDeviceCreateRequest implements AlipayUploadRequest<AlipayCommerceOperationShopDeviceCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝行业 MCC 一级编码
	 */
	private String categoryL1;

	/** 
	* 支付宝行业 MCC 二级编码
	 */
	private String categoryL2;

	/** 
	* 地址版本：2022Q2
	 */
	private String cityCode;

	/** 
	* 城市名称
	 */
	private String cityName;

	/** 
	* 与营业执照一致
	 */
	private String companyName;

	/** 
	* 设备SN/序列号
	 */
	private String deviceId;

	/** 
	* 设备类型以及机型
	 */
	private String deviceType;

	/** 
	* 地址版本：2022Q2
	 */
	private String districtCode;

	/** 
	* 区县名称
	 */
	private String districtName;

	/** 
	* 使用流量币业务时建议传；未传或不正确时，可能影响流量币在闪购门店投放
	 */
	private String elemeDdShopId;

	/** 
	* 使用流量币业务时建议传；未传或不正确时，可能影响流量币在闪购门店投放
	 */
	private String elemeDdShopName;

	/** 
	* 例如 30.687181
	 */
	private String latitude;

	/** 
	* 法人身份证反面
	 */
	private FileItem legalIdentityBack;

	/** 
	* 格式：yyyy-MM-dd
	 */
	private String legalIdentityFromDate;

	/** 
	* 法人身份证正面
	 */
	private FileItem legalIdentityFront;

	/** 
	* 店铺法人身份证号
	 */
	private String legalIdentityNo;

	/** 
	* 格式：yyyy-MM-dd
	 */
	private String legalIdentityToDate;

	/** 
	* 法人名称
	 */
	private String legalName;

	/** 
	* 营业执照图片
	 */
	private FileItem licenseImg;

	/** 
	* 统一社会信用代码/注册号
	 */
	private String licenseNo;

	/** 
	* 例如 104.104887
	 */
	private String longitude;

	/** 
	* 门店在服务商系统里的商户名称
	 */
	private String merchantName;

	/** 
	* 门店在服务商系统里的唯一ID
	 */
	private String outShopId;

	/** 
	* 地址版本：2022Q2
	 */
	private String provinceCode;

	/** 
	* 省份名称
	 */
	private String provinceName;

	/** 
	* 详细地址
	 */
	private String shopAddress;

	/** 
	* 门店形象照，图片二进制流，10M内
	 */
	private FileItem shopLogo;

	/** 
	* 门店在服务商系统里的门店名称
	 */
	private String shopName;

	/** 
	* 门店联系电话
	 */
	private String shopPhone;

	/** 
	* 门头照，图片二进制流，10M内
	 */
	private FileItem shopPhoto;

	/** 
	* 默认传 physical_store
	 */
	private String shopType;

	/** 
	* 设备对应的 SMID，多个时按英文逗号隔开
	 */
	private String smids;

	/** 
	* 格式：yyyy-MM-dd
	 */
	private String validToDate;

	public void setCategoryL1(String categoryL1) {
		this.categoryL1 = categoryL1;
	}
	public String getCategoryL1() {
		return this.categoryL1;
	}

	public void setCategoryL2(String categoryL2) {
		this.categoryL2 = categoryL2;
	}
	public String getCategoryL2() {
		return this.categoryL2;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityName() {
		return this.cityName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return this.companyName;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getDistrictName() {
		return this.districtName;
	}

	public void setElemeDdShopId(String elemeDdShopId) {
		this.elemeDdShopId = elemeDdShopId;
	}
	public String getElemeDdShopId() {
		return this.elemeDdShopId;
	}

	public void setElemeDdShopName(String elemeDdShopName) {
		this.elemeDdShopName = elemeDdShopName;
	}
	public String getElemeDdShopName() {
		return this.elemeDdShopName;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude() {
		return this.latitude;
	}

	public void setLegalIdentityBack(FileItem legalIdentityBack) {
		this.legalIdentityBack = legalIdentityBack;
	}
	public FileItem getLegalIdentityBack() {
		return this.legalIdentityBack;
	}

	public void setLegalIdentityFromDate(String legalIdentityFromDate) {
		this.legalIdentityFromDate = legalIdentityFromDate;
	}
	public String getLegalIdentityFromDate() {
		return this.legalIdentityFromDate;
	}

	public void setLegalIdentityFront(FileItem legalIdentityFront) {
		this.legalIdentityFront = legalIdentityFront;
	}
	public FileItem getLegalIdentityFront() {
		return this.legalIdentityFront;
	}

	public void setLegalIdentityNo(String legalIdentityNo) {
		this.legalIdentityNo = legalIdentityNo;
	}
	public String getLegalIdentityNo() {
		return this.legalIdentityNo;
	}

	public void setLegalIdentityToDate(String legalIdentityToDate) {
		this.legalIdentityToDate = legalIdentityToDate;
	}
	public String getLegalIdentityToDate() {
		return this.legalIdentityToDate;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalName() {
		return this.legalName;
	}

	public void setLicenseImg(FileItem licenseImg) {
		this.licenseImg = licenseImg;
	}
	public FileItem getLicenseImg() {
		return this.licenseImg;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude() {
		return this.longitude;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName() {
		return this.merchantName;
	}

	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}
	public String getOutShopId() {
		return this.outShopId;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopLogo(FileItem shopLogo) {
		this.shopLogo = shopLogo;
	}
	public FileItem getShopLogo() {
		return this.shopLogo;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName() {
		return this.shopName;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}
	public String getShopPhone() {
		return this.shopPhone;
	}

	public void setShopPhoto(FileItem shopPhoto) {
		this.shopPhoto = shopPhoto;
	}
	public FileItem getShopPhoto() {
		return this.shopPhoto;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopType() {
		return this.shopType;
	}

	public void setSmids(String smids) {
		this.smids = smids;
	}
	public String getSmids() {
		return this.smids;
	}

	public void setValidToDate(String validToDate) {
		this.validToDate = validToDate;
	}
	public String getValidToDate() {
		return this.validToDate;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.commerce.operation.shop.device.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category_l_1", this.categoryL1);
		txtParams.put("category_l_2", this.categoryL2);
		txtParams.put("city_code", this.cityCode);
		txtParams.put("city_name", this.cityName);
		txtParams.put("company_name", this.companyName);
		txtParams.put("device_id", this.deviceId);
		txtParams.put("device_type", this.deviceType);
		txtParams.put("district_code", this.districtCode);
		txtParams.put("district_name", this.districtName);
		txtParams.put("eleme_dd_shop_id", this.elemeDdShopId);
		txtParams.put("eleme_dd_shop_name", this.elemeDdShopName);
		txtParams.put("latitude", this.latitude);
		txtParams.put("legal_identity_from_date", this.legalIdentityFromDate);
		txtParams.put("legal_identity_no", this.legalIdentityNo);
		txtParams.put("legal_identity_to_date", this.legalIdentityToDate);
		txtParams.put("legal_name", this.legalName);
		txtParams.put("license_no", this.licenseNo);
		txtParams.put("longitude", this.longitude);
		txtParams.put("merchant_name", this.merchantName);
		txtParams.put("out_shop_id", this.outShopId);
		txtParams.put("province_code", this.provinceCode);
		txtParams.put("province_name", this.provinceName);
		txtParams.put("shop_address", this.shopAddress);
		txtParams.put("shop_name", this.shopName);
		txtParams.put("shop_phone", this.shopPhone);
		txtParams.put("shop_type", this.shopType);
		txtParams.put("smids", this.smids);
		txtParams.put("valid_to_date", this.validToDate);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("legal_identity_back", this.legalIdentityBack);
		params.put("legal_identity_front", this.legalIdentityFront);
		params.put("license_img", this.licenseImg);
		params.put("shop_logo", this.shopLogo);
		params.put("shop_photo", this.shopPhoto);
		return params;
	}

	public Class<AlipayCommerceOperationShopDeviceCreateResponse> getResponseClass() {
		return AlipayCommerceOperationShopDeviceCreateResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
