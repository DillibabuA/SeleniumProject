
    abstract class AbBike{  
        AbBike(){System.out.println("bike is created");}  
        abstract void run();  
        void changeGear(){System.out.println("gear changed");}  
      }  
     
      class Honda extends AbBike{  
      void run(){System.out.println("running safely..");}  
      }  
     
      class TestAbstraction{  
      public static void main(String args[]){  
       AbBike obj = new Honda();  
       obj.run();  
       obj.changeGear(); 
      }  
     }  



