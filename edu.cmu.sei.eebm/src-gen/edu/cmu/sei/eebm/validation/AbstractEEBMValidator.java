/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractEEBMValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(edu.cmu.sei.eebm.eEBM.EEBMPackage.eINSTANCE);
		return result;
	}
}
