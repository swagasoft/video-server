package simon.spring.datajpa.videodata.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class MyController {

    @GetMapping(value = "/")
    public String Hello(){
        return " hello " + LocalDateTime.now() + "    date" + LocalDate.now();
    }
}
