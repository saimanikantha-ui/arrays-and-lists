package hello;



import java.util.*;  
public class Vector1{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("h");  
v.add("Ait");  
v.add("sh");  
v.add("Gaa");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
