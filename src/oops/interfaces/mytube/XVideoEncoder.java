package oops.interfaces.mytube;

public class XVideoEncoder implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoded: " + video.getFileName());
    }
}
