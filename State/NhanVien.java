package State;

public class NhanVien {
	  private IChucVu state;
	  
	  public void setState(IChucVu state) {
	        this.state = state;
	    }
	 
	    public void applyState() {
	        this.state.Play();
	    }
}
