import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-negative-subarray/problem
public class Main{

    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
    int n=Integer.parseInt(in.nextLine());
   
    ArrayList<ArrayList> list= new ArrayList<>();
    for(int i=0;i<n;i++){
       ArrayList<Integer> l=new ArrayList<>();
       int arr = Integer.parseInt(in.next());
       for(int j=0;j<arr;j++){
           int el=Integer.parseInt(in.next());
           l.add(el);
       }
     list.add(l);
   // System.out.println(l);
   }
//System.out.println( list);

  int pair=Integer.parseInt(in.next());
  for(int i=0;i<pair;i++){
      int listNum=Integer.parseInt(in.next());
      int pos=Integer.parseInt(in.next());
        try{
           System.out.println( list.get(listNum-1).get(pos-1));
       
       }catch(Exception e){
     
       System.out.println("ERROR!");
      }
  }

 
 }
}