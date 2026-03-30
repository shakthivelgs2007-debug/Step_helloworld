public class Hello {
    public static void main(String[] args) {

        String name;

        if (args.length == 0) { //incase user gives no input
            name = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder(); // to join the names together into one string

            for (int i = 0; i < args.length; i++) { // cycling through every name
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", "); // Adding a comma between each name
                }
            }

            name = nameBuilder.toString(); // assigning the finished string to 'name'
        }

        System.out.println("Hello " + name);
    }
}