package ru.netology;

public class Main {
    public static void main(String[] args) {
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        Object rest = Services.calculate(income, expenses, threshold);
        System.out.println(rest);
    }
}
