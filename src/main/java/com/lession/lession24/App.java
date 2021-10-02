package com.lession.lession24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("person.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println(p);
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		Person p = new Person("Ryu", 30);
		try {
			FileOutputStream fos = new FileOutputStream("person.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// FileInputStream fis = new FileInputStream("orders.bin");
		// DataInputStream dis = new DataInputStream(fis);
		// while (dis.available() > 0) {
		// String name = dis.readUTF();
		// String date = dis.readUTF();
		// double total = dis.readDouble();
		//
		// LocalDate ld = LocalDate.parse(date);
		// Order ord = new Order(ld, name, total);
		// System.out.println(ord);
		// }
		// dis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// Order[] orders = new Order[] {
		// new Order(LocalDate.now(), "Ken", 500f),
		// new Order(LocalDate.now(), "Ryu", 450f),
		// new Order(LocalDate.now(), "Zen", 300f),
		// new Order(LocalDate.now(), "Akuma", 280f),
		// new Order(LocalDate.now(), "Guile", 120f),
		// new Order(LocalDate.now(), "Ryan", 870f),
		// };
		// try {
		// FileOutputStream fos = new FileOutputStream("orders.bin");
		// DataOutputStream dos = new DataOutputStream(fos);
		// for (Order ord : orders) {
		// dos.writeUTF(ord.getCustomer());
		// dos.writeUTF(ord.getDate().toString());
		// dos.writeDouble(ord.getTotal());
		// }
		// dos.flush();
		// dos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// try {
		// FileInputStream fis = new FileInputStream("order.bin");
		// DataInputStream dis = new DataInputStream(fis);
		// String name = dis.readUTF();
		// String date = dis.readUTF();
		// double total = dis.readDouble();
		//
		// LocalDate ld = LocalDate.parse(date);
		// Order ord = new Order(ld, name, total);
		// System.out.println(ord);
		// dis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// Order ord = new Order(LocalDate.now(), "Ken", 500f);
		// try {
		// FileOutputStream fos = new FileOutputStream("order.bin");
		// DataOutputStream dos = new DataOutputStream(fos);
		// dos.writeUTF(ord.getCustomer());
		// dos.writeUTF(ord.getDate().toString());
		// dos.writeDouble(ord.getTotal());
		// dos.flush();
		// dos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// try {
		// FileOutputStream fos = new FileOutputStream("data.bin");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		//
		// bos.write("Hello!".getBytes());
		// bos.write("\n".getBytes());
		// bos.write("How are you today?".getBytes());
		// bos.write("\n".getBytes());
		// bos.write(4);
		//
		// bos.flush();
		// bos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// try {
		// FileInputStream fis = new FileInputStream("data.bin");
		// BufferedInputStream bis = new BufferedInputStream(fis);
		//
		// // read 1 byte
		// int ch;
		// ch = bis.read();
		// while (ch != -1) {
		// System.out.print((char) ch);
		// ch = bis.read();
		// }
		// bis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}
}
