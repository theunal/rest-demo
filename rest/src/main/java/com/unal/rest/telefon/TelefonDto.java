package com.unal.rest.telefon;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefonDto { //id number price

    private Long id;
    private String number;
    private double price;
}
