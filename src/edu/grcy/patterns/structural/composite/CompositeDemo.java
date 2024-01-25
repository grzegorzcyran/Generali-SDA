package edu.grcy.patterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        /**
         * Composite pozwala na traktowanie zarówno dużych skomplikowanych
         * obiektów, jak i małych prostych w ten sam sposób:
         * rysunek składa się z trójkątów, kół i mniejszych rysunków, jak
         * rysujemy duży to automatem musimy narysować wszystkie jego składowe
         * czyli mniejsze rysunki (i ich jeszcze mniejsze koła, trójkąty, rysunki)
         * jak i koła i trójkąty mieszczące się bezpośrednio na tym dużym
         *
         * ===============
         *
         * Jak pakujemy zakupy do samochodu to obciążenie samochodu wzrasta
         * zarówno jak pakujemy pojedyncze towary jak i torby z zebranymi innymi zakupami
         * (torba tutaj odpowiada mniejszemu rysunkowi wyżej), też mamy obiekty bezpośrednio
         * w aucie jak i w torbie (i w tej torbie mogą też być mniejsze torebki)) a finalnie
         * obciążenie auta to waga tego wszystkiego
         *
         */
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();

        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Shape drawing1 = new Drawing("Rysunek 1");
        Shape drawing2 = new Drawing("Duży rysunek 2");

        ((Drawing) drawing1).add(triangle1);
        ((Drawing) drawing1).add(triangle2);
        ((Drawing) drawing1).add(circle1);

        ((Drawing) drawing2).add(circle2);
        ((Drawing) drawing2).add(circle3);
        ((Drawing) drawing2).add(drawing1);
        ((Drawing) drawing2).add(triangle3);
        System.out.println("======================");
        drawing2.draw("Zielony");


    }
}
