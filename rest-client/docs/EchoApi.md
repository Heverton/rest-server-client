# EchoApi

All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**echo**](EchoApi.md#echo) | **GET** /echo/{message} | 


<a name="echo"></a>
# **echo**
> EchoResponse echo(message)



Returns the &#39;message&#39; to the caller

### Example
```java
// Import classes:
//import com.pakcage.example.rest_client.ApiException;
//import com.pakcage.example.rest_client.api.EchoApi;


EchoApi apiInstance = new EchoApi();
String message = "message_example"; // String | message
try {
    EchoResponse result = apiInstance.echo(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EchoApi#echo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **String**| message |

### Return type

[**EchoResponse**](EchoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

