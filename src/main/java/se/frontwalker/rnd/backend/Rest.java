package se.frontwalker.rnd.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Rest {

    @CrossOrigin
    @GetMapping
    public String test() {
        System.out.println("Getting message");
        return "{\"message\": \"Hello from even newer backend\"}";
    }

}
