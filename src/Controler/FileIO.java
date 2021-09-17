package Controler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

import Model.SinhVien;

public class FileIO {
	// single tone
	public static FileIO gI = null;

	public static FileIO gI() {
		if (gI == null) {
			gI = new FileIO();
		}
		return gI();
	}

	// save file
	// lưu từ arraylist xuống file
	//
	public static boolean savefile(ArrayList<SinhVien> sv, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			for (SinhVien sv1 : sv) {
				String line = sv1.getMssv() + ";" + sv1.getHoten() + ";" + sv1.getDiachi() + ";" + sv1.getDiem() + ";";
				bw.write(line);
				bw.newLine();
			}

			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	// đọc từ file lên arraylist

	public static ArrayList<SinhVien> readfile(String path) {

		try {
			ArrayList<SinhVien> sv = new ArrayList<>();
			
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String abc = br.readLine();
			// đọc dòng đầu tiên;
			while (abc != null) {
				// 1|1|1|1.0|
				String[] arr = abc.split(";");
				if (arr.length == 4) {
					SinhVien b = new SinhVien();
					b.setMssv(Integer.parseInt(arr[0]));
					b.setHoten(arr[1]);
					b.setDiachi(arr[2]);
					b.setDiem(Float.parseFloat(arr[3]));
					sv.add(b);
				}
				abc = br.readLine();
			}
			
			br.close();
			isr.close();
			fis.close();
			return sv;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
