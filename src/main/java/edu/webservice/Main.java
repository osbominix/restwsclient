package edu.webservice;
import com.sun.jersey.api.client.*;

public class Main {

    public static void main(String[] args) {
        Client c = Client.create();
        WebResource resource = c.resource("http://localhost:8080/myapp/myresource");
        String response = resource.get(String.class);
        System.out.println(response);
    }
}

