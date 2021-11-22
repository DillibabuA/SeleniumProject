class Language {
  public void displayInfo() {
    System.out.println("Common English Language");
  }
}

class Java extends Language {
  @Override
  public void displayInfo() {
    System.out.println("Java Programming Language");
  }
}
public class PolyOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java j = new Java();
	    j.displayInfo();

	    // create an object of Language class
	    Language l = new Language();
	    l.displayInfo();
	}

}
