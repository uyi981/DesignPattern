package Decorator;

public class GiamDoc extends ChucVuDecorator {
	public void Play()
	{
		chucVu.Play();
		System.out.print("GiamDoc");
	}

	public GiamDoc(IChucVu chucVu) {
		super(chucVu);
		// TODO Auto-generated constructor stub
	}
	
}
