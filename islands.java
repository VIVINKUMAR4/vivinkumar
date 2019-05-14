package com.learning.java;

class island {
	 String name;
}
	public class islands{
	public static void main(String[] args) {
		island[] i=new island[4];
		i[0].name="fiji";
		i[1].name="cozumel";
		i[2].name="bermuda";
		i[3].name="arores";
		int x=0;
		while(x<4) {
			System.out.println("green=" +i[x].name);
			x++;
			
		}
		
		
		

	}
	

}
