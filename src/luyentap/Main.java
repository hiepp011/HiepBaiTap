package luyentap;

import luyentap.model.BinhDoan;
import luyentap.model.DoiQuan;
import luyentap.model.KyBinh;
import luyentap.model.PhuThuy;
import luyentap.model.VuKhi;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		PhuThuy pt = new PhuThuy("Phù thủy A", "PT123", (byte)0, 21.2, false, true);
		KyBinh kb = new KyBinh("Kỵ binh B", "KB321", (byte)1, 25.3, true, false, true);
		kb.addBinhDoan(new BinhDoan("Binh đoàn A", 10000, new DoiQuan("Đội quân số 1")));
		kb.addBinhDoan(new BinhDoan("Binh đoàn B", 15000, new DoiQuan("Đội quân số 2")));
		
		System.out.println("Nhân vật phù thủy: " + pt);
		pt.nhanVatdiChuyen();
		pt.hanhDongVuKhi();
		pt.sucManhVuKhi();
		System.out.println("---------------------------");
		System.out.println("Nhân vật kỵ binh: " + kb);
		kb.nhanVatdiChuyen();
		kb.hanhDongVuKhi();
		kb.sucManhVuKhi();
	}
}
