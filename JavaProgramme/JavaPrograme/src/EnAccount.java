
public class EnAccount {
    
    
    private long acc_no;  
    private String name,email;  
    private float amount;  
    public long getAcc_no() {  
        return acc_no;  
    }  
    public void setAcc_no(long acc_no) {  
        this.acc_no = acc_no;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public float getAmount() {  
        return amount;  
    }  
    public void setAmount(float amount) {  
        this.amount = amount;  
    }  
      
    

   
    public class TestEncapsulation {  
    public  void main(String[] args) {  
        EnAccount acc=new EnAccount();  
        acc.setAcc_no(14006767l);  
        acc.setName("raju");  
        acc.setEmail("raju@gmail.com");  
        acc.setAmount(500000f);  
        
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
    }  
    }  


}
