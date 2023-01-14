public class Pesawat extends Kendaraan{
	
	public Pesawat(String merk, String warna, int topSpeed){
	super(merk, warna, topSpeed);
	}
	public void jalan(){
		System.out.println("Pesawat Berjalan");
	}
	
	public void berhenti(){
		System.out.println("Pesawat Berhenti");
	}
	
	public void fly(){
		System.out.println("Pesawat Terbang Ketinggian 9000ft");
	}
}