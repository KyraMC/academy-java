package com.bptn.course_06_oop_demo;

public class CartItem {

	private Product product;
	private int cartQuantity;

	public CartItem(Product product, int quantity) {

		if (quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insuffiecient Stock!");
		}
		this.product = product;
		this.cartQuantity = quantity;
	}

	// Getters / Accessors
	public Product getProduct() {
		return this.product;
	}

	public int getCartQuantity() {
		return this.cartQuantity;
	}

	public double getTotalPrice() {
		return product.getProductPrice() * this.cartQuantity;
	}
}
