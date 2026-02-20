package com.samuraism.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    /**
     * 指定された整数に応じて "Fizz", "Buzz", または "FizzBuzz" を返すメソッド。
     * 以下のルールに従って結果を決定する:
     * - 数値が3の倍数の場合は "Fizz" を返す。
     * - 数値が5の倍数の場合は "Buzz" を返す。
     * - 数値が3と5両方の倍数の場合は "FizzBuzz" を返す。
     * - それ以外の場合は数値をそのまま文字列として返す。
     *
     * @param number 判定を行う整数
     * @return 条件に基づき "Fizz", "Buzz", "FizzBuzz", または数値の文字列表現を返す
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