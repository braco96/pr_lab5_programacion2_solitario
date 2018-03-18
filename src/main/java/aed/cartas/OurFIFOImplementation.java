package cartas;

import aed.fifo.*;

public class OurFIFOImplementation<E> extends FIFOArray<E> {
	public static int numOperations = 0;

	public OurFIFOImplementation() {
	    super();
	}

	public OurFIFOImplementation(E [] arr) {
	    super(arr);
	}

	@Override
	public void enqueue(E elem) {
		super.enqueue(elem);
		++numOperations;
	}

	@Override
	public void dequeue() {
		super.dequeue();
		++numOperations;
	}

	public static void resetNumOperations() {
		numOperations = 0;
	}
	
	public static int getNumOperations () {
		return numOperations;
	}
}
