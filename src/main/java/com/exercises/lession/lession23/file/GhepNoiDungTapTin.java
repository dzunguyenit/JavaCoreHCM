package com.exercises.lession.lession23.file;

import java.io.*;

public class GhepNoiDungTapTin {

	// Viết chương trình Java ghép nội dung 2 tập tin text sang tập tin khác
	// Thông tin của 3 tập tin sẽ được cung cấp bởi user

	public static void main(String[] args) throws IOException {

		try {
			File file01 = new File("file01.txt");
			// if file01.txt is exists -> clear content
			if (file01.exists()) {
				clearContentFile("file01.txt");
			}

			FileOutputStream outputFile01 = new FileOutputStream("file01.txt", true);
			OutputStreamWriter outputStreamFile01 = new OutputStreamWriter(outputFile01);
			BufferedWriter writerFile01 = new BufferedWriter(outputStreamFile01);

			writerFile01.write("Content File 1 + ");
			writerFile01.flush();
			writerFile01.close();

			File file02 = new File("file02.txt");
			// if file02.txt is exists -> clear content
			if (file02.exists()) {
				clearContentFile("file02.txt");
			}

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
			File file01_file02 = new File("file01_file02.txt");
			// if file01_file02.txt is exists -> clear content
			if (file01_file02.exists()) {
				clearContentFile("file01_file02.txt");
			}

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
			InputStreamReader streamReaderFile02 = new InputStreamReader(fileInputStreamFile02);
			BufferedReader readerFile02 = new BufferedReader(streamReaderFile02);

			String contentFile02 = readerFile02.readLine();
			while (contentFile02 != null) {
				writerTotalFile.write(contentFile02);
				contentFile02 = readerFile02.readLine();
			}

			readerFile02.close();
			writerTotalFile.flush();
			writerTotalFile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void clearContentFile(String fileName) {
		File file = new File(System.getProperty("user.dir") + "/" + fileName);
		try {
			PrintWriter writer;
			writer = new PrintWriter(file);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " not found" + e);
		}

	}
}