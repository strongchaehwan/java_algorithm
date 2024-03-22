package baekjoonBronze;

import java.util.Scanner;

public class Bronze2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = 0;

        if(num1==num2&&num1==num3)
        {
            sum = 10000 + num1 *1000;
        }
        else if (num1==num2&&num1!=num3 || num2==num3 &&num1!=num3 || num1==num3 && num2!=num3) {
            if(num1==num2){
                sum = 1000+num1*100;
            } else if (num1==num3) {
                 sum = 1000+num1*100;
            } else if(num2==num3)  sum = 1000+num2*100;



        }
        else if(num1!=num2&&num1!=num3&&num2!=num3)
        {
            if(num1>num2)
            {
                if(num1>num3)
                {
                    sum = num1*100;
                }
                else if(num3>num1)
                {
                    sum = num3*100;
                }
            }
            else if(num2>num1)
            {
                if(num2>num3)
                {
                    sum = num2 *100;
                } else if (num3>num2) {
                    sum = num3*100;
                }
            }
        }
        System.out.println(sum);
    }
}
