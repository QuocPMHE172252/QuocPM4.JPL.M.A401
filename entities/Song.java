package fa.training.entities;

import java.util.Scanner;

public class Song extends Multimedia {
    private String singer;
    
    public Song() {
        super();
    }
    
    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }
    
    public String getSinger() {
        return singer;
    }
    
    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    public void createSong() {
        System.out.println("=== Creating a new Song ===");
        inputMultimediaData();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter singer: ");
        this.singer = scanner.nextLine();
    }
    
    @Override
    public String toString() {
        return "Song [name=" + getName() + ", duration=" + getDuration() + 
               " minutes, singer=" + singer + "]";
    }
    
    // Implementation of abstract method
    @Override
    public void createMultimedia() {
        createSong();
    }
} 