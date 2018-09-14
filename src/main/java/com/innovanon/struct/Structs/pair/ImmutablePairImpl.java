/**
 * 
 */
package com.innovanon.struct.Structs.pair;

/**
 * @author gouldbergstein
 * 
 * @param <CAR> Contents of the Address part of Register number
 * @param <CDR> Contents of the Decrement part of Register number
 */
public class ImmutablePairImpl<CAR, CDR> extends PairImpl<CAR, CDR> implements ImmutablePair<CAR, CDR> {
	/**
	 * the car
	 * @see #CAR
	 */
	private CAR car;
	/**
	 * the cdr
	 * @see #CDR
	 */
	private CDR cdr;
	
	/**
	 * @param car the car to set
	 * @param cdr the cdr to set
	 */
	public ImmutablePairImpl(CAR car, CDR cdr) {
		this.car = car;
		this.cdr = cdr;
	}
	
	/**
	 * @return the the {@link #car}
	 * @see #CAR
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.struct.pair.Pair#getCAR()
	 */
	@Override
	public CAR getCar() {
		return car;
	}

	/**
	 * @return the {@link #cdr}
	 * @see #CDR
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.simon.struct.pair.Pair#getCDR()
	 */
	@Override
	public CDR getCdr() {
		return cdr;
	}
}
