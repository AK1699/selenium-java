package learnings;

public class YouTuber {

    public String createChannel(String channelName) {
        return channelName;
    }

    public String createVideo(String videoTitle) {
        return videoTitle;

    }

    public boolean isUploaded(boolean value) {
        return value;
    }

    public String shareVideo(String platform) {
        return platform;
    }

    public void deleteVideo(int videoId) {
        System.out.println("video Deleted -" + videoId);
    }

    public void deleteVideo(String videoTitle) {
        System.out.println("video Deleted -" + videoTitle);
    }

    public void subscribersCount(String count) {
        System.out.println("Total Subscriber count is" + " " + count);
    }
}
