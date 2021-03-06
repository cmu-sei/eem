/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm.serializer;

import com.google.inject.Inject;
import edu.cmu.sei.eebm.eEBM.AndRefinement;
import edu.cmu.sei.eebm.eEBM.Conflict;
import edu.cmu.sei.eebm.eEBM.Description;
import edu.cmu.sei.eebm.eEBM.EEBMPackage;
import edu.cmu.sei.eebm.eEBM.Goal;
import edu.cmu.sei.eebm.eEBM.OrRefinement;
import edu.cmu.sei.eebm.eEBM.Preference;
import edu.cmu.sei.eebm.eEBM.Rationale;
import edu.cmu.sei.eebm.eEBM.Reference;
import edu.cmu.sei.eebm.eEBM.Roadmap;
import edu.cmu.sei.eebm.eEBM.Softgoal;
import edu.cmu.sei.eebm.eEBM.Task;
import edu.cmu.sei.eebm.services.EEBMGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EEBMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EEBMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EEBMPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EEBMPackage.AND_REFINEMENT:
				sequence_AndRefinement(context, (AndRefinement) semanticObject); 
				return; 
			case EEBMPackage.CONFLICT:
				sequence_Conflict(context, (Conflict) semanticObject); 
				return; 
			case EEBMPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case EEBMPackage.GOAL:
				sequence_Goal(context, (Goal) semanticObject); 
				return; 
			case EEBMPackage.OR_REFINEMENT:
				sequence_OrRefinement(context, (OrRefinement) semanticObject); 
				return; 
			case EEBMPackage.PREFERENCE:
				sequence_Preference(context, (Preference) semanticObject); 
				return; 
			case EEBMPackage.RATIONALE:
				sequence_Rationale(context, (Rationale) semanticObject); 
				return; 
			case EEBMPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case EEBMPackage.ROADMAP:
				sequence_Roadmap(context, (Roadmap) semanticObject); 
				return; 
			case EEBMPackage.SOFTGOAL:
				sequence_Softgoal(context, (Softgoal) semanticObject); 
				return; 
			case EEBMPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Refinement returns AndRefinement
	 *     AndRefinement returns AndRefinement
	 *
	 * Constraint:
	 *     (name=ID (dest=[IntentionalElement|ID] | (source+=[IntentionalElement|ID] source+=[IntentionalElement|ID]*))+)
	 */
	protected void sequence_AndRefinement(ISerializationContext context, AndRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conflict returns Conflict
	 *
	 * Constraint:
	 *     (name=ID (source=[IntentionalElement|ID] | dest=[IntentionalElement|ID])+)
	 */
	protected void sequence_Conflict(ISerializationContext context, Conflict semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EEBMPackage.Literals.DESCRIPTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EEBMPackage.Literals.DESCRIPTION__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IntentionalElement returns Goal
	 *     Goal returns Goal
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             priority=PriorityEnum | 
	 *             time=INT | 
	 *             cost=INT | 
	 *             benefit=INT | 
	 *             date=STRING | 
	 *             cod=INT | 
	 *             rationale=Rationale | 
	 *             ref=Reference
	 *         )? 
	 *         (name=ID title=STRING? description=Description?)?
	 *     )+
	 */
	protected void sequence_Goal(ISerializationContext context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Refinement returns OrRefinement
	 *     OrRefinement returns OrRefinement
	 *
	 * Constraint:
	 *     (name=ID (dest=[IntentionalElement|ID] | (source+=[IntentionalElement|ID] source+=[IntentionalElement|ID]*))+)
	 */
	protected void sequence_OrRefinement(ISerializationContext context, OrRefinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Preference returns Preference
	 *
	 * Constraint:
	 *     (first=[IntentionalElement|ID] last=[IntentionalElement|ID])
	 */
	protected void sequence_Preference(ISerializationContext context, Preference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EEBMPackage.Literals.PREFERENCE__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EEBMPackage.Literals.PREFERENCE__FIRST));
			if (transientValues.isValueTransient(semanticObject, EEBMPackage.Literals.PREFERENCE__LAST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EEBMPackage.Literals.PREFERENCE__LAST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreferenceAccess().getFirstIntentionalElementIDTerminalRuleCall_1_0_1(), semanticObject.getFirst());
		feeder.accept(grammarAccess.getPreferenceAccess().getLastIntentionalElementIDTerminalRuleCall_3_0_1(), semanticObject.getLast());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rationale returns Rationale
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Rationale(ISerializationContext context, Rationale semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EEBMPackage.Literals.RATIONALE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EEBMPackage.Literals.RATIONALE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRationaleAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     docReference+=STRING
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Roadmap returns Roadmap
	 *
	 * Constraint:
	 *     (
	 *         (((name='Roadmap' components+=IntentionalElement+) | components+=IntentionalElement+)? (relations+=Refinement | relations+=Conflict)+) | 
	 *         (relations+=Refinement | relations+=Conflict)+
	 *     )?
	 */
	protected void sequence_Roadmap(ISerializationContext context, Roadmap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntentionalElement returns Softgoal
	 *     Softgoal returns Softgoal
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             priority=PriorityEnum | 
	 *             time=INT | 
	 *             cost=INT | 
	 *             benefit=INT | 
	 *             date=STRING | 
	 *             cod=INT | 
	 *             rationale=Rationale | 
	 *             ref=Reference
	 *         )? 
	 *         (name=ID title=STRING? description=Description?)?
	 *     )+
	 */
	protected void sequence_Softgoal(ISerializationContext context, Softgoal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntentionalElement returns Task
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             priority=PriorityEnum | 
	 *             time=INT | 
	 *             cost=INT | 
	 *             benefit=INT | 
	 *             date=STRING | 
	 *             cod=INT
	 *         )? 
	 *         (name=ID title=STRING? description=Description?)?
	 *     )+
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
