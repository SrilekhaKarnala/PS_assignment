import java.util.*;
public class Game {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int codd=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            codd++;
        }
        if(codd==0 || codd%2!=0)
        System.out.println("ALICE");
        else
        System.out.println("BOB");
    

    }
}

}

// Algorithm
/*
count no. of odd numbers 
if oddcount==0 or odd 
alice wins 
else
bob wins 
*/
