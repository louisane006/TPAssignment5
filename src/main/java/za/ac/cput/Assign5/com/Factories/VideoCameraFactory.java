package za.ac.cput.Assign5.com.Factories;

import za.ac.cput.Assign5.com.Domain.VideoCamera;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public interface  VideoCameraFactory {
    VideoCamera createVideoCamera(String identification, String name, String code, double price);
}

