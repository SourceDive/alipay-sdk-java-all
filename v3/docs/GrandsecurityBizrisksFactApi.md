# GrandsecurityBizrisksFactApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**check**](GrandsecurityBizrisksFactApi.md#check) | **POST** /v3/stream/grandsecurity/bizrisks/fact/check | 事实核查服务 |


<a name="check"></a>
# **check**
> GrandsecurityBizrisksFactCheckResponseModel check(grandsecurityBizrisksFactCheckModel)

事实核查服务

模型接口将根据前端返回的问题（query），基于真假结论、核心摘要、推理过程、相关证据、警告、机构名称等，将以上字段梳理为综合判定、判断依据、结论、研处意见及参考资料的四大模块结构，并传至前端提供C端。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.GrandsecurityBizrisksFactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    GrandsecurityBizrisksFactApi apiInstance = new GrandsecurityBizrisksFactApi(defaultClient);
    GrandsecurityBizrisksFactCheckModel grandsecurityBizrisksFactCheckModel = new GrandsecurityBizrisksFactCheckModel(); // GrandsecurityBizrisksFactCheckModel | 
    try {
      GrandsecurityBizrisksFactCheckResponseModel result = apiInstance.check(grandsecurityBizrisksFactCheckModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GrandsecurityBizrisksFactApi#check");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grandsecurityBizrisksFactCheckModel** | **GrandsecurityBizrisksFactCheckModel**|  | [optional] |

### Return type

**GrandsecurityBizrisksFactCheckResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

