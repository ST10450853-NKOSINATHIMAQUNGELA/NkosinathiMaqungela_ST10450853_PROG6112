package nkosinathimaqungela_st10450853_prog6112_practical.assignment;
//Nkosinathi Maqungela ST10450853

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public void Menu(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        while (!quit){
        System.out.println("\nLATEST SERIES - 2025");  
        System.out.println("*************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");            

            String option = scanner.nextLine();
            
            switch (option){
                case "(1)": displayMenu.showMenu();
                            break;
                    
                default: System.out.println("Exiting application");
                         quit = true;
                           
            }
            scanner.close();
        }
       
    }   
}
