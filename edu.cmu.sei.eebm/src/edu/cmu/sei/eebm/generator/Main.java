/**
 * EEBM
 * Copyright (c) 2016 Carnegie Mellon University.
 * All Rights Reserved.
 *  
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE 
 * MATERIAL IS FURNISHED ON AN “AS-IS” BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO 
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING, 
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY, EXCLUSIVITY, 
 * OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT 
 * MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, 
 * OR COPYRIGHT INFRINGEMENT.
 *  
 * Released under a BSD-style license, please see COPYRIGHT or contact 
 * permission@sei.cmu.edu for full terms.  DM-0003721
 *  
 * This Software includes and/or makes use of the following 
 * Third-Party Software subject to its own license:
 * a.       Eclipse libraries (https://eclipse.org/)
 * b.      Xtext https://eclipse.org/Xtext/
 * Complete information can be found in build.xml
 *
 */
package edu.cmu.sei.eebm.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {
	
	public static void main(String[] args) {
		if (args.length==0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}
		Injector injector = new edu.cmu.sei.eebm.EEBMStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(args[0]);
	}
	
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private IGenerator generator;
	
	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String string) {
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(string), true);
		
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}
		
		// configure and start the generator
		fileAccess.setOutputPath("src-gen/");
		generator.doGenerate(resource, fileAccess);
		
		System.out.println("Code generation finished.");
	}
}
