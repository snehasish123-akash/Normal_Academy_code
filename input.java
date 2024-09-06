import java.util.Scanner;

class input {
    public static void main(String args []) {
        int light_speed;
        int second=60;
        int year;
        int days;
 
 
    Scanner ak= new Scanner(System.in);
    System.out.println ("Enter your days");
    days=ak.nextInt();

    System.out.println ("Enter yout year");
    year=ak.nextInt ();

    System.out.println ("Enter yout light speed");
    light_speed = ak.nextInt();

    int akash=light_speed * days * second* year;

    System.out.print ("This is "+ akash);

    }
}