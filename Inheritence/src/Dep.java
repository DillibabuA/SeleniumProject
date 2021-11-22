
class DepOne{

	public void exam() {System.out.println("writing");}
}

class Student extends DepOne{
	public void write() {System.out.println("attending");}
}
class Teacher extends DepOne{
	public void correction(){System.out.println("Checking");}
}
class Dep{
	public static void main(String args[]) {
		Teacher t=new Teacher();
		t.correction();
		t.exam();
	}
}


