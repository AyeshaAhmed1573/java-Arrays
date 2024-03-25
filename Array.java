import java.util.Scanner;
import java.util.Arrays;
// Q: Program to print the largest element of a given array.

public class Array {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 2, 33, 6 };
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];

            }
        }
        System.out.println("The largest number in an array is" + a);
    }
}
// Q: Write a program to take size of an array from user input, take array
// elements from user input, sort the array in ascending order, finally print
// the elements of sorted array.

class Arraysorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int number[] = new int[len];
        int b[] = new int[len];

        for (int i = 0; i < len; i++) {
            number[i] = sc.nextInt();
            b[i] = number[i];

        }
        Arrays.sort(b);
        for (int i = 0; i < len; i++) {
            System.out.print(b[i] + ",");
        }

        sc.close();
    }
}
// Q: Add two 2D matrices using arrays.

class Matrices2d {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int arr2[][] = { { 3, 2, 5 }, { 7, 5, 6 } };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length + 1; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
// Q: Check whether two matrices are equal.

class MatricesEquality {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 1, 2, 3 } };
        int arr2[][] = { { 1, 2, 3 }, { 1, 2 } };

        boolean isEqual = true;
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length || arr1[1].length != arr2[1].length) {
            System.out.println("matrices are not equal");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    isEqual = false;
                    break;
                }
            }

        }

        if (isEqual) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }
    }
}
// Q: Write a Java Program to Calculate average (of floating point nums)using
// Array

class Average {
    public static void main(String[] args) {
        float list[] = { 32, 67.5f, 90.75f, 56.25f, 23, 100 };
        float s = 0;
        for (int i = 0; i < list.length; i++) {

            s = s + list[i];

        }
        float answer = s / list.length;
        System.out.println(answer);
    }
}
// Q: Sorting char array in Java.

class Charsorting {
    public static void main(String[] args) {
        char character[] = { 'g', 'F', '$', 'a', '=' };
        Arrays.sort(character);
        System.out.println(character);
        for (char i : character) {
            System.out.print(i + ",");
        }

    }
}
// Q: Java Program to print the duplicate elements of an array

class DuplicateArray {
    public static void main(String[] args) {
        int dup[] = { 4, 3, 6, 3, 44, 9, 4 };

        for (int i = 0; i < dup.length; i++) {

            for (int j = i + 1; j < dup.length; j++) {
                if (dup[i] == dup[j]) {
                    System.out.println(dup[i]);

                    break; // Exit inner loop since duplicate is found
                }
            }
        }
    }
}
// Q: Program to print duplicate elements of the String array

class DuplicateString {
    public static void main(String[] args) {
        String list[] = { "ayesha", "sara", "hafsa", "ali", "ayesha", "sara" };
        for (int i = 0; i < list.length; i++) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    System.out.println(list[i]);

                    break; // Exit inner loop since duplicate is found
                }
            }
        }
    }
}
