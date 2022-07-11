package projectGoodies;

import java.util.Arrays;
import java.util.Scanner;

public class Goodies {

    static int minDiff(int array[], int a, int b)
    {
        int result = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i=0; i<= a-b;i++)
            result = Math.min(result, array[i + b - 1] - array[i]);
        return result;
    }

    static int findelements(int res,int array[], int a, int b)
    {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=a; i++)
        {
            result = Math.min(result, array[i + b - 1] - array[i]);
            if (res==result)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        int array[]={999,2195,2799,4999,7980,9800,9999,11101,22349,229900};
        String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
        int a = array.length;
        System.out.println("Enter the number of employees");
        Scanner s = new Scanner(System.in);
        int b=s.nextInt();
        int result=minDiff(array, a, b);
        System.out.println("Number of the employees:"+b);
        int startindex=findelements(result,array,a,b);
        System.out.println("selected goodies:");
        for(int i=startindex;i<startindex+b;i++)
            System.out.println(items[i]);
        System.out.println("\n");
        System.out.println("difference b/w highest price and the lowest price of selected goodies:"+result);
    }
}
