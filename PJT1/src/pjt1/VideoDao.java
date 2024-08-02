package pjt1;

import java.util.List;

public interface VideoDao {
    List<Video> getAllVideos();
    Video getVideoById(int id);
}
