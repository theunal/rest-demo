package com.unal.rest.telefon;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class TelefonRest {

    // http://localhost:8080/trest1
    @GetMapping("/trest1")
    public String trest1() {

        return """
                {
                  "adı" : "yusuf",
                  "isLogin" : true,
                  "code" : 44
                }""";
    }


    // http://localhost:8080/trest2
    @GetMapping("/trest2")
    public TelefonDto trest2() {

        return TelefonDto
                .builder()
                .id(0L)
                .number("0574896187")
                .price(4500)
                .build();
    }

    // json
    // http://localhost:8080/trest3
    @GetMapping(value = "/trest3",produces = MediaType.APPLICATION_JSON_VALUE)
    public TelefonDto trest3() {

        return TelefonDto
                .builder()
                .id(0L)
                .number("0574896187")
                .price(4500)
                .build();
    }

    // xml
    // http://localhost:8080/trest4
    @GetMapping(value = "/trest4",produces = MediaType.APPLICATION_XML_VALUE)
    public TelefonDto trest4() {

        return TelefonDto
                .builder()
                .id(0L)
                .number("0574896187")
                .price(4500)
                .build();
    }

    // path variable
    // http://localhost:8080/trest5/9
    @GetMapping("/trest5/{id}")
    public TelefonDto trest5(@PathVariable(name = "id") Long id) {

        return TelefonDto
                .builder()
                .id(id)
                .number("0574896187")
                .price(4500)
                .build();
    }

    // path variable 2
    // http://localhost:8080/trest6/9
    @GetMapping({"/trest6/{id}", "/rest6"})
    public TelefonDto trest6(@PathVariable(name = "id",required = false) Long id) {
        TelefonDto telefonDto = null;
        if (id == null) {
            log.error("hata >> id : null");
        }else  {
            telefonDto = TelefonDto
                    .builder()
                    .id(id)
                    .number("asus")
                    .price(4500)
                    .build();
        }
        return telefonDto;
    }


    // http://localhost:8080/trest7
    @GetMapping("/trest7")
    public List<TelefonDto> trest7() {

        List<TelefonDto> list = new ArrayList<>();
        list.add(TelefonDto.builder().id(0L).number("14253697415").price(4500).build());
        list.add(TelefonDto.builder().id(1L).number("14253697415").price(9552).build());
        list.add(TelefonDto.builder().id(2L).number("14253697415").price(7486).build());
        list.add(TelefonDto.builder().id(3L).number("14253697415").price(13500).build());
        list.add(TelefonDto.builder().id(4L).number("14253697415").price(45896).build());
        return list;

    }
}
