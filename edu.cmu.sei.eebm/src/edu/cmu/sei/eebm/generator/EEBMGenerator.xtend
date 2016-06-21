/** Copyright (c) 2016 Carnegie Mellon University.
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
 */
package edu.cmu.sei.eebm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import edu.cmu.sei.eebm.eEBM.IntentionalElement
import edu.cmu.sei.eebm.eEBM.Goal
import edu.cmu.sei.eebm.eEBM.Softgoal
import edu.cmu.sei.eebm.eEBM.Task
import edu.cmu.sei.eebm.eEBM.Refinement
import edu.cmu.sei.eebm.eEBM.AndRefinement
import edu.cmu.sei.eebm.eEBM.OrRefinement
import edu.cmu.sei.eebm.eEBM.Conflict

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EEBMGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var id = 0;
		var gen_string = '''
		«FOR ielement : resource.allContents.filter(IntentionalElement).toIterable»
			«IF ielement instanceof Goal »
				«ielement.name» = N + Goal (
					"«ielement.title»",
					priority = «ielement.priority»,
					cost = «ielement.cost»,
					benefit = «ielement.benefit»
				)
			«ENDIF»
			«IF ielement instanceof Softgoal»
				«ielement.name» = N + Softgoal (
					"«ielement.title»",
					priority = «ielement.priority»,
					cost = «ielement.cost»,
					benefit = «ielement.benefit»
				)
			«ENDIF»
			«IF ielement instanceof Task»
				«ielement.name» = N + Task (
					"«ielement.title»",
					priority = «ielement.priority»,
					cost = «ielement.cost»,
					benefit = «ielement.benefit»
				)
			«ENDIF»
			«{id = id + 1; ""}»
		«ENDFOR»
		''';
		id = 0
		gen_string += '''
		«FOR ielement : resource.allContents.filter(Refinement).toIterable»
			«IF ielement instanceof AndRefinement »
				e«id.toString()» = E + And(
					target = «ielement.dest.name»,
					source = [«FOR t : ielement.source SEPARATOR ','»«t.name»«ENDFOR»]
				)
			«ENDIF»
			«IF ielement instanceof OrRefinement »
				e«id.toString()» = E + Or(
					target = «ielement.dest.name»,
					source = [«FOR t : ielement.source SEPARATOR ','»«t.name»«ENDFOR»]
				)
			«ENDIF»
			«IF ielement instanceof Conflict »
				e«id.toString()» = E + Conflict(
					target = «ielement.dest.name»,
					source = «ielement.source»
				)
			«ENDIF»
			«{id = id + 1; ""}»
		«ENDFOR»
		'''
		fsa.generateFile('test.pystar',  gen_string)
	}
}
