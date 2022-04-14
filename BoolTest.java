//Demonstrate the value
public class BoolTest {
    public static void main(String args[]){
        boolean b;

        b=false;
        System.out.println("b is " + b);
        b=true;
        System.out.println("b is " + b);

        // a boolean value can ciontrol the if statement
        if(b) System.out.println("This is executed. ");

        b=false;
        if(b) System.out.println("This is not executed. ");

        //outcome is arelational operator  is aboolean value
        System.out.println("10>9 is " + (10>9));
        
    }
    
}
