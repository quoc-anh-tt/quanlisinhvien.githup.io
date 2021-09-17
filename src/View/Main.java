package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controler.FileIO;
import Controler.StudentManager;
import Model.SinhVien;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("1. Thêm ");
		System.out.println("2. Xuất");
		System.out.println("3. Tìm kiếm theo ID");
		System.out.println("4. Xóa theo theo ID ");
		System.out.println("5. Sửa theo ID ");
		System.out.println("6. Lưu File");
		System.out.println("7. Thoát");
		System.out.println("Nhập lựa chọn: ");
	}

	public static void main(String[] args) {
		int choose = 0;
		
		StudentManager.ListSinhVien = FileIO.readfile("sinhvien.txt"); 
		
		while (true) {
			menu();
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				System.out.println("Nhập thông tin SV...");
				SinhVien a = new SinhVien();

				System.out.print("Nhap MSSV: ");
				a.setMssv(Integer.parseInt(sc.nextLine()));
				System.out.print("Nhap ten: ");
				a.setHoten(sc.nextLine());
				System.out.print("Nhap dia chi: ");
				a.setDiachi(sc.nextLine());
				System.out.print("Nhap diem: ");
				a.setDiem(Float.parseFloat(sc.nextLine()));

				StudentManager.them(a);

				break;
			case 2:
				// xuat
				System.out.println("List: ");
				StudentManager.xuat();
				break;

			case 3:
				// tim kiem theo id
				System.out.println("Nhap id can tim..");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("Thong tin sinh vien can tim:");
				StudentManager.timkiem(b);
				break;
			case 4:
				// xoa theo id
				System.out.println("Nhap ID sinh vien can xoa");
				int c = Integer.parseInt(sc.nextLine());
				StudentManager.xoa(c);

				break;
			case 5:
				// sửa
				System.out.println("Nhap ten can sua: ");
				String ten = sc.nextLine();
				StudentManager.sua(ten);

				break;
			case 6 :
				if (FileIO.savefile(StudentManager.ListSinhVien, "sinhvien.txt")) {
					System.out.println("lưu thành công");
				} 
				else {
					System.out.println("Lưu thất bại");
				}
				break;
			
			case 7:
				System.exit(0);
				break;
			case 8 :
				FileIO.readfile("sinhvien.txt"); 
				break; 
			default:
				System.out.println("The end !!");
				break;
			}
		}

	}

}
