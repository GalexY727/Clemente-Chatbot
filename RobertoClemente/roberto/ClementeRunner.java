package roberto;

import java.util.Scanner;

public class ClementeRunner
{

    /**
     * Create a Clemente, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Clemente clem = new Clemente();
        
        System.out.println(clem.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye") && !statement.equals("Adios") && !statement.equals("Ciao") && !statement.equals("Goodbye")) {

            System.out.println(clem.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
