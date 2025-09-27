package oops.interfaces.mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notifyService;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            NotificationService notifyService)
    {
        this.encoder = encoder;
        this.database = database;
        this.notifyService = notifyService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notifyService.notify(video.getUser());
    }
}
