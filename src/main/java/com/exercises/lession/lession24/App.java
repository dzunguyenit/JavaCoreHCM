package com.exercises.lession.lession24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {

//	Bài tập: viết chương trình Java cho phép copy tập tin bất kỳ trong máy tính,
//	sử dụng phương pháp `đọc file nguồn => ghi file đích`

	public static void main(String[] args) {
		String pathFileOriginal = System.getProperty("user.dir") + "/person.bin";
		String pathFileCopy = System.getProperty("user.dir") + "/DataCopy/personCopy.bin";

		File originalFile = new File(pathFileOriginal);
		File copyFile = new File(pathFileCopy);

		try {
			copyFile(originalFile, copyFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyFile(File fileOriginal, File fileCopy) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(fileOriginal);
			os = new FileOutputStream(fileCopy);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			is.close();
			os.close();
		}
	}

}