package lab5.random;

import java.util.Random;

public class UniformRandomStream {

	private Random rand;
	private double lower, width;
	
	
	/**
	 * 
	 * @param lower pickup time for the fastest customer/cashier
	 * @param upper -//- slowest customer/cashier
	 * @param seed seed
	 */
	public UniformRandomStream(double lower, double upper, long seed) {
		rand = new Random(seed);
		this.lower = lower;
		this.width = upper-lower;
	}
	
	//True RNG
	public UniformRandomStream(double lower, double upper) {
		rand = new Random();
	    this.lower = lower;
	    this.width = upper-lower;
	}
	//Gives lower + random*width; 0<=random<=1 
	public double next() {
	    return lower+rand.nextDouble()*width;
	}
}

