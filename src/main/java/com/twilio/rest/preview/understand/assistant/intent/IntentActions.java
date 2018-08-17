/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.assistant.intent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntentActions extends Resource {
    private static final long serialVersionUID = 63970937403403L;

    /**
     * Create a IntentActionsFetcher to execute fetch.
     * 
     * @param pathAssistantSid The assistant_sid
     * @param pathIntentSid The intent_sid
     * @return IntentActionsFetcher capable of executing the fetch
     */
    public static IntentActionsFetcher fetcher(final String pathAssistantSid, 
                                               final String pathIntentSid) {
        return new IntentActionsFetcher(pathAssistantSid, pathIntentSid);
    }

    /**
     * Create a IntentActionsUpdater to execute update.
     * 
     * @param pathAssistantSid The assistant_sid
     * @param pathIntentSid The intent_sid
     * @return IntentActionsUpdater capable of executing the update
     */
    public static IntentActionsUpdater updater(final String pathAssistantSid, 
                                               final String pathIntentSid) {
        return new IntentActionsUpdater(pathAssistantSid, pathIntentSid);
    }

    /**
     * Converts a JSON String into a IntentActions object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return IntentActions object represented by the provided JSON
     */
    public static IntentActions fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, IntentActions.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a IntentActions object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return IntentActions object represented by the provided JSON
     */
    public static IntentActions fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, IntentActions.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String assistantSid;
    private final String intentSid;
    private final URI url;
    private final Map<String, Object> data;

    @JsonCreator
    private IntentActions(@JsonProperty("account_sid")
                          final String accountSid, 
                          @JsonProperty("assistant_sid")
                          final String assistantSid, 
                          @JsonProperty("intent_sid")
                          final String intentSid, 
                          @JsonProperty("url")
                          final URI url, 
                          @JsonProperty("data")
                          final Map<String, Object> data) {
        this.accountSid = accountSid;
        this.assistantSid = assistantSid;
        this.intentSid = intentSid;
        this.url = url;
        this.data = data;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The assistant_sid.
     * 
     * @return The assistant_sid
     */
    public final String getAssistantSid() {
        return this.assistantSid;
    }

    /**
     * Returns The The intent_sid.
     * 
     * @return The intent_sid
     */
    public final String getIntentSid() {
        return this.intentSid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The The data.
     * 
     * @return The data
     */
    public final Map<String, Object> getData() {
        return this.data;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IntentActions other = (IntentActions) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(assistantSid, other.assistantSid) && 
               Objects.equals(intentSid, other.intentSid) && 
               Objects.equals(url, other.url) && 
               Objects.equals(data, other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            assistantSid,
                            intentSid,
                            url,
                            data);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("assistantSid", assistantSid)
                          .add("intentSid", intentSid)
                          .add("url", url)
                          .add("data", data)
                          .toString();
    }
}