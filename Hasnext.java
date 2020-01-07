package hello;


import java.util.*;  
class Hasnext{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
list.add("fdg"); 
list.add("fhn");  
list.add("dghbh");  
list.add("dzfvc");  

Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  