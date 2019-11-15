package org.owr.aawe.gui.main;

import org.owr.aawe.gui.menus.ContextMenu;
import org.owr.aawe.gui.menus.MainMenuBar;
import org.owr.aawe.state.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow implements ComponentListener {

    //	private Canvas canvas;
    private JFrame frame;

    private WorkspaceCanvas wsCanvas;
    private MainMenuBar mainMenuBar;
    private Dimension dim;

    public MainWindow(State st) {

        dim = new Dimension(800, 600);

        frame = new JFrame("Arduino ASCII wiring editor");
        frame.addComponentListener(this);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainMenuBar = new MainMenuBar(e -> System.out.println(e.getActionCommand()));
        frame.setJMenuBar(mainMenuBar.getMenu());

        ContextMenu ctxMenu = new ContextMenu(e -> System.out.println(e.getActionCommand()));

        frame.add(ctxMenu.getMenu());


        frame.setSize(dim);
        frame.setMinimumSize(dim);

        wsCanvas = new WorkspaceCanvas();
        wsCanvas.setMinimumSize(dim);

        frame.add(wsCanvas, BorderLayout.CENTER);
        frame.pack();

        frame.addMouseWheelListener(e -> {
            if (e.isControlDown())
                wsCanvas.zoom(e.getWheelRotation() > 0, e.getX(), e.getY());
        });

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    ctxMenu.getMenu().show(frame, e.getX(), e.getY());
                }
            }
        });

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                if (KeyEvent.VK_ESCAPE == keyEvent.getKeyChar()) {
                    System.exit(0);
                }
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });


        frame.setVisible(true);


    }

    public void componentHidden(ComponentEvent e) {
    }

    public void componentMoved(ComponentEvent e) {
    }

    public void componentResized(ComponentEvent e) {
        wsCanvas.setSize(frame.getSize());
    }

    public void componentShown(ComponentEvent e) {

    }


}
