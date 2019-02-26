package com.program.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	public String name;
	public int model;
	public double price;
	public List<String> colors = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
    public String toString() {
      return "Car [name=" + name + ", model=" + model + ", price=" + price + ", colors=" + colors + "]";
    }

}
