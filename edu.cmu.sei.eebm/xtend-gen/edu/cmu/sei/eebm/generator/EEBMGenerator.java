/**
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
package edu.cmu.sei.eebm.generator;

import com.google.common.collect.Iterators;
import edu.cmu.sei.eebm.eEBM.Goal;
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.PriorityEnum;
import edu.cmu.sei.eebm.eEBM.Softgoal;
import edu.cmu.sei.eebm.eEBM.Task;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EEBMGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    int id = 0;
    StringConcatenation _builder = new StringConcatenation();
    {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterator<IntentionalElement> _filter = Iterators.<IntentionalElement>filter(_allContents, IntentionalElement.class);
      Iterable<IntentionalElement> _iterable = IteratorExtensions.<IntentionalElement>toIterable(_filter);
      for(final IntentionalElement ielement : _iterable) {
        {
          if ((ielement instanceof Goal)) {
            _builder.append("n");
            String _string = Integer.valueOf(id).toString();
            _builder.append(_string, "");
            _builder.append(" = N + Goal (");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\"");
            String _name = ((Goal)ielement).getName();
            _builder.append(_name, "\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("priority = ");
            PriorityEnum _priority = ((Goal)ielement).getPriority();
            _builder.append(_priority, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cost = ");
            int _cost = ((Goal)ielement).getCost();
            _builder.append(_cost, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("benefit = ");
            int _benefit = ((Goal)ielement).getBenefit();
            _builder.append(_benefit, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(")\t");
            _builder.newLine();
          }
        }
        {
          if ((ielement instanceof Softgoal)) {
            _builder.append("n");
            String _string_1 = Integer.valueOf(id).toString();
            _builder.append(_string_1, "");
            _builder.append(" = N + Softgoal (");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\"");
            String _name_1 = ((Softgoal)ielement).getName();
            _builder.append(_name_1, "\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("priority = ");
            PriorityEnum _priority_1 = ((Softgoal)ielement).getPriority();
            _builder.append(_priority_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cost = ");
            int _cost_1 = ((Softgoal)ielement).getCost();
            _builder.append(_cost_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("benefit = ");
            int _benefit_1 = ((Softgoal)ielement).getBenefit();
            _builder.append(_benefit_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(")\t\t\t\t\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if ((ielement instanceof Task)) {
            _builder.append("n");
            String _string_2 = Integer.valueOf(id).toString();
            _builder.append(_string_2, "");
            _builder.append(" = N + Task (");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\"");
            String _name_2 = ((Task)ielement).getName();
            _builder.append(_name_2, "\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("priority = ");
            PriorityEnum _priority_2 = ((Task)ielement).getPriority();
            _builder.append(_priority_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cost = ");
            int _cost_2 = ((Task)ielement).getCost();
            _builder.append(_cost_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("benefit = ");
            int _benefit_2 = ((Task)ielement).getBenefit();
            _builder.append(_benefit_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(")\t\t\t\t\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        String _xblockexpression = null;
        {
          id = (id + 1);
          _xblockexpression = "";
        }
        _builder.append(_xblockexpression, "");
        _builder.newLineIfNotEmpty();
      }
    }
    fsa.generateFile("test.pystar", _builder);
  }
}
