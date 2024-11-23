package myProjects;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random1 = (int) (Math.random() * 7) +1;
        int random2 = (int) (Math.random() * 7) +1;
        int random3 = (int) (Math.random() * 7) +1;

        int[] randomNums = {random1, random2, random3 };            //the hidden numbers
        System.out.println(randomNums[0]);
        System.out.println(randomNums[1]);
        System.out.println(randomNums[2]);

        int x =sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] exampleNums = {x, y, z};
        int correct = 0;
        for (int i = 0; i <3; i++) {
            if(randomNums[i] == exampleNums[i]) {
                correct++;
            }
        }
        System.out.println("You have "+ correct +" correct");
    }
}
