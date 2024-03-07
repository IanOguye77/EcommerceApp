package org.example;

import java.util.ArrayList;
public class ShoppingCart {

    // create an Arraylist to store our items
    ArrayList<Product> items = new  ArrayList<>();

    // a method to add an item into our ArrayList
    public void addItem(Product item){
        items.add(item);
    }

    // a method to calculate the total price\
    public double calculateTotal(){
        double total = 0;

        for(Product item : items){
            total += item.price * item.quantity;
        }

        return total;
    }
}
