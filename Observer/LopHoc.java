package Observer;

import java.util.List;

public class LopHoc implements Subject {
		List<Observer> hocsinhList;
		String name;
		String id;
		public LopHoc(List<Observer> hocsinhList, String name, String id) {
			super();
			this.hocsinhList = hocsinhList;
			this.name = name;
			this.id = id;
		}

		@Override
		public void attach(Observer observer) {
			hocsinhList.add(observer);
			// TODO Auto-generated method stub
			
		}

		@Override
		public void detach(Observer observer) {
			hocsinhList.remove(observer);
			// TODO Auto-generated method stub
			
		}

		@Override
		public void notification() {
			for(Observer observer : hocsinhList)
			{
				observer.Update();	
			}
			// TODO Auto-generated method stub
			
		}
		
}
