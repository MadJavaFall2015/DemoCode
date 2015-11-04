import java.util.*;

/** A class used to test the Restaurant class 
 * @author Paula Waite
 */
 
 public class MenuTestDrive {
     /** The main method to test the Menu items
      */
     public static void main(String[] args) {
         MenuItem pizza = new MenuItem();
         pizza.setName("Margherita");
         pizza.setDescription("Tomatoes, garlic, lotsa cheese, basil, tomato sauce");
         
         
         MenuItem pizza2 = new MenuItem();
         pizza2.setName("Pepperoni");
         pizza2.setDescription("Pepperoni, cheese, tomato sauce");
        
         Drink margarita = new Drink();
         margarita.setName("Strawberry");
         margarita.setDescription("Lotsa strawberries, on the rocks, extra tequila");
         margarita.setAlcoholic(true);
         margarita.setSize("jumbo");
         
         Drink coke = new Drink();
         coke.setName("Coke");
         coke.setDescription("Um... it is just Coke");
         coke.setAlcoholic(false);
         coke.setSize("16 oz.");
         
         
         
         ArrayList<MenuItem> items = new ArrayList<MenuItem>();
         items.add(coke);
         items.add(pizza);
         items.add(pizza2);
         items.add(margarita);
         
         for (MenuItem item : items) {
             System.out.println(item);
         }
         
         
         
         
         
     }
 }
