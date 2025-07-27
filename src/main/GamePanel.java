package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    // Screen settings
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3; //scaling the tile size

    final int tileSize = originalTileSize * scale; // 48x48 tile size
    // Setting the size of the screen
    final int maxScreenCol = 16; // 16 columns
    final int maxScreenRow = 12; // 12 rows
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    //Frames Per Second
    int FPS = 60;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    // set players default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {
        // setting screen size to 768x576 pixels
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        // sets background to black
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

        // Adding Keylistener
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    // Create startGameThread Constructor
    public void startGameThread() {
        // Passes the GamePanel class in the Thread constructor
        gameThread = new Thread(this);
        // Start the thread
        gameThread.start();
    }

    // Create run constructor
    @Override
    public void run() {
        while(gameThread != null) {
            // System.out.println("Game loop is currently running");



            // Update: update chracter position
            update();

            // Draw: draw the screen with updated info
            repaint();
        }
    }
    public void update() {
        if (keyH.upPressed == true) {
            playerY -= playerSpeed;
        }
        else if (keyH.downPressed == true) {
            playerY += playerSpeed;
        }
        else if (keyH.leftPressed == true) {
            playerX -= playerSpeed;
        }
        else if (keyH.rightPressed == true) {
            playerX += playerSpeed;
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);

        g2.fillRect(playerX, playerY, tileSize, tileSize);

        g2.dispose();
    }
}
