package baekjoonBronze;

import java.util.Scanner;

public class Bronze2440 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=1;i<=num;i++)
        {

          for(int j=num;j>=i;j--)
          {
              System.out.print("*");
          }
            System.out.println();
        }
    }
}
