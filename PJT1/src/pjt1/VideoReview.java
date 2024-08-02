package pjt1;

public class VideoReview{
    private String nickname;
    private String content;

    public VideoReview(String nickname, String content) {
        this.nickname = nickname;
        this.content = content;
    }

    // Getters and Setters

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
