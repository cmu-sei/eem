/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EEBMUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return edu.cmu.sei.eebm.ui.internal.EEBMActivator.getInstance().getInjector("edu.cmu.sei.eebm.EEBM");
	}

}
