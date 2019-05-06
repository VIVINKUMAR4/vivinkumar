package com.learning.java;

public class Dog {
	String name;
    public static void main(String[] args) {
		Dog[] d=new Dog[3];
		d[0]=new Dog();
		d[1]=new Dog();
		d[2]=new Dog();
        d[0].name="fido";
		
		d[1].name="titu";
		
		d[2].name="harrry";
		int x=0;
		while(x<d.length) {
			d[x].bark();
			x=x+1;
		}
	}
	public void bark() {
		System.out.println(name+" says ruff");
	}

}
