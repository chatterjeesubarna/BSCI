package TestPackage;

import java.io.*;
import java.applet.*;
 
public class ReaderExample2 extends Applet{
 
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
 
			String sCurrentLine;
			String q = new String();
			q.concat("");
			int s = 0;
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
					
			int max= Integer.parseInt(args[2]), min=Integer.parseInt(args[0]);
			
			System.out.println("min: "+min + " max: " + max);
			while ((sCurrentLine = br.readLine()) != null) 
			{
				if (sCurrentLine.length() == 0) continue;
				int time = Integer.parseInt(sCurrentLine.substring(0, 2));
				
				if (time>=min && time<=max)
				{
					fw.append(sCurrentLine+"\n");
					bw.newLine();
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