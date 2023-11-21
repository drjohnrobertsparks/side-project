package org.johnrsparks;

import java.util.Map;

public class Inventory {

    private Map<Integer, Item> itemsMap;

    public void addItemToInventory(int slot, Item item) {
        itemsMap.put(slot, item);
    }

    public Item getItemFromInventory(int slot) {
        return itemsMap.get(slot);
    }

    Inventory vendingMachineInventory = new Inventory();



    public void intializeInventory() {
        Item item1 = new Item("Fluffy Cat", 10.00, 5);
        Item item2 = new Item("Fat Cat", 7.50, 5);
        Item item3 = new Item("Short Hair Cat", 5.00, 5);
        Item item4 = new Item("Bald Cat", 2.50, 5);
        Item item5 = new Item("Fluffy Dog", 10.00, 5);
        Item item6 = new Item("Fat Dog", 7.50, 5);
        Item item7 = new Item("Short Hair Dog", 5.00, 5);
        Item item8 = new Item("Bald Dog", 2.50, 5);
        Item item9 = new Item("Koala", 25.00, 2);
        Item item10 = new Item("Sloth", 15.00, 2);
        Item item11 = new Item("Panda", 25.00, 5);
        Item item12 = new Item("Liger", 2.50, 5);

        vendingMachineInventory.addItemToInventory(1, item1);
        vendingMachineInventory.addItemToInventory(2, item2);
        vendingMachineInventory.addItemToInventory(3, item3);
        vendingMachineInventory.addItemToInventory(4, item4);
        vendingMachineInventory.addItemToInventory(5, item5);
        vendingMachineInventory.addItemToInventory(6, item6);
        vendingMachineInventory.addItemToInventory(7, item7);
        vendingMachineInventory.addItemToInventory(7, item7);
        vendingMachineInventory.addItemToInventory(8, item8);
        vendingMachineInventory.addItemToInventory(8, item8);
        vendingMachineInventory.addItemToInventory(9, item9);
        vendingMachineInventory.addItemToInventory(10, item10);
        vendingMachineInventory.addItemToInventory(11, item11);
        vendingMachineInventory.addItemToInventory(12, item12);


    }

}
