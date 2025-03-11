package Observer;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		LopHoc lopHoc = new LopHoc(new ArrayList<Observer>(), "DHKTPM", "1");
		HocSinh hSinh = new HocSinh("1", "2");
		HocSinh hSinh2 = new HocSinh("2", "2");
		HocSinh hSinh3 = new HocSinh("3", "2");
		HocSinh hSinh4 = new HocSinh("4", "2");
		lopHoc.attach(hSinh);
		lopHoc.attach(hSinh2);
		lopHoc.attach(hSinh3);
		lopHoc.attach(hSinh4);	
		lopHoc.notification();
	}
}
