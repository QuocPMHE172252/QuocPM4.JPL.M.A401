package fa.training.management;

import java.util.List;
import java.util.ArrayList;
import fa.training.entities.Multimedia;

public class MultimediaManagement {
    private List<Multimedia> listOfMultimedia;
    
    // Constructor with 1 parameter to initialize a new listOfMultimedia
    public MultimediaManagement() {
        this.listOfMultimedia = new ArrayList<>();
    }
    
    // Method to add a new multimedia to list
    public void addMultiMedia(Multimedia multimedia) {
        if (multimedia != null) {
            listOfMultimedia.add(multimedia);
            System.out.println("Multimedia added successfully!");
        } else {
            System.out.println("Cannot add null multimedia!");
        }
    }
    
    // Method to display list of multimedia
    public void displayMultiMedia() {
        if (listOfMultimedia.isEmpty()) {
            System.out.println("No multimedia items in the list.");
            return;
        }
        
        System.out.println("\n=== List of Multimedia ===");
        for (int i = 0; i < listOfMultimedia.size(); i++) {
            System.out.println((i + 1) + ". " + listOfMultimedia.get(i));
        }
        System.out.println("========================\n");
    }
    
    public List<Multimedia> getListOfMultimedia() {
        return listOfMultimedia;
    }
    
    public void setListOfMultimedia(List<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }
} 