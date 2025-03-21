package encapsulation;

public class TaiKhoan {
	private double soDu;
	
	public void napTien(double soTien) {
		if(soTien <= 0) {
			throw new IllegalArgumentException("So tien khong hop le");
		}else {
			soDu = soDu + soTien;
		}
		
	}
	
	public void rutTien(double soTien) {
		if(soDu < soTien || soTien <= 0) {
			throw new IllegalArgumentException("So tien khong hop le");
		}else {
			soDu = soDu - soTien;
		}
		
	}
	
	public double getSoDu() {
		return soDu;
	}
	
}
