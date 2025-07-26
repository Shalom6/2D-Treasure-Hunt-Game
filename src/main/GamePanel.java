package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    // Screen settings
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3; //scaling the tile size

    final int tileSize = originalTileSize * scale; // 48x48 tile size
    // Setting the size of the screen
    final int maxScreenCol = 16; // 16 columns
    final int maxScreenRow = 12; // 12 rows
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    public GamePanel() {
        // setting screen size to 768x576 pixels
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        // sets background to black
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

    }
}
