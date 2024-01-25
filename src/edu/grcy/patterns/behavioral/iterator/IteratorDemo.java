package edu.grcy.patterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Payment payment1 = new Payment("Woda");
        Payment payment2 = new Payment("Prąd");
        Payment payment3 = new Payment("Gaz");
        Payment payment4 = new Payment("Śmieci");

        Payment[] payments = new Payment[]{payment1, payment2, payment3, payment4};
        PaymentList paymentList = new PaymentList(payments);
        PaymentIterator iterator = new PaymentIterator(payments);

        System.out.println("Current: " + iterator.current().getName());
        System.out.println("Czy ma następnego: " + (iterator.hasNext() ? "TAK" : "NIE"));
        System.out.println("Next: " + iterator.next().getName());
        System.out.println("Next: " + iterator.next().getName());
        System.out.println("Next: " + iterator.next().getName());
        System.out.println("Next: " + iterator.next().getName());
        System.out.println("Next: " + iterator.next().getName());

    }
}
