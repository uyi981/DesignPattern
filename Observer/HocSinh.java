package Observer;

public class HocSinh implements Observer {
	String mssv;
	String name;

	public HocSinh(String mssv, String id) {
		super();
		this.mssv = mssv;
		this.name = id;
	}

	@Override
	public void Update() {
		System.out.println("MSSV: "+mssv+"| da nhan thong bao!");
		// TODO Auto-generated method stub		
	}

}
