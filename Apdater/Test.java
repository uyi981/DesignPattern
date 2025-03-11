package Apdater;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  VietnameseTarget client = new TranslatorAdapter(new JapanApdatee());
	      client.send("Xin chào");
	}

}
