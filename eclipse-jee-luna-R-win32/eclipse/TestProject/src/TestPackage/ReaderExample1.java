package TestPackage;

import java.io.*;
import java.applet.*;
 
public class ReaderExample1 extends Applet{
 
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
 
			System.out.println(" inside Readerexample1.java");
			String sCurrentLine;
			String q = new String();
			q.concat("");
			int s = 0;
			if (args[0].equals("T") ) s = 12;
			if (args[0].equals("L")  )  { s=11;}
			if (args[0].equals("H")  )  { s=13;}
			q = "S" + Integer.valueOf(s);
			
			System.out.println("sensor id: "+s);
			//String path = "user1" + File.separator + "1.txt";
			String path = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "user" + args[1] + File.separator + args[1] + ".txt";
			System.out.println(path);
			String path2 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "user" + args[1] + File.separator + "output1.txt";
			File file = new File(path2);
			System.out.println("Deletion status: " + file.delete() + " Existing status: " + file.exists());
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
			/*if(file.exists())
			{
				System.out.println("Deletion status: " + file.delete());
				file = new File(path2);
			}*/
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			
			br = new BufferedReader(new FileReader(path));
 
			int index = 0, count=0, f = 0; int start = 10, stop = 12;
			int c=0;
			while ((sCurrentLine = br.readLine()) != null) 
			{
				//System.out.println("Inside while");
				if(sCurrentLine.contains(q)) 
				{
					//sCurrentLine = sCurrentLine + "\n";
					//bw.write(sCurrentLine);
					fw.append(sCurrentLine+"\n");
					bw.newLine();
					System.out.println("Line: " + c++ + ": " + sCurrentLine);
					
					
				}
				//start = start + 30; stop = stop + 30;
				 
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