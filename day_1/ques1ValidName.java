import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;
    //System.out.println(s);
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a name: ");
     String name = in.nextLine();
     int l = name.length();
     //System.out.println(l);
     
     int s = CheckSandT(name, l);
     //System.out.println("Return value:" +s);
     
     for(int j = 0; j < l; j++)
     {
         if(name.charAt(j) == 'a')
            a++;
         else if(name.charAt(j) == 'e')
            e++;
         else if(name.charAt(j) == 'i')
            i++;
         else if(name.charAt(j) == 'o')
            o++;
         else if(name.charAt(j) == 'u')
            u++;
     }
     if(a > 1 || e > 1 || i > 1 || o > 1 || u > 1 || s == 1)
     {
         System.out.println("NAME IS NOT VALID!!!!!");
     }
     else 
     {
         System.out.println("NAME IS VALID");
     }
    //  System.out.println(a);
    //  System.out.println(e);
    //  System.out.println(i);
    //  System.out.println(o);
    //  System.out.println(u);
    }
    public static int CheckSandT(String name, int l){
        int flag =0;
        int r = 0;
        while(r < l)
        {
            int firstS = name.indexOf("S", r);
            int secS = name.indexOf("S", firstS+1);
            int T = name.indexOf("T", 0);
            //System.out.println(" First S: " + firstS +" 2nd S: " + secS);
            if(firstS < T && T < secS )
                flag = 1;
                r = secS;
                break;
        }
        if(flag == 1)
         return 1;
        else
         return 0;
    }
}