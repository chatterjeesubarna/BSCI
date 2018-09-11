package TestPackage;

import java.io.*;
import java.applet.*;
 
public class ReaderExample3 extends Applet{
 
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
 
			String sCurrentLine;
			String q = new String();
			q.concat("");
			int s = 0;
			/*if (args[0].equals("l") ) s = 12;
			if (args[0].equals("g")  )  { s=11;}
			if (args[0].equals("o")  )  { s=13;}*/
			q = "" + Integer.valueOf(s);
			
			System.out.println(" inside Readerexample3.java");
			String path = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "user" + args[1] + File.separator + args[1] + ".txt";
			System.out.println(path);
			String path2 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "user" + args[1] + File.separator + "output1.txt";
			File file = new File(path2);
			System.out.println("Deletion status: " + file.delete() + " Existing status: " + file.exists());
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);			
			
			br = new BufferedReader(new FileReader(path));
 
			int index = 0, count=0, f = 0; int start = 10, stop = 12;
			int c=0;
					
			int max=0, min=0;
			if(args[0].equals("l"))    //less than 50%
			{
				min = 0;
				max = 50;
			}
			else if(args[0].equals("g"))   //greater than 50%
			{
				min = 51;
				max = 90;
			}
			if(args[0].equals("o"))			//outstanding
			{
				min = 91;
				max = 100;
			}
			
			System.out.println("min: "+min + " max: " + max);
			while ((sCurrentLine = br.readLine()) != null) 
			{
				if (sCurrentLine.length() == 0) continue;
				int battery = Integer.parseInt(sCurrentLine.substring(26, 28));
				//System.out.println("extracted battery: " + battery + " Length: " + sCurrentLine.length());
				
				if (battery>=min && battery<=max)
				{
					fw.append(sCurrentLine+"\n");
					bw.newLine();
					//System.out.println("Syring:: " + sCurrentLine + " Length: " + sCurrentLine.length());
				}			 
			}
			
			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}