package oops.interfaces.mytube.problem;

public class EmailService {
    public void sendEmail(User user) {
        System.out.println("Email Sent: " + user.getName());
    }
}
