package com.prototype3.helper;

public class Rect {
	public int x;
	public int y;
	public int width;
	public int height;
	
	public Rect(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ", " + this.width + ", " + this.height + ")";
	}
}