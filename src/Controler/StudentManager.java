package Controler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Model.SinhVien;

public class StudentManager {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<SinhVien> ListSinhVien = new ArrayList<SinhVien>();

	public static void them(SinhVien a) {
		ListSinhVien.add(a);
	}

	public static void xuat() {
		for (SinhVien sinhVien : ListSinhVien) {
			sinhVien.xuat();
		}
	}

	public static void timkiem(int b) {

		for (SinhVien sinhVien : ListSinhVien) {
			if (b == sinhVien.getMssv()) {
				sinhVien.xuat();
			}
		}
	}

	public static void xoa(int c) {
		for (int i = 0; i < ListSinhVien.size(); i++) {
			if (ListSinhVien.get(i).getMssv() == c) {
				ListSinhVien.remove(i);
			}
		}
		xuat();
	}

	public static void sua(String ten) {
		for (SinhVien sinhVien : ListSinhVien) {
			if (sinhVien.getHoten().equals(ten)) {
				System.out.println("Nhap lai thong tin sv...");
				System.out.print("Nhap MSSV: ");
				sinhVien.setMssv(Integer.parseInt(sc.nextLine()));
				System.out.print("Nhap ten: ");
				sinhVien.setHoten(sc.nextLine());
				System.out.print("Nhap dia chi: ");
				sinhVien.setDiachi(sc.nextLine());
				System.out.print("Nhap diem: ");
				sinhVien.setDiem(Float.parseFloat(sc.nextLine()));

			}
		}
	}

}