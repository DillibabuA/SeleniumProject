
public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java programe";
		 
        //vhjgjgjbj
        int index = 1;
        char ch = 'c';
        System.out.println("before replacing the String = " + str);
 
        str = str.substring(0, index) + ch
              + str.substring(index + 1);
        System.out.println("after replace a String = " + str);

	}

}
