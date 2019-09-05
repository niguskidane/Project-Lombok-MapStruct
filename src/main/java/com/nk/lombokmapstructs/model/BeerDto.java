package com.nk.lombokmapstructs.model;

import lombok.*;

import java.util.UUID;

@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;


    public static void main(String [] args){
        BeerDto beerDto=new BeerDto();
        beerDto.beerName="Dashen";
        beerDto.beerStyle="Cane";
        beerDto.upc=110l;
        beerDto.id=UUID.randomUUID();

        System.out.println("The BeerDTO Object is : "+beerDto);
    }
}
