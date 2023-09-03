package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    private static final String POST_API_URL="https://api.nationalize.io/?name=nathaniel";
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request=HttpRequest.newBuilder()
                .GET()
                .header("accept","application/json")
                 .uri(URI.create(
                        POST_API_URL)).build();
        HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
          System.out.println(response.body());
    }
}