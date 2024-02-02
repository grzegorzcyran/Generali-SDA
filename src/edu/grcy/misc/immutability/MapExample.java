package edu.grcy.misc.immutability;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");

        Map<Key, String> map = new HashMap<>();
        map.put(key1, "value1");
        map.put(key2, "value2");
        System.out.println(map);

        key2.setKey("key two"); //zmiana klucza po wstawieniu do mapy powoduje że nie możemy już znaleźć wartości
        System.out.println("Po zmianie klucza:");
        System.out.println(map);

        System.out.println(map.get(key2));
        System.out.println(key2.getKey());

        System.out.println("**********");
        map.entrySet()
                .stream()
                .forEach(keyStringEntry -> System.out.println(keyStringEntry.getKey().getKey() + " " + keyStringEntry.getValue()));
    }


}
