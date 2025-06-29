package fa.training.main;

import java.util.Scanner;
import fa.training.entities.Multimedia;
import fa.training.entities.Song;
import fa.training.entities.Video;
import fa.training.management.MultimediaManagement;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultimediaManagement management = new MultimediaManagement();
        
        int choice;
        
        do {
            System.out.println("=== Multimedia Management System ===");
            System.out.println("1. Add a new Song");
            System.out.println("2. Add a new Video");
            System.out.println("3. Display all Multimedia");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    Song song = new Song();
                    song.createMultimedia();
                    management.addMultiMedia(song);
                    break;
                    
                case 2:
                    Video video = new Video();
                    video.createMultimedia();
                    management.addMultiMedia(video);
                    break;
                    
                case 3:
                    management.displayMultiMedia();
                    break;
                    
                case 4:
                    System.out.println("Thank you for using Multimedia Management System!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-4.");
            }
            
        } while (choice != 4);
        
        scanner.close();
    }
} 