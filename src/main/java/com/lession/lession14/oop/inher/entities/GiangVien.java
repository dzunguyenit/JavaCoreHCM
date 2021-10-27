package com.lession.lession14.oop.inher.entities;

import java.util.Scanner;

public class GiangVien {

  protected String ten, email, diaChi, dienThoai;
  protected int soGioDay;

  public GiangVien() {
  }

  public GiangVien(String ten, String email, String diaChi, String dienThoai, int soGioDay) {
    this.ten = ten;
    this.email = email;
    this.diaChi = diaChi;
    this.dienThoai = dienThoai;
    this.soGioDay = soGioDay;
  }

  public void fromConsole(Scanner sc) {
    System.out.print("- Tên: ");
    this.ten = sc.nextLine();

    System.out.print("- Email: ");
    this.email = sc.nextLine();

    System.out.print("- Điện thoại: ");
    this.dienThoai = sc.nextLine();

    System.out.print("- Địa chỉ: ");
    this.diaChi = sc.nextLine();

    System.out.print("- Số giờ dạy trong tháng: ");
    this.soGioDay = Integer.parseInt(sc.nextLine());
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("GiangVien {");
    this.getGVString(sb);
    sb.append('}');
    return sb.toString();
  }

  protected void getGVString(StringBuffer sb) {
    sb.append("ten='").append(ten).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", diaChi='").append(diaChi).append('\'');
    sb.append(", dienThoai='").append(dienThoai).append('\'');
    sb.append(", soGioDay=").append(soGioDay);
  }

  public int tinhLuong() {
    return 0;
  }
}