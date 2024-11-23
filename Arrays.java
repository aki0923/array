package myProjects;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random1 = (int) (Math.random() * 7) +1;
        int random2 = (int) (Math.random() * 7) +1;
        int random3 = (int) (Math.random() * 7) +1;

        int[] randomNums = {random1, random2, random3 };            //the hidden numbers
        System.out.print("Coordinates of cargo: (");
        System.out.print(randomNums[0]+ ", ");
        System.out.print(randomNums[1]+", ");
        System.out.print(randomNums[2]+")");
        System.out.println(" ");

        System.out.println("You've losted your cargo, hidden in 3 coordinates on 7 kilometre desert road.");
        System.out.println("Type 3 coordinates where the cargo might be buried:");

        int x =sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] exampleNums = {x, y, z};
        int correct = 0;

        for (int i = 0; i < 3; i++) {
            int a = exampleNums[i];
            for (int j = 0; j < 3; j++)
            {
                if (a == randomNums[j])
                {
                    correct++;
                    break;
                }
            }
        }

        System.out.println(correct);
    }
}
