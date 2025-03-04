package Strategy;

public class NhanVien {
	String id;
	IChucVu chucVu;
	public void Play()
	{
		if(chucVu!=null)
			chucVu.Play();
	}
	public NhanVien(String id, IChucVu chucVu) {
		super();
		this.id = id;
		this.chucVu = chucVu;
	}
}
