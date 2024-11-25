package myProjects;
import java.util.Scanner;
import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] randomNumbers = new int[3];                           //the array of hidden numbers
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(7)+1;
        }
        System.out.print("HINT: Coordinates of cargo: (");
        System.out.print(randomNumbers[0]+ ", ");
        System.out.print(randomNumbers[1]+", ");
        System.out.print(randomNumbers[2]+")");
        System.out.println(" ");
        System.out.println("You've lost your cargo, hidden in 3 coordinates on 7 kilometre desert road.");
        System.out.println("Type 3 coordinates(km) where the cargo might be buried:");
        int numberOfTries =5;
        while(numberOfTries>0) {
            int correct = 0;
            int[] guessNumbers =new int[3];                     //the array of input numbers (coordinates)
            for(int i = 0; i < 3; i++){
                guessNumbers[i] = sc.nextInt();
            }
            for (int i = 0; i < randomNumbers.length;i++) {         //formula of finding same elements in 2 arrays
                for (int j = 0; j < guessNumbers.length; j++) {
                    if (randomNumbers[i] == guessNumbers[j]) {
                        correct++;
                        break;
                    }
                }
            }
            System.out.println("Correct: " + correct);
            if (correct == 3) {
                System.out.println("You found all cargoes! Congratulations!");
                break;
            }
            numberOfTries--;
            System.out.println("numb of tries: " + numberOfTries);

            if(numberOfTries==0) {
                for (int i = 0; i < randomNumbers.length; i++) {
                    randomNumbers[i] = random.nextInt(7)+1;
                }
                numberOfTries=5;
                System.out.println("You have entered 5 times, the coordinates have been reset");
                System.out.print("HINT: Coordinates of cargo: (");
                System.out.print(randomNumbers[0]+ ", ");
                System.out.print(randomNumbers[1]+", ");
                System.out.print(randomNumbers[2]+")");
            }
       }
    }
}
