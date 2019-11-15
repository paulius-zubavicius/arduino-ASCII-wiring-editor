package org.owr.aawe;

import org.owr.aawe.gui.main.MainWindow;
import org.owr.aawe.state.State;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {

        State st = new State();

        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                new MainWindow(st);
            }
        });


    }

}
