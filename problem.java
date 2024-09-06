import java.util.Scanner;

class operation {
    int ans,resadd;

    int retaddition (int x,int y){
        resadd=x+y;
        return resadd ;
    }

    int retmultiplication (int var1)
    {
        ans=var1*(resadd+resadd);
        return ans;
    }

    void onlyprint ()
    {
        System.out.println(resadd);
        System.out.println(ans);
        
    }
}

class problem {
    public static void main (String argss[])
    {
        operation ob=new operation();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number X");
        int X = sc.nextInt();

        System.out.println("Enter your number Y");
        int Y = sc.nextInt();

        System.out.println("Enter your number Z");
        int Z = sc.nextInt();

        int ak=ob.retaddition(X, Y);
        int saha=ob.retmultiplication(Z);
        ob.onlyprint();
    }
    
}
