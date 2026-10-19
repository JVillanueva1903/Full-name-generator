package com.pluralsight;

public class fullnameapplication {
}
import java.util.Scanner;

public class FullNameBuilder {
    public static void main(String[] args) {
        java.lang.Object System = null;
        Scanner input = new Scanner(System.in);

        // Prompt for each part of the name
        System.out.print("Enter your first name: ");
        String first;
        first = input.nextLine().trim();

        System.out.print("Enter your middle name (press Enter if none): ");
        String middle = input.nextLine().trim();

        System.out.print("Enter your last name: ");
        String last = input.nextLine().trim();

        System.out.print("Enter your suffix (press Enter if none): ");
        String suffix = input.nextLine().trim();

        // Build full name
        String fullName;
        fullName = first;

        if (!middle.isEmpty()) {
            fullName += " " + middle;
        }

        fullName += " " + last;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Print result
        System.out.println("Full Name: " + fullName);
    }

    private static class Scanner {
        public java.lang.Object nextLine() {
            return null;
        }
    }
}