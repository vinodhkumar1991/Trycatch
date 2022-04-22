package passbyvalue;

public class pass_by_value 
{   
    int a=100;     
    void change(int a)
    {    
    a=a+100;//Changing values  It will be locally)   
    }    
    public static void main(String args[])
    {    
      pass_by_value p=new pass_by_value();  //Creating object  
      System.out.println(" Value (before change)="+p.a);    
      p.change(800);  //Passing value  
      System.out.println(" Value (after change)="+p.a);    
    }    
   }  
