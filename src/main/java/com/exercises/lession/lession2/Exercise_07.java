package com.exercises.lession.lession2;

public class Exercise_07 {

	public static void main(String[] args) {

//		Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa
//		của một học sinh. Tính điểm trung bình của
//		học sinh đó.

//		intatn = 15;
//		int price = 200000;

		float math = 7.5f;
		float physic = 7f;
		float chemistry = 9f;

		float literature = 5f;
		float history = 6.5f;
		float geography = 10f;

		float average = (math * 3 + physic * 3 + chemistry * 3 + literature + history + geography) / 12;

		System.out.println("Average = " + average);

	}

}
