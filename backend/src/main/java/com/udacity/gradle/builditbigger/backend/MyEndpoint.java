package com.udacity.gradle.builditbigger.backend;

import com.example.android.cornyjokes.CornyJokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

//A simple endpoint method
    @ApiMethod(name = "getCloudJoke")
    public EndpointJokes getCloudJoke() {
        CornyJokes corn = new CornyJokes();
        String jokeagainn = corn.getCornyJokes();

        EndpointJokes joke = new EndpointJokes();
        joke.setEndpointJoke(jokeagainn);
        return joke;
    }


}
