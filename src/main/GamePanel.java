package main;

import javax.swing.*;

public class GamePanel extends JPanel {
    // Screen settings
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3; //scaling the tile size

    final int tileSize = originalTileSize * scale; // 48x48 tile size
    // Setting the size of the screen
    final int maxScreenCol = 16; // 16 columns
    final int maxScreenRow = 12; // 12 rows
}
