/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.proxy.v1.service;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ShortCodeUpdater extends Updater<ShortCode> {
    private final String pathServiceSid;
    private final String pathSid;
    private Boolean isReserved;

    /**
     * Construct a new ShortCodeUpdater.
     * 
     * @param pathServiceSid The SID of the Service to update the resource from
     * @param pathSid The unique string that identifies the resource
     */
    public ShortCodeUpdater(final String pathServiceSid, 
                            final String pathSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathSid = pathSid;
    }

    /**
     * Whether the short code should be reserved and not be assigned to a
     * participant using proxy pool logic. See [Reserved Phone
     * Numbers](https://www.twilio.com/docs/proxy/reserved-phone-numbers) for more
     * information..
     * 
     * @param isReserved Whether the short code should be reserved for manual
     *                   assignment to participants only
     * @return this
     */
    public ShortCodeUpdater setIsReserved(final Boolean isReserved) {
        this.isReserved = isReserved;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated ShortCode
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public ShortCode update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PROXY.toString(),
            "/v1/Services/" + this.pathServiceSid + "/ShortCodes/" + this.pathSid + "",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ShortCode update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return ShortCode.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (isReserved != null) {
            request.addPostParam("IsReserved", isReserved.toString());
        }
    }
}