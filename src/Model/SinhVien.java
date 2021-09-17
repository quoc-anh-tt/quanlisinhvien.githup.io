package Model;

import java.util.Scanner;

public class SinhVien {
	public static Scanner sc = new Scanner(System.in);

	private int mssv;
	private String hoten;
	private String diachi;
	private float diem;

	public SinhVien(int mssv, String hoten, String diachi, float diem) {
		super();
		this.mssv = mssv;
		this.hoten = hoten;
		this.diachi = diachi;
		this.diem = diem;
	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void xuat( ) {
		System.out.println(toString());			
	}

	@Override
	public String toString() {
		return "SinhVien mssv=" + mssv + " hoten=" + hoten + " diachi=" + diachi + " diem=" + diem + "\n";
	}
}
