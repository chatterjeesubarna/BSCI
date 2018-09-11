package TestPackage;

import javax.swing.*;
import java.awt.event.*;

public class GUITest{
public static void main (String [] agrs){

    JFrame frame = new GUI1();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setTitle("Test");
    
    JTextArea myArea = new JTextArea();
    
    JPanel panel1 = new JPanel();
    panel1.add(myArea);
    //add(panel1);
}
}