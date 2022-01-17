import java.util.Scanner;

class Color {
    public static final String none = "\033[m";

    // Foreground colors
    public static final String green  = "\033[92m";
    public static final String purple = "\033[35m";

    // Background colors
    public static final String bgBlack = "\033[40m";
    public static final String bgWhite = "\033[107m";
}

public class Duke {
    // Input Scanner for user input
    private static final Scanner input = new Scanner(System.in);

    private static final String logo = "███╗░░██╗██╗██╗░░██╗██╗░░██╗██╗\n" +
                                       "████╗░██║██║██║░██╔╝██║░██╔╝██║\n" +
                                       "██╔██╗██║██║█████═╝░█████═╝░██║\n" +
                                       "██║╚████║██║██╔═██╗░██╔═██╗░██║\n" +
                                       "██║░╚███║██║██║░╚██╗██║░╚██╗██║\n" +
                                       "╚═╝░░╚══╝╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝";

    private static final String description =
            "Your Personal Assistant Chatbot that helps you keep track of the important things in life";

    private static final String introduction = "Hello, I'm Nikki\n" +
                                               "What can I do for you?";

    private static TaskList tasks = new TaskList();

    /**
     * Method for chatbot to print message in a formatted style.
     *
     * @param message Message to print
     */
    private static void say(String message) {
        // Set color theme for Nikki's text
        System.out.println(Color.green);

        System.out.println("<<<<<<<<");
        System.out.println(message);
        System.out.println(">>>>>>>>");

        // Reset to default
        System.out.println(Color.none);
    }

    public static void main(String[] args) {
        // Program banner
        System.out.println(Color.purple + logo + Color.none);
        System.out.println(description);

        say(introduction);

        while (true) {
            String action = input.nextLine();
            switch (action) {
                case "bye":
                    say("Bye! See you later!");
                    System.exit(0);

                case "list":
                    say(tasks.toString());
                    break;

                default:
                    tasks.addTask(new Task(action));
                    say("[+] Added: " + action);

            }
        }
    }
}
