package pjt1;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class VideoReviewDaoImpl implements VideoReviewDao {
    private Map<Integer, List<VideoReview>> reviewMap;

    public VideoReviewDaoImpl() {
        reviewMap = new HashMap<>();
    }

    @Override
    public List<VideoReview> getReviewsByVideoId(int videoId) {
        return reviewMap.getOrDefault(videoId, new ArrayList<>());
    }

    @Override
    public void addReview(int videoId,VideoReview review) {
        List<VideoReview> reviews = reviewMap.getOrDefault(videoId, new ArrayList<>());
        reviews.add(review);
        reviewMap.put(videoId, reviews);
    }
}
