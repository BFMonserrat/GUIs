
package com.mycompany.mavenproject19;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
    
        myLabel = new JLabel();
        myLabel.setText("Hola Mundo");

      
        add(myLabel);

      
        setTitle("Mi JFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
      
        MyJFrame frame = new MyJFrame();
        frame.setVisible(true);
    }
}

