
public class CandidateOv {
	 int id;  
	    String name;  
	    int age;    
	     CandidateOv (int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	     CandidateOv (int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CandidateOv s = new CandidateOv(1001,"Kishore",12);  
		 CandidateOv m = new CandidateOv(2002,"Anil",25);  
	    s.display();  
	    m
	    .display();  
	
	}
}
