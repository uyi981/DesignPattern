package State;

public class Test {

	public static void main(String[] args) {
			NhanVien context = new NhanVien();
	     
	        context.setState(new DoiTruong());
	        context.applyState();
	        
	        context.setState(new NhanVienVP());
	        context.applyState();
	 
	        context.setState(new GiamDoc());
	        context.applyState();
			}
}
