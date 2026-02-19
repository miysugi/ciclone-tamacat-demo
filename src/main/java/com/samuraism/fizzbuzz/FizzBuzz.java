package com.samuraism.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    /**
     * Determines whether a given integer is divisible by 3, 5, or both, and returns the corresponding string.
     * If the number is divisible by 3, "Fizz" is returned.
     * If the number is divisible by 5, "Buzz" is returned.
     * If the number is divisible by both 3 and 5, "FizzBuzz" is returned.
     * If the number is not divisible by 3 or 5, the number itself is returned as a string.
     *
     * @param number the integer to evaluate for divisibility by 3 and 5
     * @return "Fizz" if the number is divisible by 3, "Buzz" if divisible by 5,
     *         "FizzBuzz" if divisible by both 3 and 5, or the number as a string if divisible by neither
     */
    public static String fizzBuzz(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 3 != 0 && number % 5 != 0) {
            result = String.valueOf(number);
        }
        return result;
    }

    
}