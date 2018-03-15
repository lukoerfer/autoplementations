package de.lukaskoerfer.implementation.processor.methods;

import de.lukaskoerfer.implementation.annotations.Implementation;

public class FloatMethodHandler extends ValueMethodHandler {

	public FloatMethodHandler(Implementation implementation) {
		super(implementation);
	}

	@Override
	protected String getValue() {
		return Float.toString(0);
	}
	
}