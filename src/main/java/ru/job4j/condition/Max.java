package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int maxValue = left > right ? left : right;
        return maxValue;
    }

    public static void main(String[] args) {
        int left = 8;
        int right = 2;
        System.out.println(max(left, right));
    }
}