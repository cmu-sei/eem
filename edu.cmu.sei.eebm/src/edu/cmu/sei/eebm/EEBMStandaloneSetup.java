/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EEBMStandaloneSetup extends EEBMStandaloneSetupGenerated{

	public static void doSetup() {
		new EEBMStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

