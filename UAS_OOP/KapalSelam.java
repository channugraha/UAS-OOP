public class KapalSelam extends Kendaraan{
	
	public KapalSelam(String merk, String warna, int topSpeed){
	super(merk, warna, topSpeed);
	}
	
	public void jalan(){
		System.out.println("Kapal Selam Berjalan");
	}
	
	public void berhenti(){
		System.out.println("Kapal Selam Berhenti");
	}
	
	public void dive(){
		System.out.println("Kapal Selam Menyelam Kedalaman 500ft");
	}
}