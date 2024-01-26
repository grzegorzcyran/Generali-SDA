package edu.grcy.solid.dip;

public class EmailService {
    public void sendEmail(String message) {
        // Code to send an email
    }
}

class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService();
    }

    public void notifyUser(String message) {
        emailService.sendEmail(message);
    }
}
