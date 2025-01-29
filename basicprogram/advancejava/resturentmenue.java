package advancejava;

import javax.swing.*;

public class resturentmenue {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Restaurant Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        
        JTextArea textArea = new JTextArea("Welcome to Our Restaurant!\n");
        textArea.setEditable(false);
        frame.add(textArea);

        
        JMenuBar menuBar = new JMenuBar();

        
        JMenu chineseMenu = new JMenu("Indian");
        JMenuItem noodlesItem = new JMenuItem("North Indian");
        JMenuItem friedRiceItem = new JMenuItem("South Indian");

        
        noodlesItem.addActionListener(e -> showDishes("Indian", "Dal bati, Aloo Paratha"));
        friedRiceItem.addActionListener(e -> showDishes("Indian", "Masala Dosa, Upma"));

        
        chineseMenu.add(noodlesItem);
        chineseMenu.add(friedRiceItem);

        
        
        
        menuBar.add(chineseMenu);
        
        frame.setJMenuBar(menuBar);

        
        frame.setVisible(true);
    }

    private static void showDishes(String category, String dishes) {
        JOptionPane.showMessageDialog(null, category + " Dishes:\n" + dishes);
    }
}