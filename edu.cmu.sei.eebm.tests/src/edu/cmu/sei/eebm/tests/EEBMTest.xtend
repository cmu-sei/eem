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
import java.io.FileInputStream
import edu.cmu.sei.eebm.eEBM.Roadmap
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import static org.junit.Assert.*
import java.io.InputStream

@RunWith(XtextRunner)
@InjectWith(EEBMInjectorProvider)

class EEBMParserTest {
	@Inject ParseHelper<Roadmap> parseHelper
	@Inject extension ValidationTestHelper
	
	val path = "/Users/nernst/Documents/projects/EEBM/eebm/edu.cmu.sei.eebm/files/"
	val filename = 'test2.eebm'
	val file = path + filename
			
	@Test
	def void testParsing() {
		val res = parseHelper.parse(load('test2.eebm'))
        assertNoErrors(res)
		val goal = res.components.get(0)
		assertEquals("hp",goal.name)
	}
	
	@Test
	def void testSimpleParse() {
		val plan = parseHelper.parse('''
			Roadmap "r1"

			Goal hp : 'high performance' [
				description "a Description"
			]
		''')
		val goal = plan.components.get(0)
		assertEquals("hp",goal.name)
	}

	def load(String filename) {
		try {
			val path = "/Users/nernst/Documents/projects/EEBM/eebm/edu.cmu.sei.eebm/files/"
			val file = path + filename
			Files.readAllLines(Paths.get(file)).join(' ')
//			Files.newInputStream(Paths.get(file))
		} catch (IOException e) {
			println(e)
			'bad file name'
		}
	}
}