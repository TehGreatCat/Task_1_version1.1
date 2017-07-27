package com.romanov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> NumsArray = new ArrayList<>();

    static WordsToNums Thread_1;

    static MemoryChecker Thread_2;

    static Scanner sc = new Scanner(System.in).useDelimiter("//n");

    static Boolean go_on_flag = true;

    public static void main(String[] args) {
        Thread_1 = new WordsToNums();
        Thread_2 = new MemoryChecker();

        Thread_2.start();
        Thread_1.start();
    }

    public static void stopAllThreads() {
        go_on_flag = false;
    }

}
