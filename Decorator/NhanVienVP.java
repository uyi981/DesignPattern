package Decorator;

public class NhanVienVP extends ChucVuDecorator  {
	public void Play()
	{
		chucVu.Play();
		System.out.print("NhanVienVP");
	}

	public NhanVienVP(IChucVu chucVu) {
		super(chucVu);
		// TODO Auto-generated constructor stub
	}
	
}
