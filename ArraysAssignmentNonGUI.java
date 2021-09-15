/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysassignmentnongui;

import java.util.Scanner;

/**
 *
 * @author Riley
 */
public class ArraysAssignmentNonGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char secret[];//Stores the secret combination
        //char guess[];//Stores the user guess
        String userGuess;
        int numChar;//Stores how many letters the user wants to guess
        int round = 0;//Round number
        int numGuess = 0;//Number of guesses per round
        int numCorrect = 0;//Number of letter guessed correctly
        int numIncorrect = 0;//Number of letter guessed incorrectly
        boolean playAgain = true;      
        boolean correct = false;//If user guessed the secret code
        Scanner scan = new Scanner(System.in);
        
        //Game
        while(playAgain == true)
        {
            round++;
            System.out.println("How many letters would you like to guess?"); 
            numChar = scan.nextInt();
            //Generates the secret code
            char[] secret = new char[numChar];//sets the size of the array
            char[] guess = new char[numChar];//sets the size of the array
            for(int i = 0; i < numChar; i++)
            {
                int random = (int)(Math.random()*3);//Generates a number from 0 - 2
                //System.out.println(random);             
                switch(random)//Adds the corresponding char to the secret array
                {
                    case 0://Add 'r'
                        secret[i] = 'r';                       
                        break;                    
                    case 1://Add 'g'
                        secret[i] = 'g'; 
                        break;
                    case 2://Add 'b'
                        secret[i] = 'b'; 
                        break;           
               } 
            }  
            String junk = scan.nextLine();//Removes a blank input
            while(correct == false)
            {
                numGuess++;
                System.out.println("Please guess "+numChar+" letters (r,g,b)");
                userGuess = scan.nextLine();
                for(int n = 0; n < numChar; n++){//stores the user guess in the array
                    guess[n] = userGuess.charAt(n);
                    System.out.println(guess[n]);
                }               
                //Compare guess to secret code
                for(int q = 0; q < numChar; q++)
                {
                    if(secret[q] == guess[q]) 
                    {
                        numCorrect++;      
                    }
                }
                System.out.println("You got "+numCorrect+" letter correct");
                if(numCorrect == numChar)
                {
                    System.out.println("Congragulations! You got it!");
                    //Ask if they want to play again
                }
                numCorrect = 0;//Reset the counter
            }
        }
    }
}   

