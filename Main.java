import java.util.*;

public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t =sc.nextInt();

       while(t-->0){
       int n=sc.nextInt();
       String s =sc.next();
       String r="";
      for(int i=s.length()-1;i>=0;i--)r=r+s.charAt(i);
       
     if(s.compareTo(r)<=0)System.out.println(s);
     else System.out.println(r+s);
       }
       sc.close();
    }
}