/**
 * null
 */
package com.example.apigateway;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.example.apigateway.ApiQueueGateway}.
 * 
 * @see com.example.apigateway.ApiQueueGateway#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ApiQueueGatewayClientBuilder extends SdkSyncClientBuilder<ApiQueueGatewayClientBuilder, ApiQueueGateway> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("kslxd3eut5.execute-api.ap-northeast-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "ap-northeast-1";

    /**
     * Package private constructor - builder should be created via {@link ApiQueueGateway#builder()}
     */
    ApiQueueGatewayClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of ApiQueueGateway using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ApiQueueGateway.
     */
    @Override
    protected ApiQueueGateway build(AwsSyncClientParams params) {
        return new ApiQueueGatewayClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
