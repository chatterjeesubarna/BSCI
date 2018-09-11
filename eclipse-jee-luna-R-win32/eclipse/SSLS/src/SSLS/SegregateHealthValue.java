package SSLS;

import java.io.*;

public class SegregateHealthValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		/* 
		try {
 
			String sCurrentLine; 
			String path = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "Set_1.0" + ".docx";
			File file = new File(path);
			br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}*/
		
		try {
			 
			String sCurrentLine; 
			String path1 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "Set_1.0" + ".txt";
			File file1 = new File(path1);
			br = new BufferedReader(new FileReader(file1.getAbsoluteFile()));
			int count=-1;
			/*String path20 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "0" + ".txt";
			File file20 = new File(path20);
			String path21 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "1" + ".txt";
			File file21 = new File(path21);
			String path22 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "2" + ".txt";
			File file22 = new File(path22);
			String path23 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "3" + ".txt";
			File file23 = new File(path23);
			String path24 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "4" + ".txt";
			File file24 = new File(path24);*/
 
			while ((sCurrentLine = br.readLine()) != null) {
				
				//System.out.println(sCurrentLine);
				//System.in.read();
				
				int i; int len = sCurrentLine.length(); int val; char ch;
				for (i=0;i<len;i++)
				{
					count = (count + 1)%5;
					ch = sCurrentLine.charAt(i);
					val = (int)ch;
					//System.out.print(ch + "-> " + val + " ->" + count + " ");
					System.out.print(ch + "-> " + val + " (" + count + ") ");
					String content =  " " + val;
					
					String patht = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + count + ".txt";
					File filet = new File(patht);;
					FileWriter fw = new FileWriter(filet.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);
					fw.append(content+"\n");
					//bw.newLine();
					bw.close();
					fw.close();
					
				}
				System.out.println();
			}
 
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
