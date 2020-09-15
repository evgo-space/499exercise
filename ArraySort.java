import java.util.Scanner;

//main class for sorted array project

public class ArraySort{

    public static void main(String[] args) {
        String input = "";
        String output = "";

        boolean gate = true;

        final Scanner scan = new Scanner(System.in);

        System.out.println("Do you wish to sort integers or characters?");
        
        while(gate){
            input = scan.nextLine();
            if(input.equals("integers")){
                System.out.println("enter an array of integers");
                System.out.println("--> " + intSort(scan.nextLine()));
            } else if (input.equals("characters")) {
                System.out.println("enter an array of characters");
                System.out.println("--> " + charSort(scan.nextLine()));
            }
            // output =
            System.out.println("\n");
        }
    }

    public static String intSort(String arr) {
        return arr;
    }

    public static String charSort(String arr){
        return arr;
    }
}