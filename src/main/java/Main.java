/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to be summed");
        int n = input.nextInt();
        int sum = 0;
        sumOfNum(n);
    }

    public static void sumOfNum(int n) {
        int sum = 0;
        int j = 0;
        while (j < n) {
            sum = n;
            j++;
            //System.out.println(n);
            while (n != 0) {
                n = n - 1;
                sum = sum + n;
            }
            System.out.println(sum);
        }
    }
}
