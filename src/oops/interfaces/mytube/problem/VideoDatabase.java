package oops.interfaces.mytube.problem;

public class VideoDatabase {
    public void store(Video video) {
        System.out.println("Stored: " + video.getFileName());
    }
}
