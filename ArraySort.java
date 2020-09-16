

import java.util.*;

//evan godberson modify this for proof!
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
            else {
                System.out.println("integers or characters?");
            }
            // output =
            System.out.println("Do you wish to sort integers or characters? \n");
        }
    }

    public static String intSort(String arr) {
        String[] str = new String[arr.length()];
        int[] intArr = new int[arr.length()];
        for(int i=0; i<arr.length(); i++){
            str[i] = Character.toString(arr.charAt(i));
        }
        for(int i=0; i<arr.length(); i++){
            try{
            intArr[i]=Integer.parseInt(str[i]);
            }
            catch(NumberFormatException e){
                System.out.println("error");
            }
        }
        Arrays.sort(intArr);
        return Arrays.toString(intArr);
    }

    public static String charSort(String arr){

        String[] str = new String[arr.length()];
        for(int i=0; i<arr.length(); i++){
            str[i] = Character.toString(arr.charAt(i));
        }

        Arrays.sort(str);
        return Arrays.toString(str);
    }


}