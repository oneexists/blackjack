package myInteger;

public class MyInteger {
	int value;
	
	//constructors
	public MyInteger() {
		this.value = 1082;
	}
	
	//getters and setters
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	//methods
	public boolean isEven(int value) {
		if(value % 2 == 0) {
			return true;
		}
		else
		return false;
	}
	
	public boolean isOdd(int value) {
		if(value % 2 == 1) {
			return true;
		}
		else
		return false;
	}
	
	public int add(int myInteger1, int myInteger2) {
		int add = myInteger1 + myInteger2;
		return add;
	}
	
	public String toString() {
		String description = this.value;
		return description;
	}
	
	public static void main(String[] args) {
		
	}
}
