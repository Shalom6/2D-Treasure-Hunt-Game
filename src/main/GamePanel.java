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

    Thread gameThread;

    public GamePanel() {
        // setting screen size to 768x576 pixels
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        // sets background to black
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

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

    }
}
