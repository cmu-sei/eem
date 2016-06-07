/*
 * generated by Xtext
 */
package edu.cmu.sei.eebm.serializer;

import com.google.inject.Inject;
import edu.cmu.sei.eebm.services.EEBMGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EEBMSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EEBMGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a;
	protected AbstractElementAlias match_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p;
	protected AbstractElementAlias match_Goal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p;
	protected AbstractElementAlias match_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a;
	protected AbstractElementAlias match_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p;
	protected AbstractElementAlias match_Softgoal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p;
	protected AbstractElementAlias match_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__a;
	protected AbstractElementAlias match_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__p;
	protected AbstractElementAlias match_Task___RightSquareBracketKeyword_6_1_PriorityKeyword_1_0_a__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EEBMGrammarAccess) access;
		match_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getGoalAccess().getPriorityKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getRightSquareBracketKeyword_8_1()));
		match_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getGoalAccess().getPriorityKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getRightSquareBracketKeyword_8_1()));
		match_Goal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getGoalAccess().getRightSquareBracketKeyword_8_1()), new TokenAlias(true, true, grammarAccess.getGoalAccess().getPriorityKeyword_1_0()));
		match_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getPriorityKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getRightSquareBracketKeyword_8_1()));
		match_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getPriorityKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getRightSquareBracketKeyword_8_1()));
		match_Softgoal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSoftgoalAccess().getRightSquareBracketKeyword_8_1()), new TokenAlias(true, true, grammarAccess.getSoftgoalAccess().getPriorityKeyword_1_0()));
		match_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getTaskAccess().getPriorityKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1()));
		match_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getTaskAccess().getPriorityKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1()));
		match_Task___RightSquareBracketKeyword_6_1_PriorityKeyword_1_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1()), new TokenAlias(true, true, grammarAccess.getTaskAccess().getPriorityKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a.equals(syntax))
				emit_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p.equals(syntax))
				emit_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p.equals(syntax))
				emit_Goal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a.equals(syntax))
				emit_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p.equals(syntax))
				emit_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Softgoal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p.equals(syntax))
				emit_Softgoal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__a.equals(syntax))
				emit_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__p.equals(syntax))
				emit_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task___RightSquareBracketKeyword_6_1_PriorityKeyword_1_0_a__p.equals(syntax))
				emit_Task___RightSquareBracketKeyword_6_1_PriorityKeyword_1_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('priority' | ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Goal' name=ID
	 *     (rule start) (ambiguity) 'benefit' benefit=INT
	 *     (rule start) (ambiguity) 'completion' date=STRING
	 *     (rule start) (ambiguity) 'cost' cost=INT
	 *     (rule start) (ambiguity) 'delay cost' cod=INT
	 *     (rule start) (ambiguity) 'time' time=INT
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) priority=PriorityEnum
	 *     (rule start) (ambiguity) rationale=Rationale
	 *     (rule start) (ambiguity) ref=Reference
	 *     benefit=INT (ambiguity) 'Goal' name=ID
	 *     benefit=INT (ambiguity) 'benefit' benefit=INT
	 *     benefit=INT (ambiguity) 'completion' date=STRING
	 *     benefit=INT (ambiguity) 'cost' cost=INT
	 *     benefit=INT (ambiguity) 'delay cost' cod=INT
	 *     benefit=INT (ambiguity) 'time' time=INT
	 *     benefit=INT (ambiguity) (rule end)
	 *     benefit=INT (ambiguity) priority=PriorityEnum
	 *     benefit=INT (ambiguity) rationale=Rationale
	 *     benefit=INT (ambiguity) ref=Reference
	 *     cod=INT (ambiguity) 'Goal' name=ID
	 *     cod=INT (ambiguity) 'benefit' benefit=INT
	 *     cod=INT (ambiguity) 'completion' date=STRING
	 *     cod=INT (ambiguity) 'cost' cost=INT
	 *     cod=INT (ambiguity) 'delay cost' cod=INT
	 *     cod=INT (ambiguity) 'time' time=INT
	 *     cod=INT (ambiguity) (rule end)
	 *     cod=INT (ambiguity) priority=PriorityEnum
	 *     cod=INT (ambiguity) rationale=Rationale
	 *     cod=INT (ambiguity) ref=Reference
	 *     cost=INT (ambiguity) 'Goal' name=ID
	 *     cost=INT (ambiguity) 'benefit' benefit=INT
	 *     cost=INT (ambiguity) 'completion' date=STRING
	 *     cost=INT (ambiguity) 'cost' cost=INT
	 *     cost=INT (ambiguity) 'delay cost' cod=INT
	 *     cost=INT (ambiguity) 'time' time=INT
	 *     cost=INT (ambiguity) (rule end)
	 *     cost=INT (ambiguity) priority=PriorityEnum
	 *     cost=INT (ambiguity) rationale=Rationale
	 *     cost=INT (ambiguity) ref=Reference
	 *     date=STRING (ambiguity) 'Goal' name=ID
	 *     date=STRING (ambiguity) 'benefit' benefit=INT
	 *     date=STRING (ambiguity) 'completion' date=STRING
	 *     date=STRING (ambiguity) 'cost' cost=INT
	 *     date=STRING (ambiguity) 'delay cost' cod=INT
	 *     date=STRING (ambiguity) 'time' time=INT
	 *     date=STRING (ambiguity) (rule end)
	 *     date=STRING (ambiguity) priority=PriorityEnum
	 *     date=STRING (ambiguity) rationale=Rationale
	 *     date=STRING (ambiguity) ref=Reference
	 *     description=Description (ambiguity) 'Goal' name=ID
	 *     description=Description (ambiguity) 'benefit' benefit=INT
	 *     description=Description (ambiguity) 'completion' date=STRING
	 *     description=Description (ambiguity) 'cost' cost=INT
	 *     description=Description (ambiguity) 'delay cost' cod=INT
	 *     description=Description (ambiguity) 'time' time=INT
	 *     description=Description (ambiguity) (rule end)
	 *     description=Description (ambiguity) priority=PriorityEnum
	 *     description=Description (ambiguity) rationale=Rationale
	 *     description=Description (ambiguity) ref=Reference
	 *     name=ID '[' (ambiguity) 'Goal' name=ID
	 *     name=ID '[' (ambiguity) 'benefit' benefit=INT
	 *     name=ID '[' (ambiguity) 'completion' date=STRING
	 *     name=ID '[' (ambiguity) 'cost' cost=INT
	 *     name=ID '[' (ambiguity) 'delay cost' cod=INT
	 *     name=ID '[' (ambiguity) 'time' time=INT
	 *     name=ID '[' (ambiguity) (rule end)
	 *     name=ID '[' (ambiguity) priority=PriorityEnum
	 *     name=ID '[' (ambiguity) rationale=Rationale
	 *     name=ID '[' (ambiguity) ref=Reference
	 *     priority=PriorityEnum (ambiguity) 'Goal' name=ID
	 *     priority=PriorityEnum (ambiguity) 'benefit' benefit=INT
	 *     priority=PriorityEnum (ambiguity) 'completion' date=STRING
	 *     priority=PriorityEnum (ambiguity) 'cost' cost=INT
	 *     priority=PriorityEnum (ambiguity) 'delay cost' cod=INT
	 *     priority=PriorityEnum (ambiguity) 'time' time=INT
	 *     priority=PriorityEnum (ambiguity) (rule end)
	 *     priority=PriorityEnum (ambiguity) priority=PriorityEnum
	 *     priority=PriorityEnum (ambiguity) rationale=Rationale
	 *     priority=PriorityEnum (ambiguity) ref=Reference
	 *     rationale=Rationale (ambiguity) 'Goal' name=ID
	 *     rationale=Rationale (ambiguity) 'benefit' benefit=INT
	 *     rationale=Rationale (ambiguity) 'completion' date=STRING
	 *     rationale=Rationale (ambiguity) 'cost' cost=INT
	 *     rationale=Rationale (ambiguity) 'delay cost' cod=INT
	 *     rationale=Rationale (ambiguity) 'time' time=INT
	 *     rationale=Rationale (ambiguity) (rule end)
	 *     rationale=Rationale (ambiguity) priority=PriorityEnum
	 *     rationale=Rationale (ambiguity) rationale=Rationale
	 *     rationale=Rationale (ambiguity) ref=Reference
	 *     time=INT (ambiguity) 'Goal' name=ID
	 *     time=INT (ambiguity) 'benefit' benefit=INT
	 *     time=INT (ambiguity) 'completion' date=STRING
	 *     time=INT (ambiguity) 'cost' cost=INT
	 *     time=INT (ambiguity) 'delay cost' cod=INT
	 *     time=INT (ambiguity) 'time' time=INT
	 *     time=INT (ambiguity) (rule end)
	 *     time=INT (ambiguity) priority=PriorityEnum
	 *     time=INT (ambiguity) rationale=Rationale
	 *     time=INT (ambiguity) ref=Reference
	 *     title=STRING '[' (ambiguity) 'Goal' name=ID
	 *     title=STRING '[' (ambiguity) 'benefit' benefit=INT
	 *     title=STRING '[' (ambiguity) 'completion' date=STRING
	 *     title=STRING '[' (ambiguity) 'cost' cost=INT
	 *     title=STRING '[' (ambiguity) 'delay cost' cod=INT
	 *     title=STRING '[' (ambiguity) 'time' time=INT
	 *     title=STRING '[' (ambiguity) (rule end)
	 *     title=STRING '[' (ambiguity) priority=PriorityEnum
	 *     title=STRING '[' (ambiguity) rationale=Rationale
	 *     title=STRING '[' (ambiguity) ref=Reference
	 */
	protected void emit_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('priority' | ']')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Goal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'priority'*)+
	 *
	 * This ambiguous syntax occurs at:
	 *     ref=Reference (ambiguity) 'Goal' name=ID
	 *     ref=Reference (ambiguity) 'benefit' benefit=INT
	 *     ref=Reference (ambiguity) 'completion' date=STRING
	 *     ref=Reference (ambiguity) 'cost' cost=INT
	 *     ref=Reference (ambiguity) 'delay cost' cod=INT
	 *     ref=Reference (ambiguity) 'time' time=INT
	 *     ref=Reference (ambiguity) (rule end)
	 *     ref=Reference (ambiguity) priority=PriorityEnum
	 *     ref=Reference (ambiguity) rationale=Rationale
	 *     ref=Reference (ambiguity) ref=Reference
	 */
	protected void emit_Goal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('priority' | ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Softgoal' name=ID
	 *     (rule start) (ambiguity) 'benefit' benefit=INT
	 *     (rule start) (ambiguity) 'completion' date=STRING
	 *     (rule start) (ambiguity) 'cost' cost=INT
	 *     (rule start) (ambiguity) 'delay cost' cod=INT
	 *     (rule start) (ambiguity) 'time' time=INT
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) priority=PriorityEnum
	 *     (rule start) (ambiguity) rationale=Rationale
	 *     (rule start) (ambiguity) ref=Reference
	 *     benefit=INT (ambiguity) 'Softgoal' name=ID
	 *     benefit=INT (ambiguity) 'benefit' benefit=INT
	 *     benefit=INT (ambiguity) 'completion' date=STRING
	 *     benefit=INT (ambiguity) 'cost' cost=INT
	 *     benefit=INT (ambiguity) 'delay cost' cod=INT
	 *     benefit=INT (ambiguity) 'time' time=INT
	 *     benefit=INT (ambiguity) (rule end)
	 *     benefit=INT (ambiguity) priority=PriorityEnum
	 *     benefit=INT (ambiguity) rationale=Rationale
	 *     benefit=INT (ambiguity) ref=Reference
	 *     cod=INT (ambiguity) 'Softgoal' name=ID
	 *     cod=INT (ambiguity) 'benefit' benefit=INT
	 *     cod=INT (ambiguity) 'completion' date=STRING
	 *     cod=INT (ambiguity) 'cost' cost=INT
	 *     cod=INT (ambiguity) 'delay cost' cod=INT
	 *     cod=INT (ambiguity) 'time' time=INT
	 *     cod=INT (ambiguity) (rule end)
	 *     cod=INT (ambiguity) priority=PriorityEnum
	 *     cod=INT (ambiguity) rationale=Rationale
	 *     cod=INT (ambiguity) ref=Reference
	 *     cost=INT (ambiguity) 'Softgoal' name=ID
	 *     cost=INT (ambiguity) 'benefit' benefit=INT
	 *     cost=INT (ambiguity) 'completion' date=STRING
	 *     cost=INT (ambiguity) 'cost' cost=INT
	 *     cost=INT (ambiguity) 'delay cost' cod=INT
	 *     cost=INT (ambiguity) 'time' time=INT
	 *     cost=INT (ambiguity) (rule end)
	 *     cost=INT (ambiguity) priority=PriorityEnum
	 *     cost=INT (ambiguity) rationale=Rationale
	 *     cost=INT (ambiguity) ref=Reference
	 *     date=STRING (ambiguity) 'Softgoal' name=ID
	 *     date=STRING (ambiguity) 'benefit' benefit=INT
	 *     date=STRING (ambiguity) 'completion' date=STRING
	 *     date=STRING (ambiguity) 'cost' cost=INT
	 *     date=STRING (ambiguity) 'delay cost' cod=INT
	 *     date=STRING (ambiguity) 'time' time=INT
	 *     date=STRING (ambiguity) (rule end)
	 *     date=STRING (ambiguity) priority=PriorityEnum
	 *     date=STRING (ambiguity) rationale=Rationale
	 *     date=STRING (ambiguity) ref=Reference
	 *     description=Description (ambiguity) 'Softgoal' name=ID
	 *     description=Description (ambiguity) 'benefit' benefit=INT
	 *     description=Description (ambiguity) 'completion' date=STRING
	 *     description=Description (ambiguity) 'cost' cost=INT
	 *     description=Description (ambiguity) 'delay cost' cod=INT
	 *     description=Description (ambiguity) 'time' time=INT
	 *     description=Description (ambiguity) (rule end)
	 *     description=Description (ambiguity) priority=PriorityEnum
	 *     description=Description (ambiguity) rationale=Rationale
	 *     description=Description (ambiguity) ref=Reference
	 *     name=ID '[' (ambiguity) 'Softgoal' name=ID
	 *     name=ID '[' (ambiguity) 'benefit' benefit=INT
	 *     name=ID '[' (ambiguity) 'completion' date=STRING
	 *     name=ID '[' (ambiguity) 'cost' cost=INT
	 *     name=ID '[' (ambiguity) 'delay cost' cod=INT
	 *     name=ID '[' (ambiguity) 'time' time=INT
	 *     name=ID '[' (ambiguity) (rule end)
	 *     name=ID '[' (ambiguity) priority=PriorityEnum
	 *     name=ID '[' (ambiguity) rationale=Rationale
	 *     name=ID '[' (ambiguity) ref=Reference
	 *     priority=PriorityEnum (ambiguity) 'Softgoal' name=ID
	 *     priority=PriorityEnum (ambiguity) 'benefit' benefit=INT
	 *     priority=PriorityEnum (ambiguity) 'completion' date=STRING
	 *     priority=PriorityEnum (ambiguity) 'cost' cost=INT
	 *     priority=PriorityEnum (ambiguity) 'delay cost' cod=INT
	 *     priority=PriorityEnum (ambiguity) 'time' time=INT
	 *     priority=PriorityEnum (ambiguity) (rule end)
	 *     priority=PriorityEnum (ambiguity) priority=PriorityEnum
	 *     priority=PriorityEnum (ambiguity) rationale=Rationale
	 *     priority=PriorityEnum (ambiguity) ref=Reference
	 *     rationale=Rationale (ambiguity) 'Softgoal' name=ID
	 *     rationale=Rationale (ambiguity) 'benefit' benefit=INT
	 *     rationale=Rationale (ambiguity) 'completion' date=STRING
	 *     rationale=Rationale (ambiguity) 'cost' cost=INT
	 *     rationale=Rationale (ambiguity) 'delay cost' cod=INT
	 *     rationale=Rationale (ambiguity) 'time' time=INT
	 *     rationale=Rationale (ambiguity) (rule end)
	 *     rationale=Rationale (ambiguity) priority=PriorityEnum
	 *     rationale=Rationale (ambiguity) rationale=Rationale
	 *     rationale=Rationale (ambiguity) ref=Reference
	 *     time=INT (ambiguity) 'Softgoal' name=ID
	 *     time=INT (ambiguity) 'benefit' benefit=INT
	 *     time=INT (ambiguity) 'completion' date=STRING
	 *     time=INT (ambiguity) 'cost' cost=INT
	 *     time=INT (ambiguity) 'delay cost' cod=INT
	 *     time=INT (ambiguity) 'time' time=INT
	 *     time=INT (ambiguity) (rule end)
	 *     time=INT (ambiguity) priority=PriorityEnum
	 *     time=INT (ambiguity) rationale=Rationale
	 *     time=INT (ambiguity) ref=Reference
	 *     title=STRING '[' (ambiguity) 'Softgoal' name=ID
	 *     title=STRING '[' (ambiguity) 'benefit' benefit=INT
	 *     title=STRING '[' (ambiguity) 'completion' date=STRING
	 *     title=STRING '[' (ambiguity) 'cost' cost=INT
	 *     title=STRING '[' (ambiguity) 'delay cost' cod=INT
	 *     title=STRING '[' (ambiguity) 'time' time=INT
	 *     title=STRING '[' (ambiguity) (rule end)
	 *     title=STRING '[' (ambiguity) priority=PriorityEnum
	 *     title=STRING '[' (ambiguity) rationale=Rationale
	 *     title=STRING '[' (ambiguity) ref=Reference
	 */
	protected void emit_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('priority' | ']')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Softgoal___PriorityKeyword_1_0_or_RightSquareBracketKeyword_8_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'priority'*)+
	 *
	 * This ambiguous syntax occurs at:
	 *     ref=Reference (ambiguity) 'Softgoal' name=ID
	 *     ref=Reference (ambiguity) 'benefit' benefit=INT
	 *     ref=Reference (ambiguity) 'completion' date=STRING
	 *     ref=Reference (ambiguity) 'cost' cost=INT
	 *     ref=Reference (ambiguity) 'delay cost' cod=INT
	 *     ref=Reference (ambiguity) 'time' time=INT
	 *     ref=Reference (ambiguity) (rule end)
	 *     ref=Reference (ambiguity) priority=PriorityEnum
	 *     ref=Reference (ambiguity) rationale=Rationale
	 *     ref=Reference (ambiguity) ref=Reference
	 */
	protected void emit_Softgoal___RightSquareBracketKeyword_8_1_PriorityKeyword_1_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('priority' | ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Task' name=ID
	 *     (rule start) (ambiguity) 'benefit' benefit=INT
	 *     (rule start) (ambiguity) 'completion' date=STRING
	 *     (rule start) (ambiguity) 'cost' cost=INT
	 *     (rule start) (ambiguity) 'delay cost' cod=INT
	 *     (rule start) (ambiguity) 'time' time=INT
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) priority=PriorityEnum
	 *     benefit=INT (ambiguity) 'Task' name=ID
	 *     benefit=INT (ambiguity) 'benefit' benefit=INT
	 *     benefit=INT (ambiguity) 'completion' date=STRING
	 *     benefit=INT (ambiguity) 'cost' cost=INT
	 *     benefit=INT (ambiguity) 'delay cost' cod=INT
	 *     benefit=INT (ambiguity) 'time' time=INT
	 *     benefit=INT (ambiguity) (rule end)
	 *     benefit=INT (ambiguity) priority=PriorityEnum
	 *     cost=INT (ambiguity) 'Task' name=ID
	 *     cost=INT (ambiguity) 'benefit' benefit=INT
	 *     cost=INT (ambiguity) 'completion' date=STRING
	 *     cost=INT (ambiguity) 'cost' cost=INT
	 *     cost=INT (ambiguity) 'delay cost' cod=INT
	 *     cost=INT (ambiguity) 'time' time=INT
	 *     cost=INT (ambiguity) (rule end)
	 *     cost=INT (ambiguity) priority=PriorityEnum
	 *     date=STRING (ambiguity) 'Task' name=ID
	 *     date=STRING (ambiguity) 'benefit' benefit=INT
	 *     date=STRING (ambiguity) 'completion' date=STRING
	 *     date=STRING (ambiguity) 'cost' cost=INT
	 *     date=STRING (ambiguity) 'delay cost' cod=INT
	 *     date=STRING (ambiguity) 'time' time=INT
	 *     date=STRING (ambiguity) (rule end)
	 *     date=STRING (ambiguity) priority=PriorityEnum
	 *     description=Description (ambiguity) 'Task' name=ID
	 *     description=Description (ambiguity) 'benefit' benefit=INT
	 *     description=Description (ambiguity) 'completion' date=STRING
	 *     description=Description (ambiguity) 'cost' cost=INT
	 *     description=Description (ambiguity) 'delay cost' cod=INT
	 *     description=Description (ambiguity) 'time' time=INT
	 *     description=Description (ambiguity) (rule end)
	 *     description=Description (ambiguity) priority=PriorityEnum
	 *     name=ID '[' (ambiguity) 'Task' name=ID
	 *     name=ID '[' (ambiguity) 'benefit' benefit=INT
	 *     name=ID '[' (ambiguity) 'completion' date=STRING
	 *     name=ID '[' (ambiguity) 'cost' cost=INT
	 *     name=ID '[' (ambiguity) 'delay cost' cod=INT
	 *     name=ID '[' (ambiguity) 'time' time=INT
	 *     name=ID '[' (ambiguity) (rule end)
	 *     name=ID '[' (ambiguity) priority=PriorityEnum
	 *     priority=PriorityEnum (ambiguity) 'Task' name=ID
	 *     priority=PriorityEnum (ambiguity) 'benefit' benefit=INT
	 *     priority=PriorityEnum (ambiguity) 'completion' date=STRING
	 *     priority=PriorityEnum (ambiguity) 'cost' cost=INT
	 *     priority=PriorityEnum (ambiguity) 'delay cost' cod=INT
	 *     priority=PriorityEnum (ambiguity) 'time' time=INT
	 *     priority=PriorityEnum (ambiguity) (rule end)
	 *     priority=PriorityEnum (ambiguity) priority=PriorityEnum
	 *     time=INT (ambiguity) 'Task' name=ID
	 *     time=INT (ambiguity) 'benefit' benefit=INT
	 *     time=INT (ambiguity) 'completion' date=STRING
	 *     time=INT (ambiguity) 'cost' cost=INT
	 *     time=INT (ambiguity) 'delay cost' cod=INT
	 *     time=INT (ambiguity) 'time' time=INT
	 *     time=INT (ambiguity) (rule end)
	 *     time=INT (ambiguity) priority=PriorityEnum
	 *     title=STRING '[' (ambiguity) 'Task' name=ID
	 *     title=STRING '[' (ambiguity) 'benefit' benefit=INT
	 *     title=STRING '[' (ambiguity) 'completion' date=STRING
	 *     title=STRING '[' (ambiguity) 'cost' cost=INT
	 *     title=STRING '[' (ambiguity) 'delay cost' cod=INT
	 *     title=STRING '[' (ambiguity) 'time' time=INT
	 *     title=STRING '[' (ambiguity) (rule end)
	 *     title=STRING '[' (ambiguity) priority=PriorityEnum
	 */
	protected void emit_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('priority' | ']')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Task___PriorityKeyword_1_0_or_RightSquareBracketKeyword_6_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (']' 'priority'*)+
	 *
	 * This ambiguous syntax occurs at:
	 *     cod=INT (ambiguity) 'Task' name=ID
	 *     cod=INT (ambiguity) 'benefit' benefit=INT
	 *     cod=INT (ambiguity) 'completion' date=STRING
	 *     cod=INT (ambiguity) 'cost' cost=INT
	 *     cod=INT (ambiguity) 'delay cost' cod=INT
	 *     cod=INT (ambiguity) 'time' time=INT
	 *     cod=INT (ambiguity) (rule end)
	 *     cod=INT (ambiguity) priority=PriorityEnum
	 */
	protected void emit_Task___RightSquareBracketKeyword_6_1_PriorityKeyword_1_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
