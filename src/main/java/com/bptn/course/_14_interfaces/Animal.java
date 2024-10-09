package com.bptn.course._14_interfaces;

//public by default
// Interfaces can only have abstract methods and constants
interface Animal {
	void sound();
}

interface Pet {
	void play();
}

// Can do multiple inheritance of interfaces with keyword implements
class Dog implements Animal, Pet {
	// Need to override all abstract methods

	@Override
	public void play() {
		System.out.println("Woof Woof");
	}

	@Override
	public void sound() {
		System.out.println("Dog is barking");
	}

}