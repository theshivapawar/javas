package oops.interfaces.mytube.problem;

public class VideoEncoder {
    public void encode(Video video) {
        System.out.println("Encoded: " + video.getFileName());
    }
}
