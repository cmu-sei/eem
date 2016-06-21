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
 */
package edu.cmu.sei.eebm.tests;

import com.google.inject.Inject;
import edu.cmu.sei.eebm.EEBMInjectorProvider;
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.Roadmap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EEBMInjectorProvider.class)
@SuppressWarnings("all")
public class EEBMParserTest {
  @Inject
  private ParseHelper<Roadmap> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  private final String path = "/Users/nernst/Documents/projects/EEBM/eebm/edu.cmu.sei.eebm/files/";
  
  private final String filename = "test2.eebm";
  
  private final String file = (this.path + this.filename);
  
  @Test
  public void testParsing() {
    try {
      String _load = this.load("test2.eebm");
      final Roadmap res = this.parseHelper.parse(_load);
      this._validationTestHelper.assertNoErrors(res);
      EList<IntentionalElement> _components = res.getComponents();
      final IntentionalElement goal = _components.get(0);
      String _name = goal.getName();
      Assert.assertEquals("hp", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleParse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Roadmap \"r1\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Goal hp : \'high performance\' [");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description \"a Description\"");
      _builder.newLine();
      _builder.append("]");
      _builder.newLine();
      final Roadmap plan = this.parseHelper.parse(_builder);
      EList<IntentionalElement> _components = plan.getComponents();
      final IntentionalElement goal = _components.get(0);
      String _name = goal.getName();
      Assert.assertEquals("hp", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String load(final String filename) {
    String _xtrycatchfinallyexpression = null;
    try {
      String _xblockexpression = null;
      {
        final String path = "/Users/nernst/Documents/projects/EEBM/eebm/edu.cmu.sei.eebm/files/";
        final String file = (path + filename);
        Path _get = Paths.get(file);
        List<String> _readAllLines = Files.readAllLines(_get);
        _xblockexpression = IterableExtensions.join(_readAllLines, " ");
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        String _xblockexpression_1 = null;
        {
          InputOutput.<IOException>println(e);
          _xblockexpression_1 = "bad file name";
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
