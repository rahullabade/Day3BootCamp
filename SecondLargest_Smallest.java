package company;

import java.util.Scanner;

public class SecondLargest_Smallest {
    public static void main(String[] args) {
        int number, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements: ");
        number = scanner.nextInt();
        int a[] = new int[number];
        System.out.println("Enter all the Elements: ");
        for (int i = 0; i < number; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:" + a[number - 2]);
        System.out.println("Smallest:" + a[0]);
    }
}
