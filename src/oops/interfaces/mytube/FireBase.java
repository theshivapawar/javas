package oops.interfaces.mytube;

public class FireBase implements VideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("Stored: " + video.getFileName());
    }
}
