package projects;

import java.util.Scanner;

public class Calculator {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("type of operation");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                System.out.println("enter first number");
                int num1 = sc.nextInt();
                System.out.println("enter second number");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                  }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
            }else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("invalid operation");
                }
            System.out.println(ans);
            }

        }
    }
