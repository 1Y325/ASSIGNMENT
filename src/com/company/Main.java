package com.company;

import java.util.Scanner;
class InvalidAgeEException extends  Exception {
    public InvalidAgeEException(String age) {

        super(age);
    }

    public class Main {
        public static void main(String[] args) {
            int age;

            Scanner s = new Scanner(System.in);
            age = s.nextInt();

            if (age >= 18 || age < 60) {
                try {
                    throw new InvalidAgeEException("Invalid age");
                } catch (InvalidAgeEException obj) {
                    obj.printStackTrace();
                    System.out.println("error");
                }
            }

        }
    }
}