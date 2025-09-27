package oops.interfaces.mytube.problem;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Rohit's Birthday");
        video.setUser(new User("Rohit Nilekar", "rohitnilekar@gmail.com"));

        var processor = new VideoProcessor();
        processor.process(video);
    }
}
