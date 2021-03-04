package com.roger;

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); // this instantiates an array list type string with name groceryList as a field of this class

    public void addGroceryItem(String item) {
        groceryList.add(item); // adds an element to the groceryList array list
    }


    public ArrayList<String> getGroceryList() {
        return groceryList; // gets the grocery list
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i)); // loops through the grocery list and prints element at position i
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem); // finds the index of the currentItem in the array list
        if(position >= 0) { // if position is greater than -1 then the item exist
            modifyGroceryItem(position, newItem);
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // sets the value of an element at a specific position
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position); // removes an Item at a specific position
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem); // finds the index of an item element in the array list
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true; // confirms that an item is onfile
        }
        return false;
    }
}
