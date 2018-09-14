/**
 * 
 */
package com.innovanon.struct.Structs.pair;

/**
 * @author gouldbergstein
 *
 * @param <CAR> Contents of the Address part of Register number
 * @param <CDR> Contents of the Decrement part of Register number
 * @param <CPR> Contents of the Prefix part of Register number
 * @param <CTR> Contents of the Tag part of Register number
 */
public class RegisterNumberImpl<CAR, CDR, CPR, CTR> extends ImmutablePairImpl<Pair<CAR, CDR>, Pair<CPR, CTR>>
		implements RegisterNumber<CAR, CDR, CPR, CTR> {
	/**
	 * @param car the car to set
	 * @param cdr the cdr to set
	 * @see ImmutablePairImpl#ImmutablePairImpl(Object, Object)
	 */
	public RegisterNumberImpl(Pair<CAR, CDR> car, Pair<CPR, CTR> cdr) {
		super(car, cdr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.struct.Structs.pair.RegisterNumber#getCaar()
	 */
	@Override
	public CAR getCaar() {
		return getCar().getCar();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.struct.Structs.pair.RegisterNumber#getCadr()
	 */
	@Override
	public CDR getCadr() {
		return getCar().getCdr();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.struct.Structs.pair.RegisterNumber#getCdar()
	 */
	@Override
	public CPR getCdar() {
		return getCdr().getCar();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.innovanon.struct.Structs.pair.RegisterNumber#getCddr()
	 */
	@Override
	public CTR getCddr() {
		return getCdr().getCdr();
	}
}
