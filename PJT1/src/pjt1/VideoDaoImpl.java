package pjt1;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class VideoDaoImpl implements VideoDao {
    private List<Video> videos;

    public VideoDaoImpl() {
        loadVideos();
    }

    private void loadVideos() {
        try (FileReader reader = new FileReader("data/data.json")) {
            Gson gson = new Gson();
            Type videoListType = new TypeToken<ArrayList<Video>>(){}.getType();
            videos = gson.fromJson(reader, videoListType);
        } catch (Exception e) {
            e.printStackTrace();
            videos = new ArrayList<>();
        }
    }

    @Override
    public List<Video> getAllVideos() {
        return videos;
    }

    @Override
    public Video getVideoById(int id) {
        for (Video video : videos) {
            if (video.getNo() == id) {
                return video;
            }
        }
        return null;
    }
}
