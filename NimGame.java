import java.util.Scanner;
import java.util.Random;

class NimGame {
    public static void main (String[] args){
        Scanner reader = new Scanner (System.in);
        Random rand = new Random();

        String playerOne, playerTwo, chosenPile;
        System.out.println ("What is player 1's name: ");
        playerOne = reader.nextLine();
        System.out.println("What is player 2's name: ");
        playerTwo = reader.nextLine();


        int A,B,C, sticksChosen;
        A = rand.nextInt(9) + 1;
        B = rand.nextInt(9) + 1;
        C = rand.nextInt(9)+  1;

       
        while (A != 0 || B != 0 || C !=0) {
             // prints out how many sticks are in each pile
            System.out.println("A: " + A + " B: " + B + " C: " + C);
            System.out.println(playerOne + ", choose a pile: ");
            reader.nextLine();
            chosenPile = reader.nextLine();
            chosenPile = chosenPile.toUpperCase();
            if((chosenPile.equals ("A") && A == 0)|| ( chosenPile.equals("B") && B ==0) || (chosenPile.equals ("C") && C ==0)){
                System.out.println("This pile is empty. Choose a different pile: ");
                chosenPile = reader.nextLine();
                chosenPile = chosenPile.toUpperCase();
            }
            System.out.println("How many to remove from pile " + chosenPile);
            sticksChosen = reader.nextInt();

            // if the user inputs a number than is more than the amount of sticks in the pile
            if (sticksChosen > A || sticksChosen > B || sticksChosen > C){
                System.out.println("The amount of sticks chosen in more than the actual amount of sticks in the pile. Choose again: ");
                sticksChosen = reader.nextInt();
            }
            if (chosenPile.equals ("A")){
                A = A - sticksChosen;
            }
            else if (chosenPile.equals ("B")){
                B = B - sticksChosen;
            }
            else if (chosenPile.equals ("C")){
                C = C - sticksChosen;
            }

        
            // player 2's turn
            System.out.println("A: " + A + " B: " + B + " C: " + C);
            System.out.println(playerTwo + ", choose a pile: ");
            reader.nextLine();
            chosenPile = reader.nextLine();
            chosenPile = chosenPile.toUpperCase();
            if ((chosenPile.equals ("A") && A == 0)|| ( chosenPile.equals("B") && B ==0) || (chosenPile.equals ("C") && C ==0)){
                System.out.println("This pile is empty. Choose a different pile: ");
                chosenPile = reader.nextLine();
                chosenPile = chosenPile.toUpperCase();
            }
            System.out.println("How many to remove from pile " + chosenPile);
            sticksChosen = reader.nextInt();
            // if the user inputs a number than is less than the amount of sticks in the pile
            while((sticksChosen > A) || (sticksChosen > B) ||( sticksChosen > C)){
                System.out.println("The amount of sticks chosen in more than the actual amount of sticks in the pile. Choose again: ");
                sticksChosen = reader.nextInt();
            }
            if (chosenPile.equals ("A")){
                A = A - sticksChosen;
            }
            else if (chosenPile.equals ("B")){
                B = B - sticksChosen;
            }
            else if (chosenPile.equals ("C")){
                C = C - sticksChosen;
            }

        }

        reader.close();

    }
}


