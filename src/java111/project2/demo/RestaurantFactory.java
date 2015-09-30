/** A class to create restaurants and display them 
 *  @author pwaite
 */
 
 public class RestaurantFactory {
 
     private Restaurant[] restaurants;
     
    /** Create restaurants and place them in the array */    
     public void createRestaurants() {
         restaurants = new Restaurant[3];
          
         Restaurant myRestaurant = new Restaurant();
         myRestaurant.setName("Chipotle");
         myRestaurant.setType("Mexicanish");
         restaurants[0] = myRestaurant;
         
         restaurants[1] = new Restaurant();
         restaurants[1].setName("Pizza Hut");
         restaurants[1].setType("Italianish");    
         
         restaurants[2] = new Restaurant();
         restaurants[2].setName("Culvers");
         restaurants[2].setType("American");   
          
     }
     
     /** Iterate over the array of restaurants and display them */ 
     public void displayRestaurants() {
         for (int count = 0; count < restaurants.length; count++) {
             restaurants[count].serveFood();        
         }
         
         System.out.println();
         // Enhanced for loop 
         for (Restaurant restaurant : restaurants) {
             restaurant.serveFood();
         }
     }
     
     /** Call the methods for processing a restaurant */
     public void run() {
         createRestaurants();
         displayRestaurants();
     }
        
       
 }
