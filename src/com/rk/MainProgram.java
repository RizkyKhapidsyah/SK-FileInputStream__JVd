package com.rk;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileInputStream;

/*
    Source by Rahul Mandal, Hosted by GeeksForGeeks
    Modified For Learn by RK
    I.D.E : JB Intellij Idea 2019
*/

public class MainProgram {
    public static void main(String[] args)throws IOException {
        if (System.getProperty("ONLINE_JUDGE") == null) {

            PrintStream ps = new PrintStream(new File("output.txt"));
            InputStream is = new FileInputStream("input.txt");

            System.setIn(is);
            System.setOut(ps);
        }
    }
}
