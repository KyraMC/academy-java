package com.bptn.course._13_abstract_classes;

//public by default
public abstract class Animal { //Abstract class - cannot create objects of this class, used for other classes to extend

	//Abstract Method - method with no body, used for child classes
	// We know animals have a sound, but it's different for every animal, so the subclass will define it
	// subclass MUST override it
	public abstract void sound();
	
	//Concrete Method - has a body
	// All animals sleep the same way
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}

class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Dog barks");	 
	}
}
