package edu.cmu.sei.eebm.tests;

import com.google.inject.Inject;
import edu.cmu.sei.eebm.EEBMInjectorProvider;
import edu.cmu.sei.eebm.eEBM.Plan;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EEBMInjectorProvider.class)
@SuppressWarnings("all")
public class EEBMParserTest {
  @Inject
  @Extension
  private ParseHelper<Plan> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsing() {
    try {
      final String plan = this.load("test.eebm");
      Plan _parse = this._parseHelper.parse(plan);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String load(final String filename) {
    String _xtrycatchfinallyexpression = null;
    try {
      String _xblockexpression = null;
      {
        final String path = "/Users/nernst/Documents/src/eebm/edu.cmu.sei.eebm/files/";
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
