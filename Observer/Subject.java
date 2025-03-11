package Observer;

import java.util.List;

public interface Subject {
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void notification();
}
