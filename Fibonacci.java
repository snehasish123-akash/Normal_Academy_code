public class Fibonacci {
    public static void main(String[] args)
     {
        /*int n = 10; // Change the value of n to generate Fibonacci sequence up to desired length
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }*/

        char a = 'A';
        System.out.println(a+++1);
    }

    public static int fibonacci(int n) 
    {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}