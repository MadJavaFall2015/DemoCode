/** A class used to test the Restaurant class 
 * @author Paula Waite
 */
 
 public class RestaurantTestDrive {
     public static void main(String[] args) {
         Restaurant myRestaurant = new Restaurant();
         myRestaurant.name = "Chipotle";
         myRestaurant.type = "Mexicanish";
         
         myRestaurant.serveFood();
         
         double myDouble = 10.0;
         int myInt = 10;
         if (myDouble == myInt) {
             System.out.println("they are equal");
         }

     }
 }
