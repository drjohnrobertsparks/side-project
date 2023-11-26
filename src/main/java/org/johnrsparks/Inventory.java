package org.johnrsparks;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private HashMap<Integer, Item> itemsMap;

    private Item item1 = new Item("Fluffy Cat", 10.00, 5);
    private Item item2 = new Item("Fat Cat", 7.50, 5);
    private Item item3 = new Item("Short Hair Cat", 5.00, 5);
    private Item item4 = new Item("Bald Cat", 2.50, 5);
    private Item item5 = new Item("Fluffy Dog", 10.00, 5);
    private Item item6 = new Item("Fat Dog", 7.50, 5);
    private Item item7 = new Item("Short Hair Dog", 5.00, 5);
    private Item item8 = new Item("Bald Dog", 2.50, 5);
    private Item item9 = new Item("Koala", 25.00, 2);
    private Item item10 = new Item("Sloth", 15.00, 2);
    private Item item11 = new Item("Panda", 25.00, 2);
    private Item item12 = new Item("Liger", 17.50, 2);

    public HashMap<Integer, Item> getItemsMap() {
        return itemsMap;
    }

    public void setItemsMap(HashMap<Integer, Item> itemsMap) {
        this.itemsMap = itemsMap;
    }



    public Inventory(){
        this.itemsMap = new HashMap<>();
    }


    public void addItemToInventory(int slot, Item item) {
        itemsMap.put(slot, item);
    }

    public Item getItemFromInventory(int slot) {
        return itemsMap.get(slot);
    }




    public void initializeInventory() {

        addItemToInventory(1, new Item("Fluffy Cat", 10.00, 5));
        addItemToInventory(2, new Item("Fat Cat", 7.50, 5));
        addItemToInventory(3, new Item("Short Hair Cat", 5.00, 5));
        addItemToInventory(4, new Item("Bald Cat", 2.50, 5));
        addItemToInventory(5, new Item("Fluffy Dog", 10.00, 5));
        addItemToInventory(6, new Item("Fat Dog", 7.50, 5));
        addItemToInventory(7, new Item("Short Hair Dog", 5.00, 5));
        addItemToInventory(8, new Item("Bald Dog", 2.50, 5));
        addItemToInventory(9, new Item("Koala", 25.00, 2));
        addItemToInventory(10, new Item("Sloth", 15.00, 2));
        addItemToInventory(11, new Item("Panda", 25.00, 5));
        addItemToInventory(12, new Item("Liger", 2.50, 5));




    }

}
