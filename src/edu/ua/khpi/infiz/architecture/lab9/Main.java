package edu.ua.khpi.infiz.architecture.lab9;

public class Main {
    public static void main(String[] args) {
        String videoPath = "path/video.mp4";
        String apiKey = "your_api_key";

        VideoUploaderFacade videoUploaderFacade = new VideoUploaderFacade();
        videoUploaderFacade.uploadVideo(videoPath, apiKey);
        System.out.println("Done!");
    }


}
