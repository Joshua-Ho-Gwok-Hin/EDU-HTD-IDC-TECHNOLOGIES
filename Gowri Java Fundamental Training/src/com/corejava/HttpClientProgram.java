package com.corejava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

public class HttpClientProgram {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        var httpRequest = HttpRequest.newBuilder(URI.create("https://joshua.hgh.sg"))
                .build();

        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());
//        HttpHeaders httpHeaders = httpResponse.headers();
//
//        httpHeaders.map()
//                .forEach((k,v)->{
//                    System.out.printf("%s : %s%n", k, v);
//                });
//
//        Date date = new Date();
//        System.out.printf("%tT",date);


//        HttpClient client = HttpClient.newHttpClient(); // creating httpclient
//        HttpRequest request = HttpRequest.newBuilder()
//                        .uri(URI.create("https://yahoo.com"))//we specify the URI and the request method to create. Sets this HtpRequest(uri(UR))
//                        .GET()      // get request to the google.com website and retrieve an http response, we get the status code
//                        .build();// build and return on HttpRequest
//
//        HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding()); // send to request
//        System.out.println(response.statusCode());
//
//        var requestVar = HttpRequest.newBuilder(URI.create("http://google.com"))
//                .method("HEAD", HttpRequest.BodyPublishers.noBody())
//                .GET()
//                .build();
//
//        HttpResponse<Void> responseVar = client.send(requestVar, HttpResponse.BodyHandlers.discarding());
//
//        HttpHeaders httpHeaders = responseVar.headers();
//        System.out.println(httpHeaders);
//        httpHeaders.map().
//                forEach((k, val)->{
//            System.out.printf("%s : %s%n",k, val);
//        });

    }
}
