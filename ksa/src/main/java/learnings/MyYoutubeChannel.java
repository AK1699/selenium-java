package learnings;

public class MyYoutubeChannel {

    String subscriberCount = "10k";

    public static void main(String[] args) {
        YouTuber yt = new YouTuber();
        String channelName = yt.createChannel("Fight Club");
        String videoName = yt.createVideo("Mike Tyson Vs Jake Paul| fight scene| 4k Ultra HD");
        boolean uploaded = true;
        yt.isUploaded(uploaded);
        String platform = "Not Shared Yet!";
        yt.deleteVideo("Mike Vs Jake Paul");
        yt.deleteVideo(45);
        if (uploaded == true) {
            platform = yt.shareVideo("Instagram");
        } else {
            System.out.println("Video is not uploaded!");
        }
        MyYoutubeChannel ytChannel = new MyYoutubeChannel();
        yt.subscribersCount(ytChannel.subscriberCount);
        System.out.println(channelName + " " + videoName + " " + platform);
    }
}
