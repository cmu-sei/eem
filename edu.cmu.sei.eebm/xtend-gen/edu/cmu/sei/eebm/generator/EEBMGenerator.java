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
import edu.cmu.sei.eebm.eEBM.AndRefinement;
import edu.cmu.sei.eebm.eEBM.Conflict;
import edu.cmu.sei.eebm.eEBM.Goal;
import edu.cmu.sei.eebm.eEBM.IntentionalElement;
import edu.cmu.sei.eebm.eEBM.OrRefinement;
import edu.cmu.sei.eebm.eEBM.PriorityEnum;
import edu.cmu.sei.eebm.eEBM.Refinement;
import edu.cmu.sei.eebm.eEBM.Softgoal;
import edu.cmu.sei.eebm.eEBM.Task;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
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
            String _name = ((Goal)ielement).getName();
            _builder.append(_name, "");
            _builder.append(" = N + Goal (");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\"");
            String _title = ((Goal)ielement).getTitle();
            _builder.append(_title, "\t");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("priority = ");
            PriorityEnum _priority = ((Goal)ielement).getPriority();
            _builder.append(_priority, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cost = ");
            int _cost = ((Goal)ielement).getCost();
            _builder.append(_cost, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("benefit = ");
            int _benefit = ((Goal)ielement).getBenefit();
            _builder.append(_benefit, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(")");
            _builder.newLine();
          }
        }
        {
          if ((ielement instanceof Softgoal)) {
            String _name_1 = ((Softgoal)ielement).getName();
            _builder.append(_name_1, "");
            _builder.append(" = N + Softgoal (");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\"");
            String _title_1 = ((Softgoal)ielement).getTitle();
            _builder.append(_title_1, "\t");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("priority = ");
            PriorityEnum _priority_1 = ((Softgoal)ielement).getPriority();
            _builder.append(_priority_1, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cost = ");
            int _cost_1 = ((Softgoal)ielement).getCost();
            _builder.append(_cost_1, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("benefit = ");
            int _benefit_1 = ((Softgoal)ielement).getBenefit();
            _builder.append(_benefit_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(")");
            _builder.newLine();
          }
        }
        {
          if ((ielement instanceof Task)) {
            String _name_2 = ((Task)ielement).getName();
            _builder.append(_name_2, "");
            _builder.append(" = N + Task (");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\"");
            String _title_2 = ((Task)ielement).getTitle();
            _builder.append(_title_2, "\t");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("priority = ");
            PriorityEnum _priority_2 = ((Task)ielement).getPriority();
            _builder.append(_priority_2, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cost = ");
            int _cost_2 = ((Task)ielement).getCost();
            _builder.append(_cost_2, "\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("benefit = ");
            int _benefit_2 = ((Task)ielement).getBenefit();
            _builder.append(_benefit_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append(")");
            _builder.newLine();
          }
        }
        String _xblockexpression = null;
        {
          id = (id + 1);
          _xblockexpression = "";
        }
        _builder.append(_xblockexpression, "");
        _builder.newLineIfNotEmpty();
      }
    }
    String gen_string = _builder.toString();
    id = 0;
    String _gen_string = gen_string;
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      TreeIterator<EObject> _allContents_1 = resource.getAllContents();
      Iterator<Refinement> _filter_1 = Iterators.<Refinement>filter(_allContents_1, Refinement.class);
      Iterable<Refinement> _iterable_1 = IteratorExtensions.<Refinement>toIterable(_filter_1);
      for(final Refinement ielement_1 : _iterable_1) {
        {
          if ((ielement_1 instanceof AndRefinement)) {
            _builder_1.append("e");
            String _string = Integer.valueOf(id).toString();
            _builder_1.append(_string, "");
            _builder_1.append(" = E + And(");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("target = ");
            IntentionalElement _dest = ((AndRefinement)ielement_1).getDest();
            String _name_3 = _dest.getName();
            _builder_1.append(_name_3, "\t");
            _builder_1.append(",");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("source = [");
            {
              EList<IntentionalElement> _source = ((AndRefinement)ielement_1).getSource();
              boolean _hasElements = false;
              for(final IntentionalElement t : _source) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder_1.appendImmediate(",", "\t");
                }
                String _name_4 = t.getName();
                _builder_1.append(_name_4, "\t");
              }
            }
            _builder_1.append("]");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append(")");
            _builder_1.newLine();
          }
        }
        {
          if ((ielement_1 instanceof OrRefinement)) {
            _builder_1.append("e");
            String _string_1 = Integer.valueOf(id).toString();
            _builder_1.append(_string_1, "");
            _builder_1.append(" = E + Or(");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("target = ");
            IntentionalElement _dest_1 = ((OrRefinement)ielement_1).getDest();
            String _name_5 = _dest_1.getName();
            _builder_1.append(_name_5, "\t");
            _builder_1.append(",");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("source = [");
            {
              EList<IntentionalElement> _source_1 = ((OrRefinement)ielement_1).getSource();
              boolean _hasElements_1 = false;
              for(final IntentionalElement t_1 : _source_1) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder_1.appendImmediate(",", "\t");
                }
                String _name_6 = t_1.getName();
                _builder_1.append(_name_6, "\t");
              }
            }
            _builder_1.append("]");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append(")");
            _builder_1.newLine();
          }
        }
        {
          if ((ielement_1 instanceof Conflict)) {
            _builder_1.append("e");
            String _string_2 = Integer.valueOf(id).toString();
            _builder_1.append(_string_2, "");
            _builder_1.append(" = E + Conflict(");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("target = ");
            IntentionalElement _dest_2 = ielement_1.getDest();
            String _name_7 = _dest_2.getName();
            _builder_1.append(_name_7, "\t");
            _builder_1.append(",");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("source = ");
            EList<IntentionalElement> _source_2 = ielement_1.getSource();
            _builder_1.append(_source_2, "\t");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append(")");
            _builder_1.newLine();
          }
        }
        String _xblockexpression_1 = null;
        {
          id = (id + 1);
          _xblockexpression_1 = "";
        }
        _builder_1.append(_xblockexpression_1, "");
        _builder_1.newLineIfNotEmpty();
      }
    }
    gen_string = (_gen_string + _builder_1);
    fsa.generateFile("test.pystar", gen_string);
  }
}
