/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import edu.cmu.sei.eebm.eEBM.IntentionalElement
import edu.cmu.sei.eebm.eEBM.Goal
import edu.cmu.sei.eebm.eEBM.Softgoal
import edu.cmu.sei.eebm.eEBM.Task

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EEBMGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var id = 0;
		fsa.generateFile('test.pystar',  '''
			«FOR ielement : resource.allContents.filter(IntentionalElement).toIterable»
					«IF ielement instanceof Goal »
					n«id.toString()» = N + Goal (
						"«ielement.name»"
						priority = «ielement.priority»
						cost = «ielement.cost»
						benefit = «ielement.benefit»
					)	
					«ENDIF»
					«IF ielement instanceof Softgoal»
					n«id.toString()» = N + Softgoal (
						"«ielement.name»"
						priority = «ielement.priority»
						cost = «ielement.cost»
						benefit = «ielement.benefit»
					)						«ENDIF»
					«IF ielement instanceof Task»
					n«id.toString()» = N + Task (
						"«ielement.name»"
						priority = «ielement.priority»
						cost = «ielement.cost»
						benefit = «ielement.benefit»
					)						«ENDIF»
					«{id = id + 1; ""}»
            «ENDFOR»
		''')
	}
}
