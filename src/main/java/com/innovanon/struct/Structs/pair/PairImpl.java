/**
 * 
 */
package com.innovanon.struct.Structs.pair;

/**
 * @author gouldbergstein
 *
 */
public class PairImpl<A, B> implements Pair<A, B> {

	private A car;
	private B cdr;

	/**
	 * @param car
	 * @param cdr
	 */
	public PairImpl(A car, B cdr) {
		this.car = car;
		this.cdr = cdr;
	}

	/**
	 * @return the car
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.struct.pair.Pair#getCAR()
	 */
	@Override
	public A getCAR() {
		return car;
	}

	/**
	 * @return the cdr
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.struct.pair.Pair#getCDR()
	 */
	@Override
	public B getCDR() {
		return cdr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("PairImpl [car=%s, cdr=%s]", car, cdr);
	}
}
