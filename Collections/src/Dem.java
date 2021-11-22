import java.util.ArrayList;

public class Dem {
		public void Acc(ArrayList<Integer> a) {
			int sum=0;
			for(int i=0;i<a.size();i++) {
				sum=sum+a.get(i);
			}
		System.out.println(sum);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem a=new Dem();
		ArrayList<Integer> gs=new ArrayList<Integer>();
		gs.add(2);
		gs.add(4);
a.Acc(gs);
	}
	
}

