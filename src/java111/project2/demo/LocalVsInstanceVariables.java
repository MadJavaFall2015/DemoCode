/**
 *  This class demonstrates the behavior of local
 *  vs. instance variables.
 */
public class LocalVsInstanceVariables {
     
    private String firstName;
     
    public void demo(String name) {
        String firstName = name;
        System.out.println("local firstName: " + firstName);
    }
     
    public void run() {
        demo("Fred");
        firstName = "Barney";
        System.out.println("instance variable firstName: " + firstName);
    }
     
}
  
