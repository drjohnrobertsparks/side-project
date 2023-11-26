package org.johnrsparks;

import java.util.Scanner;

public class MachineCLI {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.initializeInventory();


        Scanner userInput = new Scanner(System.in);

        System.out.println("*********************************************************");
        System.out.println(" ");
        System.out.println("        Welcome and thank you for shopping the furry ");
        System.out.println("                  friends vending machine, ");
        System.out.println("          where you can buy your own furry friend ");
        System.out.println("                      to love for life.");
        System.out.println(" ");
        System.out.println("**********************************************************");
        System.out.println(" ");
        System.out.println("Below is a list of friends for your selection:");
        System.out.println(" ");


        for(int slot : inventory.getItemsMap().keySet()){
            Item item = inventory.getItemFromInventory(slot);
            if (item != null){
                System.out.println("Slot " + slot + ": " + item.getName() + " Cost: $" + item.getCost() + " Units Available: " + item.getUnits());
                System.out.println(" ");
            }

        }

        





    }
}
