/** A class used to test the Restaurant class 
 * @author Paula Waite
 */
 
 public class RestaurantTestDrive {
     /** The main method to start the Restaurant Application.
      *  This method will instantiate restaurant objects and display them
      */
     public static void main(String[] args) {
         Restaurant myRestaurant = new Restaurant();
         myRestaurant.name = "Chipotle";
         myRestaurant.type = "Mexicanish";
         
         myRestaurant.serveFood();
         
         Restaurant myRestaurant1 = new Restaurant();
         myRestaurant1.name = "Pizza Hut";
         myRestaurant1.type = "Italianish";
         
         myRestaurant1.serveFood();
         
         myRestaurant1 = myRestaurant;
         myRestaurant1.serveFood();
         
         myRestaurant1.name = "Culvers";
         myRestaurant.name = "Coopers Tavern";
         
         System.out.println("Change name to Coopers");
         myRestaurant1.serveFood();
         myRestaurant.serveFood();
         
        // myRestaurant1 = null;
         myRestaurant1.serveFood();
         

     }
 }
