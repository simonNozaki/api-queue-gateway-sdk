/**
 * null
 */
package com.example.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kslxd3eut5-2020-02-22T08:29:05Z/PostMessages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostMessagesRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String messageBody;

    private String messageDeduplicationId;

    private String messageGroupId;

    /**
     * @param messageBody
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * @return
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * @param messageBody
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostMessagesRequest messageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * @param messageDeduplicationId
     */

    public void setMessageDeduplicationId(String messageDeduplicationId) {
        this.messageDeduplicationId = messageDeduplicationId;
    }

    /**
     * @return
     */

    public String getMessageDeduplicationId() {
        return this.messageDeduplicationId;
    }

    /**
     * @param messageDeduplicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostMessagesRequest messageDeduplicationId(String messageDeduplicationId) {
        setMessageDeduplicationId(messageDeduplicationId);
        return this;
    }

    /**
     * @param messageGroupId
     */

    public void setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    /**
     * @return
     */

    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    /**
     * @param messageGroupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostMessagesRequest messageGroupId(String messageGroupId) {
        setMessageGroupId(messageGroupId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessageBody() != null)
            sb.append("MessageBody: ").append(getMessageBody()).append(",");
        if (getMessageDeduplicationId() != null)
            sb.append("MessageDeduplicationId: ").append(getMessageDeduplicationId()).append(",");
        if (getMessageGroupId() != null)
            sb.append("MessageGroupId: ").append(getMessageGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostMessagesRequest == false)
            return false;
        PostMessagesRequest other = (PostMessagesRequest) obj;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getMessageDeduplicationId() == null ^ this.getMessageDeduplicationId() == null)
            return false;
        if (other.getMessageDeduplicationId() != null && other.getMessageDeduplicationId().equals(this.getMessageDeduplicationId()) == false)
            return false;
        if (other.getMessageGroupId() == null ^ this.getMessageGroupId() == null)
            return false;
        if (other.getMessageGroupId() != null && other.getMessageGroupId().equals(this.getMessageGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode + ((getMessageDeduplicationId() == null) ? 0 : getMessageDeduplicationId().hashCode());
        hashCode = prime * hashCode + ((getMessageGroupId() == null) ? 0 : getMessageGroupId().hashCode());
        return hashCode;
    }

    @Override
    public PostMessagesRequest clone() {
        return (PostMessagesRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostMessagesRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
