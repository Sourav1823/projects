//demonstrate block scope
public class scope {
    public static void main(String args[]){
        int x; //known to all code within main

        x=10;
        if(x==10) { //start new scope
            int Y=20; // known only to this block

            //x and Y both are known here.
            System.out.println("x and Y: " + x + " " + Y);
            x=Y * 2;
            
        }
        // Y = 100; //Error! Y is not known here

        // x is still known here.
        System.out.println("x is " + x);
    }
    
}
