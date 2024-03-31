import java.util.ArrayList;
import java.util.List;

// Define a Video class to represent individual videos
class Video {
    private String title;
    private String url;

    public Video(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}

// Define a VideoRepository class to manage video data
class VideoRepository {
    private List<Video> videos;

    public VideoRepository() {
        videos = new ArrayList<>();
        // Initialize with some sample videos
        videos.add(new Video("Video 1", "https://example.com/video1.mp4"));
        videos.add(new Video("Video 2", "https://example.com/video2.mp4"));
        videos.add(new Video("Video 3", "https://example.com/video3.mp4"));
    }

    public List<Video> getAllVideos() {
        return videos;
    }
}

// Main class to run the application
public class VideoStreamingApp {
    public static void main(String[] args) {
        // Create a video repository
        VideoRepository repository = new VideoRepository();

        // Get all videos from the repository
        List<Video> videos = repository.getAllVideos();

        // Display video titles and URLs
        for (Video video : videos) {
            System.out.println("Title: " + video.getTitle());
            System.out.println("URL: " + video.getUrl());
            System.out.println();
        }
    }
}
