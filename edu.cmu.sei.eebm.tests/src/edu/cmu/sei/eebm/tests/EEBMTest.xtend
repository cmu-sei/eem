package edu.cmu.sei.eebm.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

//import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import edu.cmu.sei.eebm.EEBMInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ParseHelper
import java.io.IOException
import edu.cmu.sei.eebm.eEBM.Plan
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EEBMInjectorProvider))

class EEBMParserTest {
	@Inject extension ParseHelper<Plan>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testParsing() {
		val plan =  load('test.eebm') //as String
		//println(plan)
		plan.parse.assertNoErrors
	}

	def load(String filename) {
		try {
			val path = "/Users/nernst/Documents/src/eebm/edu.cmu.sei.eebm/files/"
			val file = path + filename
			Files.readAllLines(Paths.get(file)).join(' ')
		} catch (IOException e) {
			println(e)
			'bad file name'
		}
	}
}