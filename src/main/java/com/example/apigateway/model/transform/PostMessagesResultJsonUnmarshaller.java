/**
 * null
 */
package com.example.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.example.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostMessagesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostMessagesResultJsonUnmarshaller implements Unmarshaller<PostMessagesResult, JsonUnmarshallerContext> {

    public PostMessagesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostMessagesResult postMessagesResult = new PostMessagesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postMessagesResult;
        }

        while (true) {
            if (token == null)
                break;

            postMessagesResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postMessagesResult;
    }

    private static PostMessagesResultJsonUnmarshaller instance;

    public static PostMessagesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostMessagesResultJsonUnmarshaller();
        return instance;
    }
}
