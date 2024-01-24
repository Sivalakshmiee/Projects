import java.io.*;
import java.util.*;

public class Array_List {
    public static void main(String args[]) {
        Scanner get = new Scanner(System.in);
        String x;
        ArrayList<String> al = new ArrayList<>(10);
        int choice;
        int k = 1;

        while (k == 1) {
            System.out.println(
                    "1.Append the element - at end \n 2.Insert - at the particular Index \n 3.Search \n 4.List all strings starts with the given letter \n 5.Display \n 6.Exit \n");
            choice = get.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the element:");
                    x = get.next();
                    al.add(x);
                    break;
                }
                case 2: {
                    System.out.println("Enter the Index:");
                    int y = get.nextInt();
                    System.out.println("Enter the element:");
                    x = get.next();
                    al.add(y, x);
                    break;
                }
                case 3: {
                    System.out.println("Enter the no. to be search:");
                    String el = get.next();
                    if (al.contains(el)) {
                        System.out.println("Yes,the element is present");
                    } else {
                        System.out.println("No such element is present");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter the Starting letter:");
                    String letter = get.next();
                    for (String i : al) {
                        if (al.startsWith(letter)) {
                            System.out.println(i);
                        }
                    }
                    break;
                }
                case 5: {
                    if (al.isEmpty()) {
                        System.out.println("Empty list");
                    }
                    for (String i : al) {
                        System.out.println(i);
                    }
                    break;
                }
                case 6: {
                    k = 2;
                    break;
                }
            }
        }
    }
}