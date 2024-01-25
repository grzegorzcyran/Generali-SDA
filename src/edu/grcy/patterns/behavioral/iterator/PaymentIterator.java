package edu.grcy.patterns.behavioral.iterator;

public class PaymentIterator implements MyIterator<Payment> {
    private Payment[] payments;
    private int position;

    public PaymentIterator(Payment[] payments) {
        this.payments = payments;
        position = 0;
    }

    @Override
    public Payment next() {
        return payments[position++];
    }

    @Override
    public Payment current() {
        return payments[position];
    }

    @Override
    public boolean hasNext() {
        if(position >= payments.length)
            return false;
        return true;
    }
}
