package myProjects;
import java.util.Scanner;
import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] randomNums = new int[3];            //the hidden numbers
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(7)+1;
        }
        System.out.print("HINT: Coordinates of cargo: (");
        System.out.print(randomNums[0]+ ", ");
        System.out.print(randomNums[1]+", ");
        System.out.print(randomNums[2]+")");
        System.out.println(" ");

        System.out.println("You've lost your cargo, hidden in 3 coordinates on 7 kilometre desert road.");
        System.out.println("Type 3 coordinates where the cargo might be buried:");



      //  int[] trueCombination = new int[3];

        int tries =5;
        while(tries>0) {
            int correct = 0;
            int[] exampleNums =new int[3];
            for(int i = 0; i < 3; i++){
                exampleNums[i] = sc.nextInt();
            }

            for (int i = 0; i < randomNums.length;i++) {
                int a = randomNums[i];
                for (int j = 0; j < exampleNums.length; j++) {
                    if (randomNums[i] == exampleNums[j]) {
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
            tries--;
            System.out.println("numb of tries: " + tries);


            if(tries==0) {
                for (int i = 0; i < randomNums.length; i++) {
                    randomNums[i] = random.nextInt(7)+1;
                }
                tries=5;
                System.out.println("You have entered 5 times, the coordinates have been reset");
                System.out.print("HINT: Coordinates of cargo: (");
                System.out.print(randomNums[0]+ ", ");
                System.out.print(randomNums[1]+", ");
                System.out.print(randomNums[2]+")");
            }

       }

        System.out.println("numb of tries: " + tries);
    }
}
