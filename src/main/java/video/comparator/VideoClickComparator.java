package video.comparator;

import com.lzc.video.pojo.Video;

import java.util.Comparator;

public class VideoClickComparator implements Comparator<Video> {

    @Override
    public int compare(Video v1,Video v2) {
        return v2.getVid_cli().compareTo(v1.getVid_cli());
    }
}
