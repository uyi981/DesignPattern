package Apdater;

public class TranslatorAdapter implements VietnameseTarget {
	 private JapanApdatee adaptee;
	 
	    public TranslatorAdapter(JapanApdatee adaptee) {
	        this.adaptee = adaptee;
	    }
	 
	    @Override
	    public void send(String words) {
	        System.out.println("Reading Words ...");
	        System.out.println(words);
	        String vietnameseWords = this.translate(words);
	        System.out.println("Sending Words ...");
	        adaptee.receive(vietnameseWords);
	    }
	 
	    private String translate(String vietnameseWords) {
	        System.out.println("Translated!");
	        return "こんにちは";
	    }
}
