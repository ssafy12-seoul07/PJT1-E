package pjt1;

import java.util.List;

public interface VideoReviewDao {
    List<VideoReview> getReviewsByVideoId(int videoId);
    void addReview(int videoId, VideoReview review);
}
