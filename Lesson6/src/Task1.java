import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int first = randomGenerator.nextInt();
        int second = randomGenerator.nextInt();
        int third = randomGenerator.nextInt();


        System.out.println("first =" + first);
        System.out.println("second = " + second);
        System.out.println("third=" + third);
        int sum = first + second + third;
        System.out.println("first+secons+third=" + sum);
    }
}