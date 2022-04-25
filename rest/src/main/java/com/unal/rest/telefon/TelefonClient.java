package com.unal.rest.telefon;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Log4j2
public class TelefonClient {

    // http://localhost:8080/tclient1
    @GetMapping("/tclient1")
    @ResponseBody
    public String tclient1() {
        // String url = "http://localhost:8080/trest1";
        String url = "https://api.github.com/users";
        RestTemplate template = new RestTemplate();

        return template.getForObject(url,String.class);
    }



    // http://localhost:8080/tclient2
    @GetMapping("/tclient2")
    @ResponseBody
    public String tclient2() {

        String url = "http://localhost:8080/trest2";

        RestTemplate template = new RestTemplate();
        TelefonDto telefonDto = template.getForObject(url,TelefonDto.class);



        return telefonDto+"";
    }
}
