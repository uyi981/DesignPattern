package Decorator;

public class DoiTruong extends ChucVuDecorator {
	public void Play()
	{
		chucVu.Play();
		System.out.print("Doi Truong");
	}

	public DoiTruong(IChucVu chucVu) {
		super(chucVu);
		// TODO Auto-generated constructor stub
	}
	
}
