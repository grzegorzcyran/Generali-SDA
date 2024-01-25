package edu.grcy.patterns.behavioral.iterator;


public class PaymentList implements MyList<Payment> {

    private Payment[] payments;

    public PaymentList(Payment[] payments) {
        this.payments = payments;
    }

    @Override
    public MyIterator<Payment> iterator() {
        return new PaymentIterator(payments);
    }
}
