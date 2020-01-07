package hello;

import java.util.*;  
public class Stack1{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Ash");  
stack.push("rvit");  
stack.push("Ait");  
stack.push("Aish");  
stack.push("a");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  