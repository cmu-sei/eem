/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import edu.cmu.sei.eebm.ui.internal.EEBMActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EEBMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EEBMActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EEBMActivator.getInstance().getInjector(EEBMActivator.EDU_CMU_SEI_EEBM_EEBM);
	}
	
}