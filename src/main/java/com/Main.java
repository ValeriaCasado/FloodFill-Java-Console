package main.java.com;
import floodfill.java.com.*;

public class Main {

	public static void main(String[] args) {
		FloodFill ff = new FloodFill();
		System.out.print(ff);
		ff.floodFillArray(0,0,5);
		System.out.print(ff);
	}

}
