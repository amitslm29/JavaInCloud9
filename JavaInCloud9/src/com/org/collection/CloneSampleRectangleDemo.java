package com.org.collection;

public class CloneSampleRectangleDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Rectangle first = new Rectangle(10, 20);
		Rectangle second = (Rectangle) first.clone();
		
		System.out.println(first != second);
		System.out.println(first.equals(second));
		System.out.println(first.getClass() == second.getClass());
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		
		second.setHeight(100);
		second.setWidth(200);
		
		System.out.println("Original Object >>> " + first);
		System.out.println("Cloned Object >>> " + second);
		
	}
}

class Rectangle implements Cloneable {
	
	private int height;
	private int width;
	
	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Height - " + height + ":::" + "Width - " + width;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }
	
	@Override
    public int hashCode() {
       return super.hashCode();
    }
	
}
