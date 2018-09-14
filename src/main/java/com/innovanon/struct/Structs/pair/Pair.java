/**
 * 
 */
package com.innovanon.struct.Structs.pair;

/**
 * <cite>wikipedia:</cite>
 * <blockquote cite="https://en.wikipedia.org/wiki/CAR_and_CDR">A cons cell is composed of two pointers; the #CAR [{@link #getCar()}] operation
 * extracts the first pointer, and the #CDR [{@link #getCdr()}] operation extracts the
 * second.</blockquote>
 * 
 * @author gouldbergstein
 *
 * @param <CAR> Contents of the Address part of Register number
 * @param <CDR> Contents of the Decrement part of Register number
 */
public interface Pair<CAR, CDR> {
	/**
	 * @return the {@link CAR}
	 * @see Pair#CAR
	 */
	CAR getCar();

	/**
	 * @return the {@link CDR}
	 * @see Pair#CDR
	 */
	CDR getCdr();
}
