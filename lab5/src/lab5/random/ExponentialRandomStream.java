package lab5.random;

import java.util.Random;

public class ExponentialRandomStream {
	
	private Random rand;
	private double lambda;
	
	/**
	 * 
	 * @param lambda Numbers of customers per hour
	 * @param seed "seed"
	 * Gives a predictable rand
	 */
	public ExponentialRandomStream(double lambda, long seed) {
	  	rand = new Random(seed);
	  	this.lambda = lambda;
	}
	//True RNG
	public ExponentialRandomStream(double lambda) {
		rand = new Random();
	    this.lambda = lambda;
	}
	//returns 0x<1, constant arrival rate of customers
	public double next() {
	  	return -Math.log(rand.nextDouble())/lambda;
	}
}
