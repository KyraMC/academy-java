package com.bptn.course_06_oop_demo;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}
	
	// addProductToCart
	public void addProductToCart (Product product, int quantity) {
		if (itemCount <= 4) {
			CartItem newItem = new CartItem(product, quantity); // Make the product a cart item
			items[itemCount] = newItem; // add item to cart at index itemCount
			itemCount++; // add 1 to item counter to move to next index
			product.reduceStock(quantity); // reduce the quantity of the product because it is now in cart
		} else {
			throw new IllegalArgumentException("Cart full!");
		}
	}
	
	public CartItem[] getItems() {
		CartItem[] currentItems = new CartItem[itemCount];
		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;
	}
	
	public double getTotalPrice() {
		double price = 0;
		
		for(CartItem item: items) {
			price += item.getTotalPrice();
		}
		
		return price;
	}
	
	
}
