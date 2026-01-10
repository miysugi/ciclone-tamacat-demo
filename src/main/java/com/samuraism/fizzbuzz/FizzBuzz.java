package com.samuraism.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    /**
     * 指定された数値に基づき、FizzBuzz の判定結果を返します。
     * 判定ルール:
     * <ul>
     *     <li>3 で割り切れる場合は "Fizz"</li>
     *     <li>5 で割り切れる場合は "Buzz"</li>
     *     <li>3 と 5 の両方で割り切れる場合は "FizzBuzz"</li>
     *     <li>それ以外の場合は、その数値を文字列として返します</li>
     * </ul>
     *
     * @param number 判定する数値
     * @return 判定結果の文字列
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