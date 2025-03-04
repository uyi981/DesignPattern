package DontUseDP;

public class NhanVien {
	String id;
	TypeOfChucVu chucVu;
	public void Play()
	{
		switch(chucVu)
		{
			case Doi_Truong:
			{
				System.out.print("Doi Truong");
			}
			break;
			case Nhan_Vien_VP:
			{
				System.out.print("Doi Truong");
			}
			break;
			case Nhan_Vien_Xuong:
			{
				System.out.print("Doi Truong");
			}
			break;
			case Giam_doc:
			{
				System.out.print("Doi Truong");
			}
			break;
			case Ke_Toan_Truong:
			{
				System.out.print("Doi Truong");
			}
			break;
		}
	}
	public NhanVien(String id, TypeOfChucVu chucVu) {
		super();
		this.id = id;
		this.chucVu = chucVu;
	}
	
}
