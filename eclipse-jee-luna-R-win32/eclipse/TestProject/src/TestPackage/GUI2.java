package TestPackage;

//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GUI2 implements Runnable{
  
  //Note: Typically the main method will be in a
  //separate class. As this is a simple one class
  //example it's all in the one class.
  Thread t;
  JFrame guiFrame;
  JTextArea myArea;
  JLabel comboLbl;
  final JPanel comboPanel;
  JComboBox fruits;
  JScrollPane scrollingArea;
  String file_details;
  public static void main1(String file_details) {
      
	  //this.file_details
      //new GUI2();
  }

  public GUI2(String file_details)
  {
      guiFrame = new JFrame();
      
      //make sure the program exits when the frame closes
      guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      guiFrame.setTitle("Example GUI");
      guiFrame.setSize(300,250);
    
      //This will center the JFrame in the middle of the screen
      guiFrame.setLocationRelativeTo(null);
      
      //Options for the JComboBox 
      /*String[] fruitOptions = {"Apple", "Apricot", "Banana"
              ,"Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"};*/
      
      String[] fruitOptions = {"Virtual Sensor 1"};
      
      //Options for the JList
      /*String[] vegOptions = {"Asparagus", "Beans", "Broccoli", "Cabbage"
              , "Carrot", "Celery", "Cucumber", "Leek", "Mushroom"
              , "Pepper", "Radish", "Shallot", "Spinach", "Swede"
              , "Turnip"};*/
      
      //The first JPanel contains a JLabel and JCombobox
      comboPanel = new JPanel();
      comboLbl = new JLabel("Virtual Sensor List:");
      fruits = new JComboBox(fruitOptions);
      
      comboPanel.add(comboLbl);
      comboPanel.add(fruits);
      this.file_details = file_details;
      t = new Thread(this, "display");
      t.start();
           
      /*while(c++<=5)
      {
    	  String str = "hiii" + c + "\n";
          myArea.append(str);
      }*/
      
      
      //Create the second JPanel. Add a JLabel and JList and
      //make use the JPanel is not visible.
      final JPanel listPanel = new JPanel();
      listPanel.setVisible(false);
      JLabel listLbl = new JLabel("Vegetables:");
      //JList vegs = new JList(vegOptions);
      //vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        
      listPanel.add(listLbl);
      //listPanel.add(vegs);
      
      JButton vegFruitBut = new JButton( "Close");
      
      //The ActionListener class is used to handle the
      //event that happens when the user clicks the button.
      //As there is not a lot that needs to happen we can 
      //define an anonymous inner class to make the code simpler.
      vegFruitBut.addActionListener(new ActionListener()
      {
          @Override
          public void actionPerformed(ActionEvent event)
          {
             //When the fruit of veg button is pressed
             //the setVisible value of the listPanel and
             //comboPanel is switched from true to 
             //value or vice versa.
             //listPanel.setVisible(!listPanel.isVisible());
             //comboPanel.setVisible(!comboPanel.isVisible());
             
        	 guiFrame.setVisible(false); //you can't see me!
        	 guiFrame.dispose();

          }
      });
      
      //The JFrame uses the BorderLayout layout manager.
      //Put the two JPanels and JButton in different areas.
      guiFrame.add(comboPanel, BorderLayout.NORTH);
      guiFrame.add(listPanel, BorderLayout.CENTER);
      guiFrame.add(vegFruitBut,BorderLayout.SOUTH);
      
      //make sure the JFrame is visible
      guiFrame.setVisible(true);
  }
  
  public void run()
  {
	  myArea = new JTextArea(6,20);
      myArea.setLineWrap(true);
      comboPanel.add(myArea);
      scrollingArea = new JScrollPane(myArea);
      comboPanel.add(scrollingArea);
      myArea.setText(" Welcome \n");
      int c=0;
      
      String inputLine = "";
      //String path = "user1" + File.separator + "1.txt"; //"D:" + File.separator + "hii12.txt";
      File file = new File(file_details);
      //file.delete();
      FileReader inputFile;
      try 
      {
		inputFile = new FileReader(file_details);
		BufferedReader br = new BufferedReader(inputFile);
		
		while(true)
	      {
			  String printline = ""; String output ;
			  inputLine = br.readLine();
			  if(inputLine == null)
				  Thread.sleep(500);
			  else
				  {
				  	if (inputLine.length() <= 7) continue;
				  	if (inputLine.charAt(16) == 'T')
				  	{
				  		float val1 = Float.parseFloat(inputLine.substring(19, 23)) / 8;
				  		
				  		try {
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\desktop\\sensor-cloud.accdb";
				            Connection conn = DriverManager.getConnection(url);
				            Statement st = conn.createStatement();

				            String selTable = "SELECT CalibratedVal from LookUp where SourceVal = " + val1;
				            System.out.println(selTable);
				            ResultSet rs = st.executeQuery(selTable);
				            
				            while(rs.next())
				            {    
				            	output = " " + rs.getString("CalibratedVal");
				            	//System.out.println("CalibratedVal: " + rs.getString("CalibratedVal")); 
				            	System.out.println("CalibratedVal: " + output); 
				            	printline = "" + output + "\u00b0" + "C ";
				            }
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				  		
				  		//printline = inputLine.substring(19, 23) + " " + "\u00b0" + "C ";
				  		System.out.println("printline: " + printline);
				  	}
				  	else
				  	{
				  		printline = inputLine.substring(16, 17) + " " + inputLine.substring(19, 23);
				  	}
				  	System.out.println(inputLine); // Write to the screen
				  	myArea.append(printline + "\n");
				  }
	    	  
	    	  //myArea.read(inputFile, "blah");
	    	  //Thread.sleep(1000);s	    	  
	      }
	  } catch (Exception e) {
		e.printStackTrace();
	}
  }
  
}