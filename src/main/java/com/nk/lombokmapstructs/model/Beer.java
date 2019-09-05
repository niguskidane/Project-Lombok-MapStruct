package com.nk.lombokmapstructs.model;

import lombok.*;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Beer {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public static void main(String[] args){
        Beer beer=new Beer();
        beer.id=UUID.randomUUID();
        beer.beerName="Castle";
        beer.beerStyle="Bottle";
        beer.upc=100l;
        System.out.println("The Name of The Beer Object is: "+beer);


    }
}
