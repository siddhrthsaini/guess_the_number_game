package projects.guess_the_number_game;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int noOfGuesses=0;
    public int inputNumber;

     public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess The Number In The Range of 0 to 100");
        Scanner sc= new Scanner(System.in);
        inputNumber=sc.nextInt();
    }

        boolean isCorrectNumber () {
            noOfGuesses++;
            if (inputNumber == number) {
                System.out.println("you guessed right number in "+ noOfGuesses +" times");
                return true;
            } else if (inputNumber > number) {
                System.out.println("no. is too high ");
            } else if (inputNumber < number) {
                System.out.println("no. is too low");
            }
            return false;
        }
    }

    public class Guessing_number_game {
        public static void main(String[] args) {
            Game g=new Game();

            boolean b= false;
            while(!b){
                g.takeUserInput();
                b = g.isCorrectNumber();
            }

        }


        }




