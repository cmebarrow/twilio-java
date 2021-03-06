/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class CompositionHookTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VIDEO.toString(),
                                          "/v1/CompositionHooks/HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CompositionHook.fetcher("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"My composition hook\",\"enabled\": true,\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:01:33Z\",\"sid\": \"HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"audio_sources\": [\"user*\"],\"audio_sources_excluded\": [\"moderator*\"],\"video_layout\": {\"grid\": {\"video_sources\": [\"*\"],\"video_sources_excluded\": [\"moderator*\"],\"reuse\": \"show_oldest\",\"x_pos\": 100,\"y_pos\": 600,\"z_pos\": 10,\"width\": 0,\"height\": 0,\"max_columns\": 0,\"max_rows\": 0,\"cells_excluded\": []},\"pip\": {\"video_sources\": [\"student*\"],\"video_sources_excluded\": [],\"reuse\": \"none\",\"x_pos\": 100,\"y_pos\": 600,\"z_pos\": 10,\"width\": 0,\"height\": 0,\"max_columns\": 0,\"max_rows\": 0,\"cells_excluded\": []}},\"resolution\": \"1280x720\",\"format\": \"webm\",\"trim\": true,\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"url\": \"https://video.twilio.com/v1/CompositionHooks/HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CompositionHook.fetcher("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VIDEO.toString(),
                                          "/v1/CompositionHooks");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CompositionHook.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"composition_hooks\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://video.twilio.com/v1/CompositionHooks?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://video.twilio.com/v1/CompositionHooks?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"composition_hooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CompositionHook.reader().read());
    }

    @Test
    public void testReadResultsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"composition_hooks\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"My Special Hook1\",\"enabled\": true,\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:01:33Z\",\"sid\": \"HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"audio_sources\": [\"*\"],\"audio_sources_excluded\": [],\"video_layout\": {\"grid\": {\"video_sources\": [\"*\"],\"video_sources_excluded\": [\"moderator*\"],\"reuse\": \"show_oldest\",\"x_pos\": 100,\"y_pos\": 600,\"z_pos\": 10,\"width\": 0,\"height\": 0,\"max_columns\": 0,\"max_rows\": 0,\"cells_excluded\": []},\"pip\": {\"video_sources\": [\"student*\"],\"video_sources_excluded\": [],\"reuse\": \"none\",\"x_pos\": 100,\"y_pos\": 600,\"z_pos\": 10,\"width\": 0,\"height\": 0,\"max_columns\": 0,\"max_rows\": 0,\"cells_excluded\": []}},\"resolution\": \"1280x720\",\"format\": \"webm\",\"trim\": true,\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"url\": \"https://video.twilio.com/v1/CompositionHooks/HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://video.twilio.com/v1/CompositionHooks?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://video.twilio.com/v1/CompositionHooks?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"composition_hooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CompositionHook.reader().read());
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.VIDEO.toString(),
                                          "/v1/CompositionHooks/HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CompositionHook.deleter("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        CompositionHook.deleter("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VIDEO.toString(),
                                          "/v1/CompositionHooks");
            request.addPostParam("FriendlyName", serialize("friendly_name"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CompositionHook.creator("friendly_name").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"friendly_name\": \"My composition hook\",\"enabled\": false,\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": null,\"sid\": \"HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"audio_sources\": [\"user*\",\"moderator\"],\"audio_sources_excluded\": [\"admin\"],\"video_layout\": {\"custom\": {\"video_sources\": [\"user*\"],\"video_sources_excluded\": [\"moderator\"],\"reuse\": \"show_oldest\",\"x_pos\": 100,\"y_pos\": 600,\"z_pos\": 10,\"width\": 800,\"height\": 0,\"max_columns\": 0,\"max_rows\": 0,\"cells_excluded\": [2,3]}},\"trim\": true,\"format\": \"mp4\",\"resolution\": \"1280x720\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"url\": \"https://video.twilio.com/v1/CompositionHooks/HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        CompositionHook.creator("friendly_name").create();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VIDEO.toString(),
                                          "/v1/CompositionHooks/HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addPostParam("FriendlyName", serialize("friendly_name"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CompositionHook.updater("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "friendly_name").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateAllFieldsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"friendly_name\": \"My composition hook\",\"enabled\": true,\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"sid\": \"HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"audio_sources\": [\"user*\",\"moderator\"],\"audio_sources_excluded\": [\"admin\"],\"video_layout\": {\"custom\": {\"video_sources\": [\"user*\"],\"video_sources_excluded\": [\"moderator\"],\"reuse\": \"show_oldest\",\"x_pos\": 100,\"y_pos\": 600,\"z_pos\": 10,\"width\": 800,\"height\": 0,\"max_columns\": 0,\"max_rows\": 0,\"cells_excluded\": [2,3]}},\"trim\": true,\"format\": \"mp4\",\"resolution\": \"1280x720\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"url\": \"https://video.twilio.com/v1/CompositionHooks/HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        CompositionHook.updater("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "friendly_name").update();
    }

    @Test
    public void testUpdateWithDefaultsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"friendly_name\": \"My composition hook\",\"enabled\": true,\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"sid\": \"HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"audio_sources\": [\"user*\",\"moderator\"],\"audio_sources_excluded\": [\"admin\"],\"video_layout\": {},\"trim\": true,\"format\": \"mp4\",\"resolution\": \"1280x720\",\"status_callback\": null,\"status_callback_method\": \"POST\",\"url\": \"https://video.twilio.com/v1/CompositionHooks/HKaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        CompositionHook.updater("HKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "friendly_name").update();
    }
}