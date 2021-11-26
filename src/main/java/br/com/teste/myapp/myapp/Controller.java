package br.com.teste.myapp.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller {

    private String podName = System.getenv("MY_POD_NAME");

    private String nameSpace = System.getenv("MY_POD_NAMESPACE");

    private String podIP = System.getenv("MY_POD_IP");

    @GetMapping
    public String getResponse() {
        return String.format("HELLO BOB !!!! POD_NAME: %s NAMESPACE: %s POD_IP: %s", podName, nameSpace, podIP);
//        return "Batatinha frita 123";
    }
}
