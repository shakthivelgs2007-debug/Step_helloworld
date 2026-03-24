public class hello {
    public static void main(String[] args) {

        String name = "World"; // Default case

        if (args.length > 0) { // Checks for a command line input
        String name = args[0]; 
        }

        System.out.println("Hello " + name + "!");
    }
}