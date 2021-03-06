package br.com.gabryel.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageRestController {

    @Value("${message:Hello, someone!}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return message;
    }
}
