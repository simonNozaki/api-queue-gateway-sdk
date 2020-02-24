/**
 * null
 */
package com.example.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.example.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostMessagesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostMessagesRequestMarshaller {

    private static final MarshallingInfo<String> MESSAGEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("messageBody").build();
    private static final MarshallingInfo<String> MESSAGEDEDUPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("messageDeduplicationId").build();
    private static final MarshallingInfo<String> MESSAGEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("messageGroupId").build();

    private static final PostMessagesRequestMarshaller instance = new PostMessagesRequestMarshaller();

    public static PostMessagesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostMessagesRequest postMessagesRequest, ProtocolMarshaller protocolMarshaller) {

        if (postMessagesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postMessagesRequest.getMessageBody(), MESSAGEBODY_BINDING);
            protocolMarshaller.marshall(postMessagesRequest.getMessageDeduplicationId(), MESSAGEDEDUPLICATIONID_BINDING);
            protocolMarshaller.marshall(postMessagesRequest.getMessageGroupId(), MESSAGEGROUPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
