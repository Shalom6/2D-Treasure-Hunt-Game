package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a window and exit the window when closed
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make sure the window is not resizable and window title
        window.setResizable(false);
        window.setTitle("2D Treasure Hunt");

        // Centers the location of the window
        window.setLocationRelativeTo(null);
        // Makes the window visible
        window.setVisible(true);
    }
}