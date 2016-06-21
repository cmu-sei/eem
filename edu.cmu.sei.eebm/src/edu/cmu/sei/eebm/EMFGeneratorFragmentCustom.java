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
 */package edu.cmu.sei.eebm;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.ecore.EMFGeneratorFragment;

public class EMFGeneratorFragmentCustom extends EMFGeneratorFragment {

	private String copyrightText;

	public String getFileHeader() {
		return copyrightText;
	}

	public void setFileHeader(String copyrightText) {
		this.copyrightText = copyrightText.replace("/**\n * ", "").replace("\n */", "").replace("\n * ", "\n")
				.replace("\n *", "\n");
	}

	@Override
	protected GenModel getGenModel(ResourceSet rs, Grammar grammar, XpandExecutionContext ctx, List<EPackage> packs) {
		GenModel result = super.getGenModel(rs, grammar, ctx, packs);
		result.setCopyrightText(copyrightText);
		return result;
	}

}