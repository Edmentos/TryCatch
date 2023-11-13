import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args){
        try{
            System.out.println("Please enter a number between 0 - 9:");
            Scanner myscan = new Scanner(System.in);

            String input = myscan.nextLine();

            int number = Integer.parseInt(input);

            if(0 <= number  && number<= 9) {
                System.out.println("Youve entered" +number);
            }
            else{
                System.out.println("Not a valid input");;
            }

        }

        catch(NumberFormatException e) {
         System.out.println("Not a valid input");
        }



    }








}

