import java.util.*;

/** A class to create restaurants and display them 
 *  @author pwaite
 */
 
 public class RestaurantFactory {
 
     private ArrayList<Restaurant> restaurants;
     
    /** Create restaurants and place them in the array */    
     public void createRestaurants() {
         restaurants = new ArrayList<Restaurant>();
          
         Restaurant myRestaurant = new Restaurant();
         myRestaurant.setName("Chipotle");
         myRestaurant.setType("Mexicanish");
         restaurants.add(myRestaurant);
         
         Restaurant restaurant2 = new Restaurant();
         restaurant2.setName("Pizza Hut");
         restaurant2.setType("Italianish");  
         restaurants.add(restaurant2);
         
      //   restaurants[2] = new Restaurant();
      //   restaurants[2].setName("Culvers");
      //   restaurants[2].setType("American");   
          
     }
     
     /** Iterate over the array of restaurants and display them */ 
     public void displayRestaurants() {
         for (int count = 0; count < restaurants.size(); count++) {
            // restaurants[count].serveFood();   
             System.out.println(restaurants.get(count));
         }
         
         System.out.println();
         // Enhanced for loop 
         for (Restaurant restaurant : restaurants) {
            // The next line calls the toString() method on the restaurant
            System.out.println(restaurant);
         }
     }
     
     /** Call the methods for processing a restaurant */
     public void run() {
         createRestaurants();
         displayRestaurants();
     }
        
       
 }
