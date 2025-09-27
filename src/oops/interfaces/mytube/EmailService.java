package oops.interfaces.mytube;

public class EmailService implements NotificationService {
    @Override
    public void notify(User user) {
        System.out.println("Email Sent: " + user.getName());
    }
}
