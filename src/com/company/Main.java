package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String num = scanner.nextLine();
    int n = Integer.parseInt(num);
    // certainly, i understand that i could just scan int number, i just wanted to train how to use parseInt
    int x = 1;
    for (int i = 1; i <= n; i++) {
        x *= i;
    }
    System.out.println("Factorial: " + x);
    }
}
