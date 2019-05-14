class music{
String title;
String artist;
void play(){
System.out.print(title+"sung by"+artist);
}
}
class music1{
public static void main(String[] args){
music m1=new music();
m1.title="tum hiho";
m1.artist="chandar";
music m2=new music();
m2.title="munbe vaa";
m2.artist="rahman";
m1.play();
m2.play();
}
}


