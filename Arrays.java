package myProjects;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  //      int Random = (int) (Math.random() * 6);
        int random1 = (int) (Math.random() * 7) +1;
        System.out.println(random1);
        int random2 = (int) (Math.random() * 7) +1;
        System.out.println(random2);
        int random3 = (int) (Math.random() * 7) +1;
        System.out.println(random3);

        int[] randomNums = {random1, random2, random3 };
        System.out.println(randomNums[0]);
        System.out.println(randomNums[1]);
        System.out.println(randomNums[2]);
    }
}
