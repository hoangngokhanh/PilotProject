package com.qsoft.pilotproject.rest;

import com.googlecode.androidannotations.annotations.rest.Accept;
import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Rest;
import com.googlecode.androidannotations.api.rest.MediaType;
import com.qsoft.pilotproject.model.ListFeed;
import com.qsoft.pilotproject.model.ResponseProfile;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * User: binhtv
 * Date: 11/11/13
 * Time: 9:37 AM
 */
@Rest(rootUrl = "http://113.160.50.84:1009/testing/ica467/trunk/public/", converters = {MappingJacksonHttpMessageConverter.class})
public interface OnlineDioRestClient
{
    @Get("home-rest?limit={limit}&offset={offset}&time_from={timeFrom}&time_to={timeTo}")
    @Accept(MediaType.APPLICATION_JSON)
    ListFeed getFeeds(String limit, String offset, String timeFrom, String timeTo);

    @Get("user-rest/{userId}")
    @Accept(MediaType.APPLICATION_JSON)
    public ResponseProfile getProfile(long userId);

    RestTemplate getRestTemplate();

    void setRestTemplate(RestTemplate restTemplate);
}
