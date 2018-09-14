/**
 * 
 */
package com.innovanon.struct.Structs.pair;

/**
 * @author gouldbergstein
 * @param <CAR> Contents of the Address part of Register number
 * @param <CDR> Contents of the Decrement part of Register number
 */
public abstract class PairImpl<CAR, CDR> implements Pair<CAR, CDR> {
	/**
	 * @see #toString(Class)
	 * @see Object#getClass()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return toString(this.getClass());
	}
	
	/**
	 * @param subtype the type of the invoking object
	 * @return a formated String for use with {@link #toString()}
	 */
	protected String toString(Class<?> subtype) {
		return String.format("%s [car=%s, cdr=%s]", subtype.getSimpleName(),getCar(),getCdr());
	}
}
