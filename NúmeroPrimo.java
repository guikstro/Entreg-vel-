public class isPrime {
  
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
  
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
  
    public static void main(String args[])
    {
        if (isPrime(5))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(3))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
