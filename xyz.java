import java.util.Scanner;

class xyz
 {
    public static void main(String[] args) 
    {
        Scanner ak =new Scanner(System.in );
        int N;
        
        System.out.print ("  how many index you want to count");
        N=ak.nextInt();
        int arr[]=new int [N+1];

        for (int i=0; i<N; i++)
        {
            System.out.print ("  enter your index num of "+ i);
            int ss=ak.nextInt();
            arr[i]=ss;
        }

        System.out.println ("  the array is ");
        for (int j=0; j<N;j++)
        {
            System.out.print ( "   " + arr[j]);
        }
        

    }
}