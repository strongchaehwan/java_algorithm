package baekjoonBronze;

import java.util.Scanner;

public class Bronze2439 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int k=num-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
