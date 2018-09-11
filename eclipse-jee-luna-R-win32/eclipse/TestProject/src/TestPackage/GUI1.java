package TestPackage;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class GUI1 extends JFrame{

private JButton button;

//Set Hight and Width of Interface
private static final int WIDTH = 500;
private static final int HEIGHT = 500;

//Method to Create Inteface
public GUI1(){
    createComponents();
    createDisplay();
    setSize(WIDTH, HEIGHT);
}

//An Action Listener To Contorl Action Preformed
class ClickListener implements ActionListener{
    public void actionPerformed(ActionEvent event){

    }
}
//Method to Create Button
private void createComponents(){
    button = new JButton("Click Me");
    ActionListener listener = new ClickListener();
    button.addActionListener(listener);

    JPanel panel = new JPanel();
    panel.add(button);
    add(panel);

}
//Method To Create Display
private void createDisplay(){
    JTextArea myArea = new JTextArea();
    
    JPanel panel1 = new JPanel();
    panel1.add(myArea);
    add(panel1);
}
}