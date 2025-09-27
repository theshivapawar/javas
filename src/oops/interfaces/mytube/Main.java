package oops.interfaces.mytube;

public class Main {
    public static void main(String[] args) {

        Video video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Rohit's Birthday");
        video.setUser(new User("Rohit", "rohit@gmail.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new FireBase(),
                new EmailService()
        );

        processor.process(video);

    }
}
