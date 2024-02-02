Grasp to zestaw reguł w inżynierii oprogramowania, które pomagają w tworzeniu dobrego kodu.
Elementy GRASP:
* Creator
* Information Expert
* Low Coupling
* High Cohesion
* Controller
* Polymorphism
* Pure Fabrication
* Indirection
* Protected Variations

## Creator
Klasa A powinna tworzyć obiekty klasy B, jeśli:
* A zawiera B w swojej strukturze
* A zawiera B w swoich polach
* A uzyskuje informacje potrzebne do utwozenia B z parametrów metody
* A uzyskuje informacje do utworzenia B z parametrów konstruktora

```java
public class BookStore {
    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        this.books.add(book);
    }
}

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getters and setters omitted for brevity
}
```

## Information Expert
Klasa A powinna wykonywać operację, jeśli posiada ona informacje potrzebne do wykonania tej operacji.

```java
public class Sale {
    private List<SalesLineItem> salesLineItems;

    public double getTotal() {
        double total = 0;
        for (SalesLineItem item : salesLineItems) {
            total += item.getQuantity() * item.getProductSpecification().getPrice();
        }
        return total;
    }
}
```

## Low Coupling
Słabe powiązanie między klasami jest pożądane, ponieważ zmiany w jednej klasie nie powinny wpływać na drugą klasę.
Dodatkowo słabe powiązanie pozwala na łatwiejsze testowanie i ułatwia ponowne wykorzystanie kodu.
Często wykorzystuje się wstrzykiwanie zależności (dependency injection) do osiągnięcia słabego powiązania.
```java
public class DatabaseService {
    private final DataAccess dataAccess;

    // Constructor injection
    public DatabaseService(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    // Other methods...
}
```

## High Cohesion
Silna spójność oznacza, że metody w klasie powinny być powiązane z sobą i powinny dotyczyć tego samego celu.
```java
public class Car {
    private Engine engine;
    private Wheel wheel;

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void inflateWheels() {
        wheel.inflate();
    }

    public void deflateWheels() {
        wheel.deflate();
    }
}
```

## Controller
Kontroler jest odpowiedzialny za obsługę zdarzeń i przekazywanie ich do innych klas.
```java
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registerUser(String username, String password) {
        userService.registerUser(username, password);
    }
}
```

## Polymorphism
Polimorfizm oznacza, że metody w klasach pochodnych powinny być zaimplementowane w taki sposób, aby można było je wywołać z klasy bazowej.
```java
public abstract class Shape {
    public abstract double getArea();
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

## Pure Fabrication
Pure Fabrication oznacza, że należy tworzyć klasy, które nie reprezentują żadnego konceptu w domenie,
ale istnieją, aby poprawić projekt systemu. Takie klasy często są nazywane serwisami lub helperami.

```java
public class EmailService {
    public void sendEmail(String to, String subject, String body) {
        // Send email
    }
}
```
## Indirection
Indirection oznacza, że należy tworzyć klasy pośredniczące, które nie wykonują żadnych operacji,
ale przekazują żądania do innych klas. Takie klasy często są nazywane fasadami lub adapterami.

```java
public class NotificationService {
    private final ChannelService channelService;

    public NotificationService(ChannelService channelService) {
        this.channelService = channelService;
    }

    public void sendNotification(Message message) {
        channelService.sendMessage(message);
    }
}

class Message {
    private String to;
    private String subject;
    private String body;

    // getters and setters omitted for brevity
}
```

## Protected Variations
Protected Variations oznacza, że należy tworzyć interfejsy, które chronią przed zmianami w poszczególnych klasach.
Klasy luźno powiązane interfejsami nie będą się zmieniać, jeśli zmieni się implementacja tych interfejsów.

```java
public interface PaymentGateway {
    void processPayment(double amount);
}

public class StripePaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // Stripe-specific payment processing logic
    }
}

public class PayPalPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // PayPal-specific payment processing logic
    }
}

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount) {
        paymentGateway.processPayment(amount);
    }
}
```