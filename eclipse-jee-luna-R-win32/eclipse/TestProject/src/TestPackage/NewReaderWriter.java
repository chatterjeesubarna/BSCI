package TestPackage;

import java.io.*;
import java.util.Enumeration;
import java.lang.*;

import javax.comm.CommPortIdentifier;
import javax.comm.NoSuchPortException;
//import jssc.SerialPort;
//import jssc.SerialPortException;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;

public class NewReaderWriter implements Runnable, SerialPortEventListener
{

	  static CommPortIdentifier portId;
	  static Enumeration portList;
	  static Process pro1;
	  static InputStream inputStream;
	  static SerialPort serialPort;
	  Thread readThread;
	  int vs_id;
	  byte[] readBuffer;
	  
	public static void ReaderListener(int userid, int vs_id)
	{
		String folder_name = "user" + userid;
		File dir = new File(folder_name);
		dir.mkdir();
		System.out.println("Folder created: " + folder_name);
		new Reader(userid, folder_name, vs_id);
	}
	  
	public NewReaderWriter()
	{
		try 
		{
			String str = CommPortIdentifier.getPortIdentifier("COM4").toString();
			System.out.println("Value: "+ str);
			portList = CommPortIdentifier.getPortIdentifiers();
		    System.out.println("portList... " + portList + " status: " + portList.hasMoreElements());
		    while (portList.hasMoreElements()) 
		    {
		        portId = (CommPortIdentifier) portList.nextElement();
		        if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) 
		        {
		            System.out.println("port identified is Serial.. " + portId.getPortType());
		            if (portId.getName().equals("COM4")) 
		            {
		                System.out.println("port identified is COM2.. " + portId.getName());
		                serialPort = (SerialPort) portId.open("jhgjfsa",500);
		                System.out.println(" Serial Port.. port id " + portId );
		                inputStream = serialPort.getInputStream();
		                System.out.println(" Input Stream... " + inputStream);
		                System.out.println(" Port opened successfully!! ");
		                serialPort.addEventListener(this);
		                serialPort.notifyOnDataAvailable(true);
		                serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8,
		                        SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

		                // no handshaking or other flow control
		                serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);

		                // timer on any read of the serial port
		                serialPort.enableReceiveTimeout(500);

		                System.out.println("................");
		                readThread = new Thread(this);
		                readThread.start();
		            } 
		            else 
		            {
		                System.out.println("unable to open port");
		            }
		        }
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	
	public void run() {
	    try {
	        System.out.println("In run() function ");
	        Thread.sleep(500);
	        // System.out.println();
	    } catch (InterruptedException e) {
	        System.out.println("Interrupted Exception in run() method");
	    }
	}

	public void serialEvent(SerialPortEvent event) 
	{
	    // System.out.println("In Serial Event function().. " + event +
	    // event.getEventType());
	    switch (event.getEventType()) 
	    {
		    /*
		     * case SerialPortEvent.BI: case SerialPortEvent.OE: case
		     * SerialPortEvent.FE: case SerialPortEvent.PE: case SerialPortEvent.CD:
		     * case SerialPortEvent.CTS: case SerialPortEvent.DSR: case
		     * SerialPortEvent.RI: case SerialPortEvent.OUTPUT_BUFFER_EMPTY: break;
		     */
		    case SerialPortEvent.DATA_AVAILABLE:
		        readBuffer = new byte[1];
		        try
		        {
		        	while (inputStream.available()>0) {
		   			int numBytes = inputStream.read(readBuffer);
		   			String value = new String(readBuffer);
		   			System.out.print(value);
		   			System.out.println();
		   			NewQ.write(value);
		 	    }
		           //System.out.print(new String(readBuffer));
		        } catch (IOException e) {
		            System.out.println("IO Exception in SerialEvent()");
		        }
		        break;
	    }	    
	}
		
	/*public static void main(String[] args) 
	{
				 
		Q q = new Q();
		
	}*/

}
