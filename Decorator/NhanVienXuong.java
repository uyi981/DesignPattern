package Decorator;

public class NhanVienXuong extends ChucVuDecorator{
	public void Play()
	{
		chucVu.Play();
		System.out.print("NhanVienXuong");
	}

	public NhanVienXuong(IChucVu chucVu) {
		super(chucVu);
		// TODO Auto-generated constructor stub
	}
	
}
