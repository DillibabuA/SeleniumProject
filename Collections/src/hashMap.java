import java.util.HashSet;

public class hashMap {
	public void Demo(HashSet<Integer> a) {
		for(int elements:a) {
			System.out.println(elements);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(2);
hs.add(3);
hashMap gh=new hashMap();
gh.Demo(hs);
	}

}
