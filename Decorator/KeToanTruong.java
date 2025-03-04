package Decorator;

import State.IChucVu;

public class KeToanTruong extends ChucVuDecorator {
	public void Play()
	{
		chucVu.Play();
		System.out.print("KeToanTruong");
	}

	public KeToanTruong(Decorator.IChucVu chucVu) {
		super(chucVu);
		// TODO Auto-generated constructor stub
	}

	
}
