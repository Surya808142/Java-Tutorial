package Code;

// getbit, setbit, clearbit, updatebit
public class bitmaniputaion {
    public static void main(String args[]){
        int  n=5;
        int pos=2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        // GetBit
        // if((bitmask & n) == 0){
        //     System.out.print("Bit was zero");
        // }
        // else{
        //     System.out.print("Bit was one");
        // }


        // SetBit
        // int newNumber = bitmask | n;
        // System.out.print(newNumber);


        // ClearBit
        int newNumber = notbitmask & n;
        System.out.print(newNumber);

        // UpdateBit

    }
}
