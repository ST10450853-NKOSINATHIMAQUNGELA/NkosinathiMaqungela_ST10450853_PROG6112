package SectionA;
//Nkosinathi Maqungela ST10450853

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        //a while loop that either quits the program, or displays the menu
        while (!quit){
        System.out.println("\nLATEST SERIES - 2025");  
        System.out.println("*************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");            


            String option = scanner.nextLine();
            
            //calls the showMenu method
            switch (option){
                case "1" ->
                    displayMenu.showMenu();
                    
                
                    
                default -> {
                    System.out.println("Exiting application");
                    quit = true;
                }
                    
            }
                           
        }
        
    }
  
}   

