/**
* This program displays text to the user.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/
public final class HelloWorldStyle {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        System.out.println("Next year I'm going to Uni");
        System.out.println("I am excited for Uni.");
    }
}
