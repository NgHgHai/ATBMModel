package vn.edu.atbm_gui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("app");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.setSize(600, 250);
        JPanel pnMain = new indexApp().pnMain;
        frame.setContentPane(pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setVisible(true);


    }
}
