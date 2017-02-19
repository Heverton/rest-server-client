/*
 * Echo API
 * Simple Rest Echo
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.pakcage.example.rest_client.api;

import com.sun.jersey.api.client.GenericType;

import com.pakcage.example.rest_client.ApiException;
import com.pakcage.example.rest_client.ApiClient;
import com.pakcage.example.rest_client.Configuration;
import com.pakcage.example.rest_client.model.*;
import com.pakcage.example.rest_client.Pair;

import com.pakcage.example.rest_client.model.EchoResponse;
import com.pakcage.example.rest_client.model.Error;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-18T20:59:08.836+04:00")
public class EchoApi {
  private ApiClient apiClient;

  public EchoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EchoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Returns the &#39;message&#39; to the caller
   * @param message message (required)
   * @return EchoResponse
   * @throws ApiException if fails to make API call
   */
  public EchoResponse echo(String message) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling echo");
    }
    
    // create path and map variables
    String localVarPath = "/echo/{message}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "message" + "\\}", apiClient.escapeString(message.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<EchoResponse> localVarReturnType = new GenericType<EchoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
