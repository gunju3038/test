package com.ezen.geonju0;

public class Two {
	int a,b;
	Twoout tout;
	
	public Twoout getTout() {
		return tout;
	}

	public void setTout(Twoout tout) {
		this.tout = tout;
	}

	public Two() {
	}

	public Two(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public void call() {
		tout.out(a, b);
	}
	@Override
	public String toString() {
		return a +"+"+ b +"="+(a+b);
	}
	
}
