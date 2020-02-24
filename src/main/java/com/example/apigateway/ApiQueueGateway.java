/**
 * null
 */
package com.example.apigateway;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.example.apigateway.model.*;

/**
 * Interface for accessing ApiQueueGateway.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ApiQueueGateway {

    /**
     * @param postMessagesRequest
     * @return Result of the PostMessages operation returned by the service.
     * @sample ApiQueueGateway.PostMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kslxd3eut5-2020-02-22T08:29:05Z/PostMessages"
     *      target="_top">AWS API Documentation</a>
     */
    PostMessagesResult postMessages(PostMessagesRequest postMessagesRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ApiQueueGatewayClientBuilder builder() {
        return new ApiQueueGatewayClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
