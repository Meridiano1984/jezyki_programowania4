package com.company;

import UserInterface.MyFrame;

public class Main {

    public static void main(String[] args) {


        try {
            MyFrame frame = new MyFrame();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }
}
