package org.owr.aawe.gui.main;

import javax.swing.*;
import java.awt.*;

public class WorkspaceCanvas extends JPanel {

    private static final int MIN_CELL_SIZE = 14;
    private static final int MAX_CELL_SIZE = 36;

    private static final int FONT_SIZE_OFFSET = 4;

    private Color gridColir = new Color(225, 225, 225);
    private int cellSize = 20;


    public WorkspaceCanvas() {

        setBackground(new Color(255, 255, 255));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setFont(new Font("Monospaced", Font.BOLD, cellSize - FONT_SIZE_OFFSET));
    }

    public void zoom(boolean in, int x, int y) {

        cellSize += (in ? 2 : -2);

        if (cellSize > MAX_CELL_SIZE) {
            cellSize = MAX_CELL_SIZE;
        }

        if (cellSize < MIN_CELL_SIZE) {
            cellSize = MIN_CELL_SIZE;
        }

        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        grid(g);
        g.setColor(Color.BLACK);

        setFont(new Font("Monospaced", Font.BOLD, cellSize - FONT_SIZE_OFFSET));
        g.drawString("─────┐", cellSize, cellSize * 1);
        g.drawString("     █ 220 KΩ", cellSize, cellSize * 2);
        g.drawString("─────┘", cellSize, cellSize * 3);

        g.drawString("Any text", 0, cellSize * 4);
        g.drawString("Any text", 0, cellSize * 5);
        g.drawString("Any text", 0, cellSize * 6);
        g.drawString("Any text", 0, cellSize * 7);
        g.drawString("Any text", 0, cellSize * 8);
        g.drawString("Any text", 0, cellSize * 9);
        g.drawString("Any text", 0, cellSize * 10);
//        g.drawString("Any text", (getWidth() - 300), getHeight() - 150);
        g.drawRect(0, 0, 20, 20);
        g.drawString("Any text", (getWidth() - 300), getHeight() - 150);
    }

    private void grid(Graphics g) {
        g.setColor(gridColir);

        for (int x = 0; x < getWidth(); x += cellSize) {
            g.drawLine(x, 0, x, getHeight());
        }

        for (int y = 0; y < getHeight(); y += cellSize) {
            g.drawLine(0, y, getWidth(), y);
        }


    }
}
