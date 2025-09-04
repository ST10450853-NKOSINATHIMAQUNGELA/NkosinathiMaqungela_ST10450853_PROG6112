package nkosinathimaqungela_st10450853_prog6112_practical.assignment;

import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class displayMenu {
    private static ArrayList<Capture> seriesList = new ArrayList<>();
    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean quit = false;
        
        while (quit){
            System.out.println("\nzMain Menu");
            System.out.println("************************************");
            System.out.println("Please select one of the following menu items");            
            System.out.println("(1) Capture a new series.");            
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update series age restriction");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print series report - 2026");
            System.out.println("(6) Exit application");
            
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid option. Please enter a number");
                scanner.nextLine();
                continue;
            }
            switch (option){
                case "(1)": System.out.println("Please enter the series ID:");
                            scanner.nextLine();
                            String seriesID = scanner.nextLine();
                            System.out.println("Please enter the series name");
                            break;
                    
                case "6": System.out.println("Exiting application");
                         quit = true;
                           
            }
            scanner.close();
        }
    }
}