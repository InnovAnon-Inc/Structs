/**
 * 
 */
package com.innovanon.struct.Structs.pair;

/**
 * <cite>wikipedia:</cite>
 * <blockquote cite="https://en.wikipedia.org/wiki/CAR_and_CDR">...each of which
 * took a machine address [the instance of RegisterNumber upon which the
 * enclosed methods are invoked] as an argument, loaded the corresponding word
 * from memory, and extracted the appropriate bits.</blockquote>
 * 
 * @author gouldbergstein
 *
 * @param <CAR> Contents of the Address part of Register number
 * @param <CDR> Contents of the Decrement part of Register number
 * @param <CPR> Contents of the Prefix part of Register number
 * @param <CTR> Contents of the Tag part of Register number
 */
public interface RegisterNumber<CAR, CDR, CPR, CTR> extends Pair<Pair<CAR, CDR>, Pair<CPR, CTR>> {
	/**
	 * @return the {@link #CAR}
	 * @see Pair#getCar()
	 * @see #CAR
	 */
	CAR getCaar();

	/**
	 * @return the {@link #CDR}
	 * @see Pair#getCdr()
	 * @see #CDR
	 */
	CDR getCadr();

	/**
	 * @return the {@link #CPR}
	 * @see Pair#getCar()
	 * @see #CPR
	 */
	CPR getCdar();

	/**
	 * @return the {@link #CTR}
	 * @see Pair#getCARs()
	 * @see #CTR
	 */
	CTR getCddr();
}
