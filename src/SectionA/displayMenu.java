package SectionA;

import java.util.Scanner;
import java.util.ArrayList;


public class displayMenu {
    static ArrayList<Capture> seriesList = new ArrayList<>();
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean quit = false;
        
        while (!quit){
            System.out.println("\nMain Menu");
            System.out.println("************************************");
            System.out.println("Please select one of the following menu items");            
            System.out.println("(1) Capture a new series.");            
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update series age restriction");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print series report - 2026");
            System.out.println("(6) Exit application");
            
            if (scanner.hasNextInt()){
                option = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid option. Please enter a number");
                scanner.nextLine();
                continue;
            }
            switch (option){
                case (1) -> {
                  //prompting the user to add in information and then storing it
                    System.out.println("CAPTURE A NEW SERIES");
                    System.out.println("********************************");
                    
                    System.out.println("Please enter the series ID:");
                    String SeriesID = scanner.nextLine();
                    
                    System.out.println("Please enter the series name:");
                    String SeriesName = scanner.nextLine();
                    
                    String SeriesAge = null;
                        while(SeriesAge == null) {
                            System.out.println("Please enter the series age "
                            + "restriction (e.g., 13+):");
                            String AgeString = scanner.nextLine().trim();
                            
                            try {
                                int Age = Integer.parseInt(AgeString);
                                
                                    if (Age >= 2 && Age <= 18){
                                        SeriesAge = AgeString;
                                        System.out.println("Series Age add");
                                    } else {
                                        System.out.println("Invalid Age "
                                                + "restriction. Please try "
                                                + "again"); 
                                      }
                            } catch (NumberFormatException e){
                                System.out.println("You have entered a incorrect"
                                        + "series age!!! Please re-enter the"
                                        + "the series age >>");
                                }
                        }
                        
                    
                    System.out.println("Please enter the number of"
                            + " episodes:");
                    String SeriesNumberOfEpisodes = scanner.nextLine();
                    
                    Capture series = new Capture(SeriesID,
                            SeriesName, SeriesAge, SeriesNumberOfEpisodes);
                    seriesList.add(series);
                    System.out.println(SeriesName + "'"
                            + " has been captured successfully with the "
                            + "following ID: " +
                            SeriesID + "!");
                }
                
                
                case (2) ->{
                System.out.println("Enter the series id to search: " );
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for (Capture s : seriesList) { 
                        
                      //searches for the users entered text in the array
                      if (s != null && s.getSeriesId().equalsIgnoreCase
                            (searchId)) {
                            
                        System.out.println("-----------------------------");
                            
                        //display the series and all the captured info
                        System.out.println("Series ID: " + s.getSeriesId());
                        System.out.println("SERIES NAME: " + s.getSeriesName());
                        System.out.println("SERIES AGE RESTRICTION: " 
                            + s.getSeriesAge());
                        System.out.println("SERIES NUMBER OF EPISODES: " 
                            + s.getNumberOfEpisodes() );
                            
                                
                            found = true;
                            if (!found) {
                             /*error message for when there is no movie with the
                                ID that the user provided
                                */
                                System.out.println("Series with the ID: " 
                                        + searchId 
                                + "was not found.");
                            }
                       }
                    }
                
                }
                
                case (3) ->{
                    System.out.println("Updating series age restriction... "
                            + "Please enter the series name:");
                    String updateName = scanner.nextLine();
                    
                    System.out.print("Enter new age restriction (e.g., 13): ");
                    String newAge = scanner.nextLine(); 
                    scanner.nextLine(); 
                    boolean updated = false;
                    for (Capture s : seriesList) { 
                        if (s != null && s.getSeriesName().equalsIgnoreCase
                           (updateName)) {
                            s.setSeriesAge(newAge);
                            updated = true;
                            System.out.println("Age restriction for '" 
                                    + updateName + "' updated to "
                                    + newAge + ".");
                        }
                    }
                    if (!updated) {
                        System.out.println("Series '" + updateName 
                                +  "' not found.");
                    }
                    break;
                } 
                
                case (4) ->{
                    System.out.println("Deleting a series. "
                            + "Please enter the series name:");
                    String deleteName = scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < seriesList.size(); i++) {
                        if (seriesList.get(i) != null && seriesList.get(i)
                                .getSeriesName().equalsIgnoreCase(deleteName)) {
                                    seriesList.remove(i);
                                    deleted = true;
                                    System.out.println("Series '" + deleteName
                                            + "' has been deleted.");
                        }
                    }
                    if (!deleted) {
                        System.out.println("Series '" + deleteName 
                                + "' not found.");
                    }
                    break;
                }
                
                case (5) -> {
                    System.out.println("Printing series report - 2025...");
                    for (Capture s : seriesList) { // Updated class name
                        if (s != null) {
                            System.out.println("ID: " + s.getSeriesId() 
                                    + ", Name: " + s.getSeriesName() 
                                    + ", Age: " + s.getSeriesAge() 
                                    + ", Episodes: " + s.getNumberOfEpisodes());
                        }
                    }
                    break;
                }
                    
                case (6) -> {
                    System.out.println("Exiting application");
                    quit = true;
                }
                           
            }
            
        }
    }
}