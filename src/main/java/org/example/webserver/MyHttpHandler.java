package org.example.webserver;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class MyHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        String requestParamValue = null;

        if("GET".equals(httpExchange.getRequestMethod())){
            requestParamValue = handleGetRequest(httpExchange);
        } else if("POST".equals(httpExchange)){
            requestParamValue = handlePostRequest(httpExchange);
        }


        handleResponse(httpExchange, requestParamValue);

    }

    private String handleGetRequest (HttpExchange httpExchange){
        return httpExchange.getRequestURI().toString().split("//?")[1].split("=")[1];
    }

    private String handlePostRequest (HttpExchange httpExchange){
        return httpExchange.getRequestURI().toString().split("//?")[1].split("=")[1];
    }

    private void handleResponse(HttpExchange httpExchange, String requestParamValue) throws IOException {

        OutputStream outputStream = httpExchange.getResponseBody();

//        StringBuilder htmlBuilder = new StringBuilder();

//        htmlBuilder.append("").append("").append("<h1>").append("Hello ").append(requestParamValue).append("</h1>").append("").append("");

        String s = "<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"UTF-8\"> <title>Java sample</title> </head>";
        String out = s+"<h1> Hello my favorite and dear friend! "+ requestParamValue+"</h1>";

//        String htmlResponse = StringEscapeUtils.escapeHtml4(htmlBuilder.toString());
//        String htmlResponse = StringEscapeUtils.escapeHtml4(out);

        String htmlResponse = s+out;

        httpExchange.sendResponseHeaders(200, htmlResponse.length());

        outputStream.write(htmlResponse.getBytes());
        outputStream.flush();
        outputStream.close();;

    }

}
