package edu.grcy.patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer observer1 = new MyTopicSubscriber("Janek");
        Observer observer2 = new MyTopicSubscriber("Arek");
        Observer observer3 = new MyTopicSubscriber("Wojtek");
        Subject topic = new MyTopic();
        observer1.setSubject(topic);
        observer3.setSubject(topic);
        topic.register(observer1);
        topic.register(observer3);

        System.out.println("================");
        ((MyTopic) topic).postMessage("Wiadomosc pierwsza");
        System.out.println("================");
        observer2.setSubject(topic);
        topic.register(observer2);
        ((MyTopic) topic).postMessage("Wiadomosc druga");
        System.out.println("================");
        topic.unregister(observer1);
        topic.unregister(observer3);
        ((MyTopic) topic).postMessage("Wiadomosc trzecia");


    }
}
