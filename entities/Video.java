package fa.training.entities;

import java.util.Scanner;

public class Video extends Multimedia {
    
    public Video() {
        super();
    }
    
    public Video(String name, double duration) {
        super(name, duration);
    }
    
    public void createVideo() {
        System.out.println("=== Creating a new Video ===");
        inputMultimediaData();
    }
    
    @Override
    public String toString() {
        return "Video [name=" + getName() + ", duration=" + getDuration() + " minutes]";
    }
    
    @Override
    public void createMultimedia() {
        createVideo();
    }
} 