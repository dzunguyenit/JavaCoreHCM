package com.lession.lession23.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocGhiFile {
	public static void main(String[] args) {
//		 try {
//		 FileOutputStream fos = new FileOutputStream("data.txt", true);
//		 PrintWriter writer = new PrintWriter(fos);
//		 writer.println("1/6");
//		
//		 // OutputStreamWriter osw = new OutputStreamWriter(fos);
//		 // BufferedWriter writer = new BufferedWriter(osw);
//		
//		 writer.flush();
//		 writer.close();
//		 } catch (FileNotFoundException e) {
//		 e.printStackTrace();
//		 }

		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(isr);

			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		try {
//			FileInputStream fis = new FileInputStream("data.txt");
//			Scanner scanner = new Scanner(fis);
//			while (scanner.hasNextLine()) {
//				String line = scanner.nextLine();
//				System.out.println(line);
//			}
//			scanner.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

		// Viết chương trình Java ghép nội dung 2 tập tin text sang tập tin khác
		// Thông tin của 3 tập tin sẽ được cung cấp bởi user

	}
}
