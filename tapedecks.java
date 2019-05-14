class tapedeck{
boolean canrecord;
void playtape(){
System.out.println("playing the tape");
}
void recordtape(){
System.out.println("recording the tape");
}
}
public class tapedecks{
public static void main(String[] args){
tapedeck t=new tapedeck();
t.canrecord=true;
t.recordtape();
}
}
 