package dev.odo.starter;

public class SquareRootThread extends Thread {
    public void run() {
		double x = 0.0001;
		for (int i = 0; i <= 100000000; i++) {
		  	x = x + Math.sqrt(i);
		}
		x = 0.0001;
		for (int j = 0; j <= 100000000; j++) {
			x = x + Math.sqrt(j);
		}
	}
}
