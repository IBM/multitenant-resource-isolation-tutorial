package dev.odo.starter;

public class SquareRootThread extends Thread {
    public void run() {
		double x = 0.0001;
		for (int i = 0; i <= 10000000; i++) {
		  	x += Math.sqrt(i);
		}
		x = 0.0001;
		for (int j = 0; j <= 10000000; j++) {
			x += Math.sqrt(j);
		}
	}
}
