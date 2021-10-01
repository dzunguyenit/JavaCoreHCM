package com.exercises.lession.lession23;

import java.io.*;

public class App {

	// Viết chương trình Java ghép nội dung 2 tập tin text sang tập tin khác
	// Thông tin của 3 tập tin sẽ được cung cấp bởi user

	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream outputFile01 = new FileOutputStream("file01.txt", true);
			OutputStreamWriter outputStreamFile01 = new OutputStreamWriter(outputFile01);
			BufferedWriter writerFile01 = new BufferedWriter(outputStreamFile01);

			writerFile01.write("Content File 1 + ");
			writerFile01.flush();
			writerFile01.close();

			FileOutputStream outputFile02 = new FileOutputStream("file02.txt", true);
			OutputStreamWriter outputStreamFile02 = new OutputStreamWriter(outputFile02);
			BufferedWriter writerFile02 = new BufferedWriter(outputStreamFile02);
			writerFile02.write("Content File 2");
			writerFile02.flush();
			writerFile02.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Concat content file 1 + file 2

		try {
			FileOutputStream outputTotalFile = new FileOutputStream("file01_file02.txt", true);
			OutputStreamWriter outputStreamTotalFile = new OutputStreamWriter(outputTotalFile);
			BufferedWriter writerTotalFile = new BufferedWriter(outputStreamTotalFile);

			FileInputStream fileInputStreamFile01 = new FileInputStream("file01.txt");
			InputStreamReader streamReaderFile01 = new InputStreamReader(fileInputStreamFile01);
			BufferedReader readerFile01 = new BufferedReader(streamReaderFile01);
			
			String contentFile01 = readerFile01.readLine();
			while (contentFile01 != null) {
				writerTotalFile.write(contentFile01);
				contentFile01 = readerFile01.readLine();
			}
			readerFile01.close();

			FileInputStream fileInputStreamFile02 = new FileInputStream("file02.txt");
			InputStreamReader readerFile02 = new InputStreamReader(fileInputStreamFile02);
			BufferedReader reader2 = new BufferedReader(readerFile02);
			
			String contentFile02 = reader2.readLine();
			while (contentFile02 != null) {
				writerTotalFile.write(contentFile02);
				contentFile02 = reader2.readLine();
			}

			readerFile02.close();
			writerTotalFile.flush();
			writerTotalFile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}