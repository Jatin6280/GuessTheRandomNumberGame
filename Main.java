package com.company;
import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator {
    public int getRandomNumber(int i) {
        Random random = new Random();
        return random.nextInt(i) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("----Welcome to GuessTheRandomNumberGame----");
        Scanner sc = new Scanner(System.in);

        RandomNumberGenerator rand = new RandomNumberGenerator();
        int randomNumber = rand.getRandomNumber(100); 
  
        int incNumber = randomNumber + 20;
        int decNumber = randomNumber - 20;

        System.out.println("Enter a number between 1-100:");
        int input = sc.nextInt();

        if (input == randomNumber) {
            System.out.println("Wow! You guessed the correct number on the first try!");
        } else {
     
            while (input != randomNumber) {
                System.out.println("Wrong guess! Try again.");

               
                if (input > incNumber) {
                    System.out.println("Hint: You are way too high!");
                } else if (input < decNumber) {
                    System.out.println("Hint: You are way too low!");
                } else {
                    System.out.println("Hint: You are getting warm (within 20 numbers)!");
                }

                System.out.print("Enter your next guess: ");
                input = sc.nextInt();
            }


            System.out.println("Congratulations! You finally guessed the correct number: " + randomNumber);
        }

        sc.close();
    }
}
