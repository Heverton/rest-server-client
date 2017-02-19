# rest-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.pakcage.example</groupId>
    <artifactId>rest-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.pakcage.example:rest-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rest-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.pakcage.example.rest_client.*;
import com.pakcage.example.rest_client.auth.*;
import com.pakcage.example.rest_client.model.*;
import com.pakcage.example.rest_client.api.EchoApi;

import java.io.File;
import java.util.*;

public class EchoApiExample {

    public static void main(String[] args) {
        
        EchoApi apiInstance = new EchoApi();
        String message = "message_example"; // String | 
        String headerParam = "headerParam_example"; // String | 
        try {
            EchoResponse result = apiInstance.echo(message, headerParam);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EchoApi#echo");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EchoApi* | [**echo**](docs/EchoApi.md#echo) | **GET** /echo | 


## Documentation for Models

 - [EchoResponse](docs/EchoResponse.md)
 - [Error](docs/Error.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



