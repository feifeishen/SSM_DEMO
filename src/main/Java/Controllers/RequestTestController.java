package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @GetMapping()
    public String TestString(){
        
        return "12366666666";
    }
}