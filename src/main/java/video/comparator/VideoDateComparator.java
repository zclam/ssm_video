package video.comparator;

import com.lzc.video.pojo.Video;

import java.util.Comparator;

public class VideoDateComparator implements Comparator<Video> {

    @Override
    public int compare(Video v1,Video v2) {
        return v2.getVid_time().compareTo(v1.getVid_time());
    }
}
