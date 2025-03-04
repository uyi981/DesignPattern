package Decorator;

public class Test {

	public static void main(String[] args) {
				ChucVuDecorator chucVuDecorator = new DoiTruong(new DefaultChucVu());
				chucVuDecorator.Play();
				ChucVuDecorator chucVu1 = new KeToanTruong(chucVuDecorator);
				chucVu1.Play();
				ChucVuDecorator chucVu2 = new GiamDoc(chucVu1);
				chucVu2.Play();
			}
}
