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
        System.out.println(" ");

        int x =sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] exampleNums = {x, y, z};
        int correct = 0;
        
        System.out.println(" ");
        for (int i = 0; i < 3; i++)
        {
            int a = exampleNums[i];
            for (int j = 0; j < 3; j++)
            {
                if (a == randomNums[j])
                {
                    System.out.println(a);
                    System.out.println("detected");
                    correct++;
                    break;
                }
            }
        }
    }
}
