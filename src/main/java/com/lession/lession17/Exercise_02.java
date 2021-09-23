package com.lession.lession17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_02 {
	public static void main(String[] args) {

//		Tìm tất cả các địa chỉ email có trong chuỗi văn bản đầu vào text
//		Định nghĩa email:
//		Bắt đầu bằng chữ cái.
//		Chỉ chứa chữ cái, chữ số, dấu gạch ngang -
//		Chứa một ký tự @, sau @ là tên miền.
//		Tên miền có thể là domain.xxx.yyy hoặc domain.xxx. Trong đó xxx và yyy là các chữ cái và có độ dài từ 2 trở lên.
//		

		String text1 = "Email: vunguyen1993@gmaill.com.vn, vunguyen_1993@gmaill.com.vn, nhunguyen1996";
		Pattern pattern = Pattern.compile("[a-zA-Z]\\w+@\\w+\\.[a-zA-Z]{2,}\\.[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(text1);

		System.out.println("Email trong chuỗi text: " + text1);
		while (matcher.find()) {
			System.out.println(text1.substring(matcher.start(), matcher.end()));
		}
	}
}
