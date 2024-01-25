package edu.grcy.patterns.creational.builder;

import java.util.Arrays;
import java.util.List;

public class HouseBuilderDemo {
    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder("bloczki", "solbet", "blacha").build();

        House villageHouse = new House.HouseBuilder("wylewany", "cegła", "papodachówka")
                .withGarden("działka na warzywa").build();

        House residence = new House.HouseBuilder("wylewany + bloczki", "bale drewniane", "dachówka")
                .withGarden("park z basenem")
                .withGarage("wolnostojący, dwustanowiskowy").build();

        House mediumHouse = new House.HouseBuilder("bloczki", "max", "blacha")
                .withGarage("w bryle budynku")
                .withGarden("plac zabaw i mała rabatka").build();

        List<House> houses = Arrays.asList(smallHouse, villageHouse, residence, mediumHouse);
        houses.forEach(x -> System.out.println("\n" + x.getHouseInfo()));
    }
}
