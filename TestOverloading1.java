//method overloading example
class Adder{  
 static int add(int a,float b){
return a+b;
}  
 static int add(float a,int b){
return a+b;
}  
}
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,12));  
System.out.println(Adder.add(11,12));  
}
} 

 