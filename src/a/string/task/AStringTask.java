
package a.string.task;

import java.util.Scanner;


public class AStringTask {

   
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          String s=scan.next();
          s=s.replaceAll("[aeiouyAEIOUY]","");
          s=s.toLowerCase();
          String[] c=s.split("");
          s="";
          for(int i=0;i<c.length;i++){
              
          s+="."+c[i];
          }
       
        System.out.println(s);
        
    }
    
}
