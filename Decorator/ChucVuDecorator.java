package Decorator;

public class ChucVuDecorator implements IChucVu{

	IChucVu chucVu;
	@Override
	public void Play() {
		// TODO Auto-generated method stub		
	}
	public ChucVuDecorator(IChucVu chucVu) {
		this.chucVu = chucVu;
		// TODO Auto-generated constructor stub
	}

}
