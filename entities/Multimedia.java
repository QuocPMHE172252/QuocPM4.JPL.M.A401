package fa.training.entities;

import java.util.Scanner;

public abstract class Multimedia {
    private String name;
    private double duration; 
    
    public Multimedia() {
    }
    
    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
    public abstract void createMultimedia();
    
    protected void inputMultimediaData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        
        System.out.print("Enter duration (in minutes): ");
        this.duration = scanner.nextDouble();
    }
} 