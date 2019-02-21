/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
import java.util.ArrayList;
import java.util.function.Predicate;

public class ShoppingCart {

    ArrayList<Item> items = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
    }

    public void fillCart() {
        items.add(new Shirt(40.95, 'M', 'R'));
        items.add(new Shirt(32.99, 'M', 'Y'));
        items.add(new Trousers(59.99, 34, 'B', "Relaxed", 'M'));
        items.add(new Trousers(75.50, 8, 'G', "Skinny", 'F'));
    }

    public void removeItemFromCart(String desc) {
        // remove all Trousers from the items list, then print out the list
        items.removeIf(i -> i.getDesc().equals(desc));
        System.out.println("Cart after removing Trousers: \n" + items);
    }
}
