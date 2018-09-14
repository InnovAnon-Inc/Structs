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
public interface MutablePair<CAR, CDR> extends Pair<CAR, CDR> {
	/**
	 * @param car the {@link #CAR} to set
	 * @see #CAR
	 */
	void setCar(CAR car);

	/**
	 * @param cdr the {@link #CDR} to set
	 * @see #CDR
	 */
	void setCdr(CDR cdr);
}
