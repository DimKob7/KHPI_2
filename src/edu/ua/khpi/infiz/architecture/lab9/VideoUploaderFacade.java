package edu.ua.khpi.infiz.architecture.lab9;

public class VideoUploaderFacade {
    private VideoConverter videoConverter;
    private YoutubeAPI youtubeAPI;

    public VideoUploaderFacade() {
        this.videoConverter = new VideoConverter();
        this.youtubeAPI = new YoutubeAPI();
    }
    public void uploadVideo(String videoPath, String apiKey) {
        // Конвертувати відео в необхідний формат
        String convertedVideoPath = videoConverter.convertVideo(videoPath);

        // Завантажити відео на YouTube за допомогою API та передати API-ключ
        youtubeAPI.uploadVideo(convertedVideoPath, apiKey);
    }

}
