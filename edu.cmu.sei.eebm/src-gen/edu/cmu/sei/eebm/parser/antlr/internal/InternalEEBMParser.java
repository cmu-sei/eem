package edu.cmu.sei.eebm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.cmu.sei.eebm.services.EEBMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEEBMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Roadmap'", "'And'", "'['", "'dest'", "'source'", "','", "']'", "'Or'", "'Conflict'", "'Goal'", "':'", "'priority'", "'time'", "'cost'", "'benefit'", "'completion'", "'delay cost'", "'Softgoal'", "'Task'", "'description'", "'rationale'", "'see document'", "'NA'", "'LOW'", "'MED'", "'HIGH'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEEBMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEEBMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEEBMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEEBM.g"; }



     	private EEBMGrammarAccess grammarAccess;
     	
        public InternalEEBMParser(TokenStream input, EEBMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Roadmap";	
       	}
       	
       	@Override
       	protected EEBMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoadmap"
    // InternalEEBM.g:68:1: entryRuleRoadmap returns [EObject current=null] : iv_ruleRoadmap= ruleRoadmap EOF ;
    public final EObject entryRuleRoadmap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoadmap = null;


        try {
            // InternalEEBM.g:69:2: (iv_ruleRoadmap= ruleRoadmap EOF )
            // InternalEEBM.g:70:2: iv_ruleRoadmap= ruleRoadmap EOF
            {
             newCompositeNode(grammarAccess.getRoadmapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoadmap=ruleRoadmap();

            state._fsp--;

             current =iv_ruleRoadmap; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoadmap"


    // $ANTLR start "ruleRoadmap"
    // InternalEEBM.g:77:1: ruleRoadmap returns [EObject current=null] : ( ( ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING )? ( (lv_components_2_0= ruleIntentionalElement ) )* ( ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) ) )* ) ;
    public final EObject ruleRoadmap() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_STRING_1=null;
        EObject lv_components_2_0 = null;

        EObject lv_relations_3_1 = null;

        EObject lv_relations_3_2 = null;


         enterRule(); 
            
        try {
            // InternalEEBM.g:80:28: ( ( ( ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING )? ( (lv_components_2_0= ruleIntentionalElement ) )* ( ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) ) )* ) )
            // InternalEEBM.g:81:1: ( ( ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING )? ( (lv_components_2_0= ruleIntentionalElement ) )* ( ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) ) )* )
            {
            // InternalEEBM.g:81:1: ( ( ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING )? ( (lv_components_2_0= ruleIntentionalElement ) )* ( ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) ) )* )
            // InternalEEBM.g:81:2: ( ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING )? ( (lv_components_2_0= ruleIntentionalElement ) )* ( ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) ) )*
            {
            // InternalEEBM.g:81:2: ( ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEEBM.g:81:3: ( (lv_name_0_0= 'Roadmap' ) ) this_STRING_1= RULE_STRING
                    {
                    // InternalEEBM.g:81:3: ( (lv_name_0_0= 'Roadmap' ) )
                    // InternalEEBM.g:82:1: (lv_name_0_0= 'Roadmap' )
                    {
                    // InternalEEBM.g:82:1: (lv_name_0_0= 'Roadmap' )
                    // InternalEEBM.g:83:3: lv_name_0_0= 'Roadmap'
                    {
                    lv_name_0_0=(Token)match(input,11,FOLLOW_3); 

                            newLeafNode(lv_name_0_0, grammarAccess.getRoadmapAccess().getNameRoadmapKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoadmapRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "Roadmap");
                    	    

                    }


                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_4); 
                     
                        newLeafNode(this_STRING_1, grammarAccess.getRoadmapAccess().getSTRINGTerminalRuleCall_0_1()); 
                        

                    }
                    break;

            }

            // InternalEEBM.g:100:3: ( (lv_components_2_0= ruleIntentionalElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==20||(LA2_0>=22 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=36)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEEBM.g:101:1: (lv_components_2_0= ruleIntentionalElement )
            	    {
            	    // InternalEEBM.g:101:1: (lv_components_2_0= ruleIntentionalElement )
            	    // InternalEEBM.g:102:3: lv_components_2_0= ruleIntentionalElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoadmapAccess().getComponentsIntentionalElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_components_2_0=ruleIntentionalElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoadmapRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_2_0, 
            	            		"edu.cmu.sei.eebm.EEBM.IntentionalElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalEEBM.g:118:3: ( ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||(LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEEBM.g:119:1: ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) )
            	    {
            	    // InternalEEBM.g:119:1: ( (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict ) )
            	    // InternalEEBM.g:120:1: (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict )
            	    {
            	    // InternalEEBM.g:120:1: (lv_relations_3_1= ruleRefinement | lv_relations_3_2= ruleConflict )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==12||LA3_0==18) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==19) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalEEBM.g:121:3: lv_relations_3_1= ruleRefinement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRoadmapAccess().getRelationsRefinementParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_5);
            	            lv_relations_3_1=ruleRefinement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRoadmapRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"relations",
            	                    		lv_relations_3_1, 
            	                    		"edu.cmu.sei.eebm.EEBM.Refinement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // InternalEEBM.g:136:8: lv_relations_3_2= ruleConflict
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getRoadmapAccess().getRelationsConflictParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_5);
            	            lv_relations_3_2=ruleConflict();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getRoadmapRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"relations",
            	                    		lv_relations_3_2, 
            	                    		"edu.cmu.sei.eebm.EEBM.Conflict");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoadmap"


    // $ANTLR start "entryRuleIntentionalElement"
    // InternalEEBM.g:162:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // InternalEEBM.g:163:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // InternalEEBM.g:164:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntentionalElement"


    // $ANTLR start "ruleIntentionalElement"
    // InternalEEBM.g:171:1: ruleIntentionalElement returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Task_1= ruleTask | this_Softgoal_2= ruleSoftgoal ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Task_1 = null;

        EObject this_Softgoal_2 = null;


         enterRule(); 
            
        try {
            // InternalEEBM.g:174:28: ( (this_Goal_0= ruleGoal | this_Task_1= ruleTask | this_Softgoal_2= ruleSoftgoal ) )
            // InternalEEBM.g:175:1: (this_Goal_0= ruleGoal | this_Task_1= ruleTask | this_Softgoal_2= ruleSoftgoal )
            {
            // InternalEEBM.g:175:1: (this_Goal_0= ruleGoal | this_Task_1= ruleTask | this_Softgoal_2= ruleSoftgoal )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEEBM.g:176:5: this_Goal_0= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Goal_0=ruleGoal();

                    state._fsp--;

                     
                            current = this_Goal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEEBM.g:186:5: this_Task_1= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getTaskParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Task_1=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEEBM.g:196:5: this_Softgoal_2= ruleSoftgoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getSoftgoalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Softgoal_2=ruleSoftgoal();

                    state._fsp--;

                     
                            current = this_Softgoal_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntentionalElement"


    // $ANTLR start "entryRuleRefinement"
    // InternalEEBM.g:212:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalEEBM.g:213:2: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalEEBM.g:214:2: iv_ruleRefinement= ruleRefinement EOF
            {
             newCompositeNode(grammarAccess.getRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;

             current =iv_ruleRefinement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalEEBM.g:221:1: ruleRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement | this_OrRefinement_1= ruleOrRefinement ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AndRefinement_0 = null;

        EObject this_OrRefinement_1 = null;


         enterRule(); 
            
        try {
            // InternalEEBM.g:224:28: ( (this_AndRefinement_0= ruleAndRefinement | this_OrRefinement_1= ruleOrRefinement ) )
            // InternalEEBM.g:225:1: (this_AndRefinement_0= ruleAndRefinement | this_OrRefinement_1= ruleOrRefinement )
            {
            // InternalEEBM.g:225:1: (this_AndRefinement_0= ruleAndRefinement | this_OrRefinement_1= ruleOrRefinement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEEBM.g:226:5: this_AndRefinement_0= ruleAndRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getRefinementAccess().getAndRefinementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AndRefinement_0=ruleAndRefinement();

                    state._fsp--;

                     
                            current = this_AndRefinement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEEBM.g:236:5: this_OrRefinement_1= ruleOrRefinement
                    {
                     
                            newCompositeNode(grammarAccess.getRefinementAccess().getOrRefinementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_OrRefinement_1=ruleOrRefinement();

                    state._fsp--;

                     
                            current = this_OrRefinement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // InternalEEBM.g:252:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEEBM.g:253:2: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEEBM.g:254:2: iv_ruleAndRefinement= ruleAndRefinement EOF
            {
             newCompositeNode(grammarAccess.getAndRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndRefinement=ruleAndRefinement();

            state._fsp--;

             current =iv_ruleAndRefinement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndRefinement"


    // $ANTLR start "ruleAndRefinement"
    // InternalEEBM.g:261:1: ruleAndRefinement returns [EObject current=null] : (otherlv_0= 'And' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // InternalEEBM.g:264:28: ( (otherlv_0= 'And' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' ) )
            // InternalEEBM.g:265:1: (otherlv_0= 'And' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' )
            {
            // InternalEEBM.g:265:1: (otherlv_0= 'And' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' )
            // InternalEEBM.g:265:3: otherlv_0= 'And' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getAndRefinementAccess().getAndKeyword_0());
                
            // InternalEEBM.g:269:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEEBM.g:270:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEEBM.g:270:1: (lv_name_1_0= RULE_ID )
            // InternalEEBM.g:271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAndRefinementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAndRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getAndRefinementAccess().getLeftSquareBracketKeyword_2());
                
            // InternalEEBM.g:291:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) )
            // InternalEEBM.g:293:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalEEBM.g:293:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) )
            // InternalEEBM.g:294:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3());
            	
            // InternalEEBM.g:297:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?)
            // InternalEEBM.g:298:3: ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?
            {
            // InternalEEBM.g:298:3: ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEEBM.g:300:4: ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:300:4: ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    // InternalEEBM.g:301:5: {...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAndRefinement", "getUnorderedGroupHelper().canSelect(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalEEBM.g:301:110: ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    // InternalEEBM.g:302:6: ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // InternalEEBM.g:305:6: ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) )
            	    // InternalEEBM.g:305:7: {...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAndRefinement", "true");
            	    }
            	    // InternalEEBM.g:305:16: (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) )
            	    // InternalEEBM.g:305:18: otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	        	newLeafNode(otherlv_4, grammarAccess.getAndRefinementAccess().getDestKeyword_3_0_0());
            	        
            	    // InternalEEBM.g:309:1: ( (otherlv_5= RULE_ID ) )
            	    // InternalEEBM.g:310:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalEEBM.g:310:1: (otherlv_5= RULE_ID )
            	    // InternalEEBM.g:311:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndRefinementRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    		newLeafNode(otherlv_5, grammarAccess.getAndRefinementAccess().getSourceIntentionalElementCrossReference_3_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEEBM.g:329:4: ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalEEBM.g:329:4: ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) )
            	    // InternalEEBM.g:330:5: {...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAndRefinement", "getUnorderedGroupHelper().canSelect(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalEEBM.g:330:110: ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) )
            	    // InternalEEBM.g:331:6: ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // InternalEEBM.g:334:6: ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) )
            	    // InternalEEBM.g:334:7: {...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAndRefinement", "true");
            	    }
            	    // InternalEEBM.g:334:16: (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            	    // InternalEEBM.g:334:18: otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']'
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	        	newLeafNode(otherlv_6, grammarAccess.getAndRefinementAccess().getSourceKeyword_3_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAndRefinementAccess().getLeftSquareBracketKeyword_3_1_1());
            	        
            	    // InternalEEBM.g:342:1: ( (otherlv_8= RULE_ID ) )
            	    // InternalEEBM.g:343:1: (otherlv_8= RULE_ID )
            	    {
            	    // InternalEEBM.g:343:1: (otherlv_8= RULE_ID )
            	    // InternalEEBM.g:344:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndRefinementRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    		newLeafNode(otherlv_8, grammarAccess.getAndRefinementAccess().getDestIntentionalElementCrossReference_3_1_2_0()); 
            	    	

            	    }


            	    }

            	    // InternalEEBM.g:355:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==16) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalEEBM.g:355:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,16,FOLLOW_6); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getAndRefinementAccess().getCommaKeyword_3_1_3_0());
            	    	        
            	    	    // InternalEEBM.g:359:1: ( (otherlv_10= RULE_ID ) )
            	    	    // InternalEEBM.g:360:1: (otherlv_10= RULE_ID )
            	    	    {
            	    	    // InternalEEBM.g:360:1: (otherlv_10= RULE_ID )
            	    	    // InternalEEBM.g:361:3: otherlv_10= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRefinementRule());
            	    	    	        }
            	    	            
            	    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    		newLeafNode(otherlv_10, grammarAccess.getAndRefinementAccess().getDestIntentionalElementCrossReference_3_1_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,17,FOLLOW_9); 

            	        	newLeafNode(otherlv_11, grammarAccess.getAndRefinementAccess().getRightSquareBracketKeyword_3_1_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleAndRefinement", "getUnorderedGroupHelper().canLeave(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAndRefinementAccess().getUnorderedGroup_3());
            	

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getAndRefinementAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleOrRefinement"
    // InternalEEBM.g:403:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEEBM.g:404:2: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEEBM.g:405:2: iv_ruleOrRefinement= ruleOrRefinement EOF
            {
             newCompositeNode(grammarAccess.getOrRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrRefinement=ruleOrRefinement();

            state._fsp--;

             current =iv_ruleOrRefinement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrRefinement"


    // $ANTLR start "ruleOrRefinement"
    // InternalEEBM.g:412:1: ruleOrRefinement returns [EObject current=null] : (otherlv_0= 'Or' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // InternalEEBM.g:415:28: ( (otherlv_0= 'Or' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' ) )
            // InternalEEBM.g:416:1: (otherlv_0= 'Or' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' )
            {
            // InternalEEBM.g:416:1: (otherlv_0= 'Or' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']' )
            // InternalEEBM.g:416:3: otherlv_0= 'Or' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getOrRefinementAccess().getOrKeyword_0());
                
            // InternalEEBM.g:420:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEEBM.g:421:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEEBM.g:421:1: (lv_name_1_0= RULE_ID )
            // InternalEEBM.g:422:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOrRefinementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrRefinementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getOrRefinementAccess().getLeftSquareBracketKeyword_2());
                
            // InternalEEBM.g:442:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) ) )
            // InternalEEBM.g:444:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalEEBM.g:444:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?) )
            // InternalEEBM.g:445:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3());
            	
            // InternalEEBM.g:448:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?)
            // InternalEEBM.g:449:3: ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+ {...}?
            {
            // InternalEEBM.g:449:3: ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEEBM.g:451:4: ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:451:4: ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    // InternalEEBM.g:452:5: {...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOrRefinement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalEEBM.g:452:109: ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    // InternalEEBM.g:453:6: ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // InternalEEBM.g:456:6: ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) )
            	    // InternalEEBM.g:456:7: {...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOrRefinement", "true");
            	    }
            	    // InternalEEBM.g:456:16: (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) )
            	    // InternalEEBM.g:456:18: otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	        	newLeafNode(otherlv_4, grammarAccess.getOrRefinementAccess().getDestKeyword_3_0_0());
            	        
            	    // InternalEEBM.g:460:1: ( (otherlv_5= RULE_ID ) )
            	    // InternalEEBM.g:461:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalEEBM.g:461:1: (otherlv_5= RULE_ID )
            	    // InternalEEBM.g:462:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrRefinementRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    		newLeafNode(otherlv_5, grammarAccess.getOrRefinementAccess().getSourceIntentionalElementCrossReference_3_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEEBM.g:480:4: ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalEEBM.g:480:4: ({...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) ) )
            	    // InternalEEBM.g:481:5: {...}? => ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOrRefinement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalEEBM.g:481:109: ( ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ) )
            	    // InternalEEBM.g:482:6: ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // InternalEEBM.g:485:6: ({...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) )
            	    // InternalEEBM.g:485:7: {...}? => (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOrRefinement", "true");
            	    }
            	    // InternalEEBM.g:485:16: (otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            	    // InternalEEBM.g:485:18: otherlv_6= 'source' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']'
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	        	newLeafNode(otherlv_6, grammarAccess.getOrRefinementAccess().getSourceKeyword_3_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

            	        	newLeafNode(otherlv_7, grammarAccess.getOrRefinementAccess().getLeftSquareBracketKeyword_3_1_1());
            	        
            	    // InternalEEBM.g:493:1: ( (otherlv_8= RULE_ID ) )
            	    // InternalEEBM.g:494:1: (otherlv_8= RULE_ID )
            	    {
            	    // InternalEEBM.g:494:1: (otherlv_8= RULE_ID )
            	    // InternalEEBM.g:495:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrRefinementRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    		newLeafNode(otherlv_8, grammarAccess.getOrRefinementAccess().getDestIntentionalElementCrossReference_3_1_2_0()); 
            	    	

            	    }


            	    }

            	    // InternalEEBM.g:506:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==16) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalEEBM.g:506:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,16,FOLLOW_6); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getOrRefinementAccess().getCommaKeyword_3_1_3_0());
            	    	        
            	    	    // InternalEEBM.g:510:1: ( (otherlv_10= RULE_ID ) )
            	    	    // InternalEEBM.g:511:1: (otherlv_10= RULE_ID )
            	    	    {
            	    	    // InternalEEBM.g:511:1: (otherlv_10= RULE_ID )
            	    	    // InternalEEBM.g:512:3: otherlv_10= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRefinementRule());
            	    	    	        }
            	    	            
            	    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    		newLeafNode(otherlv_10, grammarAccess.getOrRefinementAccess().getDestIntentionalElementCrossReference_3_1_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,17,FOLLOW_9); 

            	        	newLeafNode(otherlv_11, grammarAccess.getOrRefinementAccess().getRightSquareBracketKeyword_3_1_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleOrRefinement", "getUnorderedGroupHelper().canLeave(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getOrRefinementAccess().getUnorderedGroup_3());
            	

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getOrRefinementAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleConflict"
    // InternalEEBM.g:554:1: entryRuleConflict returns [EObject current=null] : iv_ruleConflict= ruleConflict EOF ;
    public final EObject entryRuleConflict() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflict = null;


        try {
            // InternalEEBM.g:555:2: (iv_ruleConflict= ruleConflict EOF )
            // InternalEEBM.g:556:2: iv_ruleConflict= ruleConflict EOF
            {
             newCompositeNode(grammarAccess.getConflictRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConflict=ruleConflict();

            state._fsp--;

             current =iv_ruleConflict; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConflict"


    // $ANTLR start "ruleConflict"
    // InternalEEBM.g:563:1: ruleConflict returns [EObject current=null] : (otherlv_0= 'Conflict' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' ) ;
    public final EObject ruleConflict() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // InternalEEBM.g:566:28: ( (otherlv_0= 'Conflict' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' ) )
            // InternalEEBM.g:567:1: (otherlv_0= 'Conflict' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' )
            {
            // InternalEEBM.g:567:1: (otherlv_0= 'Conflict' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' )
            // InternalEEBM.g:567:3: otherlv_0= 'Conflict' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getConflictAccess().getConflictKeyword_0());
                
            // InternalEEBM.g:571:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalEEBM.g:572:1: (lv_name_1_0= RULE_ID )
            {
            // InternalEEBM.g:572:1: (lv_name_1_0= RULE_ID )
            // InternalEEBM.g:573:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConflictAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConflictRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getConflictAccess().getLeftSquareBracketKeyword_2());
                
            // InternalEEBM.g:593:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) ) )
            // InternalEEBM.g:595:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalEEBM.g:595:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            // InternalEEBM.g:596:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getConflictAccess().getUnorderedGroup_3());
            	
            // InternalEEBM.g:599:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?)
            // InternalEEBM.g:600:3: ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+ {...}?
            {
            // InternalEEBM.g:600:3: ( ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEEBM.g:602:4: ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:602:4: ({...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) ) )
            	    // InternalEEBM.g:603:5: {...}? => ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConflict", "getUnorderedGroupHelper().canSelect(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalEEBM.g:603:105: ( ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) ) )
            	    // InternalEEBM.g:604:6: ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // InternalEEBM.g:607:6: ({...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) ) )
            	    // InternalEEBM.g:607:7: {...}? => (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConflict", "true");
            	    }
            	    // InternalEEBM.g:607:16: (otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) ) )
            	    // InternalEEBM.g:607:18: otherlv_4= 'dest' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	        	newLeafNode(otherlv_4, grammarAccess.getConflictAccess().getDestKeyword_3_0_0());
            	        
            	    // InternalEEBM.g:611:1: ( (otherlv_5= RULE_ID ) )
            	    // InternalEEBM.g:612:1: (otherlv_5= RULE_ID )
            	    {
            	    // InternalEEBM.g:612:1: (otherlv_5= RULE_ID )
            	    // InternalEEBM.g:613:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConflictRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    		newLeafNode(otherlv_5, grammarAccess.getConflictAccess().getSourceIntentionalElementCrossReference_3_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConflictAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEEBM.g:631:4: ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:631:4: ({...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    // InternalEEBM.g:632:5: {...}? => ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConflict", "getUnorderedGroupHelper().canSelect(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalEEBM.g:632:105: ( ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    // InternalEEBM.g:633:6: ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConflictAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // InternalEEBM.g:636:6: ({...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) ) )
            	    // InternalEEBM.g:636:7: {...}? => (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConflict", "true");
            	    }
            	    // InternalEEBM.g:636:16: (otherlv_6= 'source' ( (otherlv_7= RULE_ID ) ) )
            	    // InternalEEBM.g:636:18: otherlv_6= 'source' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	        	newLeafNode(otherlv_6, grammarAccess.getConflictAccess().getSourceKeyword_3_1_0());
            	        
            	    // InternalEEBM.g:640:1: ( (otherlv_7= RULE_ID ) )
            	    // InternalEEBM.g:641:1: (otherlv_7= RULE_ID )
            	    {
            	    // InternalEEBM.g:641:1: (otherlv_7= RULE_ID )
            	    // InternalEEBM.g:642:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConflictRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    		newLeafNode(otherlv_7, grammarAccess.getConflictAccess().getDestIntentionalElementCrossReference_3_1_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConflictAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConflictAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleConflict", "getUnorderedGroupHelper().canLeave(grammarAccess.getConflictAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getConflictAccess().getUnorderedGroup_3());
            	

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getConflictAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConflict"


    // $ANTLR start "entryRuleGoal"
    // InternalEEBM.g:680:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalEEBM.g:681:2: (iv_ruleGoal= ruleGoal EOF )
            // InternalEEBM.g:682:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalEEBM.g:689:1: ruleGoal returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_time_11_0=null;
        Token otherlv_12=null;
        Token lv_cost_13_0=null;
        Token otherlv_14=null;
        Token lv_benefit_15_0=null;
        Token otherlv_16=null;
        Token lv_date_17_0=null;
        Token otherlv_18=null;
        Token lv_cod_19_0=null;
        Token otherlv_22=null;
        EObject lv_description_6_0 = null;

        Enumerator lv_priority_9_0 = null;

        EObject lv_rationale_20_0 = null;

        EObject lv_ref_21_0 = null;


         enterRule(); 
            
        try {
            // InternalEEBM.g:692:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalEEBM.g:693:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalEEBM.g:693:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) )
            // InternalEEBM.g:695:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalEEBM.g:695:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) )
            // InternalEEBM.g:696:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup());
            	
            // InternalEEBM.g:699:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?)
            // InternalEEBM.g:700:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?
            {
            // InternalEEBM.g:700:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=10;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalEEBM.g:702:4: ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) )
            	    {
            	    // InternalEEBM.g:702:4: ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) )
            	    // InternalEEBM.g:703:5: {...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEEBM.g:703:99: ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) )
            	    // InternalEEBM.g:704:6: ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // InternalEEBM.g:707:6: ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) )
            	    // InternalEEBM.g:707:7: {...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:707:16: (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? )
            	    // InternalEEBM.g:707:18: otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )?
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_6); 

            	        	newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getGoalKeyword_0_0());
            	        
            	    // InternalEEBM.g:711:1: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalEEBM.g:712:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalEEBM.g:712:1: (lv_name_2_0= RULE_ID )
            	    // InternalEEBM.g:713:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"org.eclipse.xtext.common.Terminals.ID");
            	    	    

            	    }


            	    }

            	    // InternalEEBM.g:729:2: (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==21) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalEEBM.g:729:4: otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            	                	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getColonKeyword_0_2_0());
            	                
            	            // InternalEEBM.g:733:1: ( (lv_title_4_0= RULE_STRING ) )
            	            // InternalEEBM.g:734:1: (lv_title_4_0= RULE_STRING )
            	            {
            	            // InternalEEBM.g:734:1: (lv_title_4_0= RULE_STRING )
            	            // InternalEEBM.g:735:3: lv_title_4_0= RULE_STRING
            	            {
            	            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            			newLeafNode(lv_title_4_0, grammarAccess.getGoalAccess().getTitleSTRINGTerminalRuleCall_0_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getGoalRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"title",
            	                    		lv_title_4_0, 
            	                    		"org.eclipse.xtext.common.Terminals.STRING");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_12); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getLeftSquareBracketKeyword_0_3());
            	        
            	    // InternalEEBM.g:755:1: ( (lv_description_6_0= ruleDescription ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==30) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalEEBM.g:756:1: (lv_description_6_0= ruleDescription )
            	            {
            	            // InternalEEBM.g:756:1: (lv_description_6_0= ruleDescription )
            	            // InternalEEBM.g:757:3: lv_description_6_0= ruleDescription
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGoalAccess().getDescriptionDescriptionParserRuleCall_0_4_0()); 
            	            	    
            	            pushFollow(FOLLOW_13);
            	            lv_description_6_0=ruleDescription();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"edu.cmu.sei.eebm.EEBM.Description");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEEBM.g:780:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:780:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalEEBM.g:781:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEEBM.g:781:99: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalEEBM.g:782:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // InternalEEBM.g:785:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) )
            	    // InternalEEBM.g:785:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:785:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) )
            	    // InternalEEBM.g:787:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalEEBM.g:787:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) )
            	    // InternalEEBM.g:788:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_1());
            	    	
            	    // InternalEEBM.g:791:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?)
            	    // InternalEEBM.g:792:3: ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?
            	    {
            	    // InternalEEBM.g:792:3: ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=3;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            int LA14_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 0) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA14_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt14=2;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA14_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt14=2;
            	            }


            	            }
            	            break;
            	        case 35:
            	            {
            	            int LA14_5 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt14=2;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA14_6 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt14=2;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalEEBM.g:794:4: ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) )
            	    	    {
            	    	    // InternalEEBM.g:794:4: ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) )
            	    	    // InternalEEBM.g:795:5: {...}? => ( ({...}? => (otherlv_8= 'priority' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 0)");
            	    	    }
            	    	    // InternalEEBM.g:795:101: ( ({...}? => (otherlv_8= 'priority' ) ) )
            	    	    // InternalEEBM.g:796:6: ({...}? => (otherlv_8= 'priority' ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 0);
            	    	    	 				
            	    	    // InternalEEBM.g:799:6: ({...}? => (otherlv_8= 'priority' ) )
            	    	    // InternalEEBM.g:799:7: {...}? => (otherlv_8= 'priority' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // InternalEEBM.g:799:16: (otherlv_8= 'priority' )
            	    	    // InternalEEBM.g:799:18: otherlv_8= 'priority'
            	    	    {
            	    	    otherlv_8=(Token)match(input,22,FOLLOW_13); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getPriorityKeyword_1_0());
            	    	        

            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalEEBM.g:810:4: ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) )
            	    	    {
            	    	    // InternalEEBM.g:810:4: ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) )
            	    	    // InternalEEBM.g:811:5: {...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1)");
            	    	    }
            	    	    // InternalEEBM.g:811:101: ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) )
            	    	    // InternalEEBM.g:812:6: ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_1(), 1);
            	    	    	 				
            	    	    // InternalEEBM.g:815:6: ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) )
            	    	    // InternalEEBM.g:815:7: {...}? => ( (lv_priority_9_0= rulePriorityEnum ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // InternalEEBM.g:815:16: ( (lv_priority_9_0= rulePriorityEnum ) )
            	    	    // InternalEEBM.g:816:1: (lv_priority_9_0= rulePriorityEnum )
            	    	    {
            	    	    // InternalEEBM.g:816:1: (lv_priority_9_0= rulePriorityEnum )
            	    	    // InternalEEBM.g:817:3: lv_priority_9_0= rulePriorityEnum
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getPriorityPriorityEnumEnumRuleCall_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_priority_9_0=rulePriorityEnum();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	    	        }
            	    	           		set(
            	    	           			current, 
            	    	           			"priority",
            	    	            		lv_priority_9_0, 
            	    	            		"edu.cmu.sei.eebm.EEBM.PriorityEnum");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup_1()) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup_1())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_1());
            	    	

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEEBM.g:855:4: ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:855:4: ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:856:5: {...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEEBM.g:856:99: ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:857:6: ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // InternalEEBM.g:860:6: ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:860:7: {...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:860:16: (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) )
            	    // InternalEEBM.g:860:18: otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_14); 

            	        	newLeafNode(otherlv_10, grammarAccess.getGoalAccess().getTimeKeyword_2_0());
            	        
            	    // InternalEEBM.g:864:1: ( (lv_time_11_0= RULE_INT ) )
            	    // InternalEEBM.g:865:1: (lv_time_11_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:865:1: (lv_time_11_0= RULE_INT )
            	    // InternalEEBM.g:866:3: lv_time_11_0= RULE_INT
            	    {
            	    lv_time_11_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_time_11_0, grammarAccess.getGoalAccess().getTimeINTTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"time",
            	            		lv_time_11_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEEBM.g:889:4: ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:889:4: ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:890:5: {...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalEEBM.g:890:99: ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:891:6: ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // InternalEEBM.g:894:6: ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:894:7: {...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:894:16: (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) )
            	    // InternalEEBM.g:894:18: otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getCostKeyword_3_0());
            	        
            	    // InternalEEBM.g:898:1: ( (lv_cost_13_0= RULE_INT ) )
            	    // InternalEEBM.g:899:1: (lv_cost_13_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:899:1: (lv_cost_13_0= RULE_INT )
            	    // InternalEEBM.g:900:3: lv_cost_13_0= RULE_INT
            	    {
            	    lv_cost_13_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_cost_13_0, grammarAccess.getGoalAccess().getCostINTTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cost",
            	            		lv_cost_13_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEEBM.g:923:4: ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:923:4: ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:924:5: {...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalEEBM.g:924:99: ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:925:6: ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // InternalEEBM.g:928:6: ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:928:7: {...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:928:16: (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) )
            	    // InternalEEBM.g:928:18: otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) )
            	    {
            	    otherlv_14=(Token)match(input,25,FOLLOW_14); 

            	        	newLeafNode(otherlv_14, grammarAccess.getGoalAccess().getBenefitKeyword_4_0());
            	        
            	    // InternalEEBM.g:932:1: ( (lv_benefit_15_0= RULE_INT ) )
            	    // InternalEEBM.g:933:1: (lv_benefit_15_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:933:1: (lv_benefit_15_0= RULE_INT )
            	    // InternalEEBM.g:934:3: lv_benefit_15_0= RULE_INT
            	    {
            	    lv_benefit_15_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_benefit_15_0, grammarAccess.getGoalAccess().getBenefitINTTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"benefit",
            	            		lv_benefit_15_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEEBM.g:957:4: ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:957:4: ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) )
            	    // InternalEEBM.g:958:5: {...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalEEBM.g:958:99: ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) )
            	    // InternalEEBM.g:959:6: ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // InternalEEBM.g:962:6: ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) )
            	    // InternalEEBM.g:962:7: {...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:962:16: (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) )
            	    // InternalEEBM.g:962:18: otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,26,FOLLOW_3); 

            	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getCompletionKeyword_5_0());
            	        
            	    // InternalEEBM.g:966:1: ( (lv_date_17_0= RULE_STRING ) )
            	    // InternalEEBM.g:967:1: (lv_date_17_0= RULE_STRING )
            	    {
            	    // InternalEEBM.g:967:1: (lv_date_17_0= RULE_STRING )
            	    // InternalEEBM.g:968:3: lv_date_17_0= RULE_STRING
            	    {
            	    lv_date_17_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_date_17_0, grammarAccess.getGoalAccess().getDateSTRINGTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"date",
            	            		lv_date_17_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalEEBM.g:991:4: ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:991:4: ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:992:5: {...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalEEBM.g:992:99: ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:993:6: ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // InternalEEBM.g:996:6: ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:996:7: {...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:996:16: (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )
            	    // InternalEEBM.g:996:18: otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) )
            	    {
            	    otherlv_18=(Token)match(input,27,FOLLOW_14); 

            	        	newLeafNode(otherlv_18, grammarAccess.getGoalAccess().getDelayCostKeyword_6_0());
            	        
            	    // InternalEEBM.g:1000:1: ( (lv_cod_19_0= RULE_INT ) )
            	    // InternalEEBM.g:1001:1: (lv_cod_19_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1001:1: (lv_cod_19_0= RULE_INT )
            	    // InternalEEBM.g:1002:3: lv_cod_19_0= RULE_INT
            	    {
            	    lv_cod_19_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_cod_19_0, grammarAccess.getGoalAccess().getCodINTTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cod",
            	            		lv_cod_19_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalEEBM.g:1025:4: ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1025:4: ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) )
            	    // InternalEEBM.g:1026:5: {...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalEEBM.g:1026:99: ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) )
            	    // InternalEEBM.g:1027:6: ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 7);
            	    	 				
            	    // InternalEEBM.g:1030:6: ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) )
            	    // InternalEEBM.g:1030:7: {...}? => ( (lv_rationale_20_0= ruleRationale ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:1030:16: ( (lv_rationale_20_0= ruleRationale ) )
            	    // InternalEEBM.g:1031:1: (lv_rationale_20_0= ruleRationale )
            	    {
            	    // InternalEEBM.g:1031:1: (lv_rationale_20_0= ruleRationale )
            	    // InternalEEBM.g:1032:3: lv_rationale_20_0= ruleRationale
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRationaleRationaleParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_rationale_20_0=ruleRationale();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rationale",
            	            		lv_rationale_20_0, 
            	            		"edu.cmu.sei.eebm.EEBM.Rationale");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalEEBM.g:1055:4: ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) )
            	    {
            	    // InternalEEBM.g:1055:4: ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) )
            	    // InternalEEBM.g:1056:5: {...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalEEBM.g:1056:99: ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) )
            	    // InternalEEBM.g:1057:6: ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup(), 8);
            	    	 				
            	    // InternalEEBM.g:1060:6: ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) )
            	    // InternalEEBM.g:1060:7: {...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // InternalEEBM.g:1060:16: ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' )
            	    // InternalEEBM.g:1060:17: ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']'
            	    {
            	    // InternalEEBM.g:1060:17: ( (lv_ref_21_0= ruleReference ) )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==32) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalEEBM.g:1061:1: (lv_ref_21_0= ruleReference )
            	            {
            	            // InternalEEBM.g:1061:1: (lv_ref_21_0= ruleReference )
            	            // InternalEEBM.g:1062:3: lv_ref_21_0= ruleReference
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGoalAccess().getRefReferenceParserRuleCall_8_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_15);
            	            lv_ref_21_0=ruleReference();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"ref",
            	                    		lv_ref_21_0, 
            	                    		"edu.cmu.sei.eebm.EEBM.Reference");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,17,FOLLOW_13); 

            	        	newLeafNode(otherlv_22, grammarAccess.getGoalAccess().getRightSquareBracketKeyword_8_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleSoftgoal"
    // InternalEEBM.g:1105:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // InternalEEBM.g:1106:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // InternalEEBM.g:1107:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoftgoal"


    // $ANTLR start "ruleSoftgoal"
    // InternalEEBM.g:1114:1: ruleSoftgoal returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_time_11_0=null;
        Token otherlv_12=null;
        Token lv_cost_13_0=null;
        Token otherlv_14=null;
        Token lv_benefit_15_0=null;
        Token otherlv_16=null;
        Token lv_date_17_0=null;
        Token otherlv_18=null;
        Token lv_cod_19_0=null;
        Token otherlv_22=null;
        EObject lv_description_6_0 = null;

        Enumerator lv_priority_9_0 = null;

        EObject lv_rationale_20_0 = null;

        EObject lv_ref_21_0 = null;


         enterRule(); 
            
        try {
            // InternalEEBM.g:1117:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalEEBM.g:1118:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalEEBM.g:1118:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) ) )
            // InternalEEBM.g:1120:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalEEBM.g:1120:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?) )
            // InternalEEBM.g:1121:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	
            // InternalEEBM.g:1124:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?)
            // InternalEEBM.g:1125:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+ {...}?
            {
            // InternalEEBM.g:1125:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=10;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // InternalEEBM.g:1127:4: ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) )
            	    {
            	    // InternalEEBM.g:1127:4: ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) )
            	    // InternalEEBM.g:1128:5: {...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEEBM.g:1128:103: ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) )
            	    // InternalEEBM.g:1129:6: ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // InternalEEBM.g:1132:6: ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) )
            	    // InternalEEBM.g:1132:7: {...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1132:16: (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? )
            	    // InternalEEBM.g:1132:18: otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )?
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_6); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSoftgoalAccess().getSoftgoalKeyword_0_0());
            	        
            	    // InternalEEBM.g:1136:1: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalEEBM.g:1137:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalEEBM.g:1137:1: (lv_name_2_0= RULE_ID )
            	    // InternalEEBM.g:1138:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"org.eclipse.xtext.common.Terminals.ID");
            	    	    

            	    }


            	    }

            	    // InternalEEBM.g:1154:2: (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==21) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalEEBM.g:1154:4: otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            	                	newLeafNode(otherlv_3, grammarAccess.getSoftgoalAccess().getColonKeyword_0_2_0());
            	                
            	            // InternalEEBM.g:1158:1: ( (lv_title_4_0= RULE_STRING ) )
            	            // InternalEEBM.g:1159:1: (lv_title_4_0= RULE_STRING )
            	            {
            	            // InternalEEBM.g:1159:1: (lv_title_4_0= RULE_STRING )
            	            // InternalEEBM.g:1160:3: lv_title_4_0= RULE_STRING
            	            {
            	            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            			newLeafNode(lv_title_4_0, grammarAccess.getSoftgoalAccess().getTitleSTRINGTerminalRuleCall_0_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"title",
            	                    		lv_title_4_0, 
            	                    		"org.eclipse.xtext.common.Terminals.STRING");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_16); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getLeftSquareBracketKeyword_0_3());
            	        
            	    // InternalEEBM.g:1180:1: ( (lv_description_6_0= ruleDescription ) )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==30) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalEEBM.g:1181:1: (lv_description_6_0= ruleDescription )
            	            {
            	            // InternalEEBM.g:1181:1: (lv_description_6_0= ruleDescription )
            	            // InternalEEBM.g:1182:3: lv_description_6_0= ruleDescription
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDescriptionDescriptionParserRuleCall_0_4_0()); 
            	            	    
            	            pushFollow(FOLLOW_17);
            	            lv_description_6_0=ruleDescription();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"edu.cmu.sei.eebm.EEBM.Description");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEEBM.g:1205:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1205:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalEEBM.g:1206:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEEBM.g:1206:103: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalEEBM.g:1207:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // InternalEEBM.g:1210:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) )
            	    // InternalEEBM.g:1210:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1210:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) )
            	    // InternalEEBM.g:1212:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalEEBM.g:1212:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) )
            	    // InternalEEBM.g:1213:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1());
            	    	
            	    // InternalEEBM.g:1216:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?)
            	    // InternalEEBM.g:1217:3: ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?
            	    {
            	    // InternalEEBM.g:1217:3: ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=3;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            int LA19_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 0) ) {
            	                alt19=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA19_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt19=2;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA19_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt19=2;
            	            }


            	            }
            	            break;
            	        case 35:
            	            {
            	            int LA19_5 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt19=2;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA19_6 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1) ) {
            	                alt19=2;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalEEBM.g:1219:4: ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) )
            	    	    {
            	    	    // InternalEEBM.g:1219:4: ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) )
            	    	    // InternalEEBM.g:1220:5: {...}? => ( ({...}? => (otherlv_8= 'priority' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 0)");
            	    	    }
            	    	    // InternalEEBM.g:1220:105: ( ({...}? => (otherlv_8= 'priority' ) ) )
            	    	    // InternalEEBM.g:1221:6: ({...}? => (otherlv_8= 'priority' ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 0);
            	    	    	 				
            	    	    // InternalEEBM.g:1224:6: ({...}? => (otherlv_8= 'priority' ) )
            	    	    // InternalEEBM.g:1224:7: {...}? => (otherlv_8= 'priority' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // InternalEEBM.g:1224:16: (otherlv_8= 'priority' )
            	    	    // InternalEEBM.g:1224:18: otherlv_8= 'priority'
            	    	    {
            	    	    otherlv_8=(Token)match(input,22,FOLLOW_17); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getPriorityKeyword_1_0());
            	    	        

            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalEEBM.g:1235:4: ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) )
            	    	    {
            	    	    // InternalEEBM.g:1235:4: ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) )
            	    	    // InternalEEBM.g:1236:5: {...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1)");
            	    	    }
            	    	    // InternalEEBM.g:1236:105: ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) )
            	    	    // InternalEEBM.g:1237:6: ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1(), 1);
            	    	    	 				
            	    	    // InternalEEBM.g:1240:6: ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) )
            	    	    // InternalEEBM.g:1240:7: {...}? => ( (lv_priority_9_0= rulePriorityEnum ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // InternalEEBM.g:1240:16: ( (lv_priority_9_0= rulePriorityEnum ) )
            	    	    // InternalEEBM.g:1241:1: (lv_priority_9_0= rulePriorityEnum )
            	    	    {
            	    	    // InternalEEBM.g:1241:1: (lv_priority_9_0= rulePriorityEnum )
            	    	    // InternalEEBM.g:1242:3: lv_priority_9_0= rulePriorityEnum
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getPriorityPriorityEnumEnumRuleCall_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_priority_9_0=rulePriorityEnum();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	    	        }
            	    	           		set(
            	    	           			current, 
            	    	           			"priority",
            	    	            		lv_priority_9_0, 
            	    	            		"edu.cmu.sei.eebm.EEBM.PriorityEnum");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1()) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_1());
            	    	

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEEBM.g:1280:4: ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1280:4: ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1281:5: {...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEEBM.g:1281:103: ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1282:6: ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // InternalEEBM.g:1285:6: ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1285:7: {...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1285:16: (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1285:18: otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_14); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSoftgoalAccess().getTimeKeyword_2_0());
            	        
            	    // InternalEEBM.g:1289:1: ( (lv_time_11_0= RULE_INT ) )
            	    // InternalEEBM.g:1290:1: (lv_time_11_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1290:1: (lv_time_11_0= RULE_INT )
            	    // InternalEEBM.g:1291:3: lv_time_11_0= RULE_INT
            	    {
            	    lv_time_11_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    			newLeafNode(lv_time_11_0, grammarAccess.getSoftgoalAccess().getTimeINTTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"time",
            	            		lv_time_11_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEEBM.g:1314:4: ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1314:4: ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1315:5: {...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalEEBM.g:1315:103: ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1316:6: ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // InternalEEBM.g:1319:6: ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1319:7: {...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1319:16: (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1319:18: otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getCostKeyword_3_0());
            	        
            	    // InternalEEBM.g:1323:1: ( (lv_cost_13_0= RULE_INT ) )
            	    // InternalEEBM.g:1324:1: (lv_cost_13_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1324:1: (lv_cost_13_0= RULE_INT )
            	    // InternalEEBM.g:1325:3: lv_cost_13_0= RULE_INT
            	    {
            	    lv_cost_13_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    			newLeafNode(lv_cost_13_0, grammarAccess.getSoftgoalAccess().getCostINTTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cost",
            	            		lv_cost_13_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEEBM.g:1348:4: ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1348:4: ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1349:5: {...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalEEBM.g:1349:103: ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1350:6: ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // InternalEEBM.g:1353:6: ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1353:7: {...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1353:16: (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1353:18: otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) )
            	    {
            	    otherlv_14=(Token)match(input,25,FOLLOW_14); 

            	        	newLeafNode(otherlv_14, grammarAccess.getSoftgoalAccess().getBenefitKeyword_4_0());
            	        
            	    // InternalEEBM.g:1357:1: ( (lv_benefit_15_0= RULE_INT ) )
            	    // InternalEEBM.g:1358:1: (lv_benefit_15_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1358:1: (lv_benefit_15_0= RULE_INT )
            	    // InternalEEBM.g:1359:3: lv_benefit_15_0= RULE_INT
            	    {
            	    lv_benefit_15_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    			newLeafNode(lv_benefit_15_0, grammarAccess.getSoftgoalAccess().getBenefitINTTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"benefit",
            	            		lv_benefit_15_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEEBM.g:1382:4: ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1382:4: ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) )
            	    // InternalEEBM.g:1383:5: {...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalEEBM.g:1383:103: ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) )
            	    // InternalEEBM.g:1384:6: ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // InternalEEBM.g:1387:6: ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) )
            	    // InternalEEBM.g:1387:7: {...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1387:16: (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) )
            	    // InternalEEBM.g:1387:18: otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,26,FOLLOW_3); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getCompletionKeyword_5_0());
            	        
            	    // InternalEEBM.g:1391:1: ( (lv_date_17_0= RULE_STRING ) )
            	    // InternalEEBM.g:1392:1: (lv_date_17_0= RULE_STRING )
            	    {
            	    // InternalEEBM.g:1392:1: (lv_date_17_0= RULE_STRING )
            	    // InternalEEBM.g:1393:3: lv_date_17_0= RULE_STRING
            	    {
            	    lv_date_17_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    			newLeafNode(lv_date_17_0, grammarAccess.getSoftgoalAccess().getDateSTRINGTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"date",
            	            		lv_date_17_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalEEBM.g:1416:4: ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1416:4: ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1417:5: {...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalEEBM.g:1417:103: ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1418:6: ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // InternalEEBM.g:1421:6: ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1421:7: {...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1421:16: (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1421:18: otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) )
            	    {
            	    otherlv_18=(Token)match(input,27,FOLLOW_14); 

            	        	newLeafNode(otherlv_18, grammarAccess.getSoftgoalAccess().getDelayCostKeyword_6_0());
            	        
            	    // InternalEEBM.g:1425:1: ( (lv_cod_19_0= RULE_INT ) )
            	    // InternalEEBM.g:1426:1: (lv_cod_19_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1426:1: (lv_cod_19_0= RULE_INT )
            	    // InternalEEBM.g:1427:3: lv_cod_19_0= RULE_INT
            	    {
            	    lv_cod_19_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    			newLeafNode(lv_cod_19_0, grammarAccess.getSoftgoalAccess().getCodINTTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cod",
            	            		lv_cod_19_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalEEBM.g:1450:4: ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1450:4: ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) )
            	    // InternalEEBM.g:1451:5: {...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalEEBM.g:1451:103: ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) )
            	    // InternalEEBM.g:1452:6: ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 7);
            	    	 				
            	    // InternalEEBM.g:1455:6: ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) )
            	    // InternalEEBM.g:1455:7: {...}? => ( (lv_rationale_20_0= ruleRationale ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1455:16: ( (lv_rationale_20_0= ruleRationale ) )
            	    // InternalEEBM.g:1456:1: (lv_rationale_20_0= ruleRationale )
            	    {
            	    // InternalEEBM.g:1456:1: (lv_rationale_20_0= ruleRationale )
            	    // InternalEEBM.g:1457:3: lv_rationale_20_0= ruleRationale
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getRationaleRationaleParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_rationale_20_0=ruleRationale();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rationale",
            	            		lv_rationale_20_0, 
            	            		"edu.cmu.sei.eebm.EEBM.Rationale");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalEEBM.g:1480:4: ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) )
            	    {
            	    // InternalEEBM.g:1480:4: ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) )
            	    // InternalEEBM.g:1481:5: {...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalEEBM.g:1481:103: ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) )
            	    // InternalEEBM.g:1482:6: ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 8);
            	    	 				
            	    // InternalEEBM.g:1485:6: ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) )
            	    // InternalEEBM.g:1485:7: {...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // InternalEEBM.g:1485:16: ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' )
            	    // InternalEEBM.g:1485:17: ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']'
            	    {
            	    // InternalEEBM.g:1485:17: ( (lv_ref_21_0= ruleReference ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==32) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalEEBM.g:1486:1: (lv_ref_21_0= ruleReference )
            	            {
            	            // InternalEEBM.g:1486:1: (lv_ref_21_0= ruleReference )
            	            // InternalEEBM.g:1487:3: lv_ref_21_0= ruleReference
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getRefReferenceParserRuleCall_8_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_15);
            	            lv_ref_21_0=ruleReference();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"ref",
            	                    		lv_ref_21_0, 
            	                    		"edu.cmu.sei.eebm.EEBM.Reference");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,17,FOLLOW_17); 

            	        	newLeafNode(otherlv_22, grammarAccess.getSoftgoalAccess().getRightSquareBracketKeyword_8_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSoftgoal"


    // $ANTLR start "entryRuleTask"
    // InternalEEBM.g:1530:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalEEBM.g:1531:2: (iv_ruleTask= ruleTask EOF )
            // InternalEEBM.g:1532:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalEEBM.g:1539:1: ruleTask returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_time_11_0=null;
        Token otherlv_12=null;
        Token lv_cost_13_0=null;
        Token otherlv_14=null;
        Token lv_benefit_15_0=null;
        Token otherlv_16=null;
        Token lv_date_17_0=null;
        Token otherlv_18=null;
        Token lv_cod_19_0=null;
        Token otherlv_20=null;
        EObject lv_description_6_0 = null;

        Enumerator lv_priority_9_0 = null;


         enterRule(); 
            
        try {
            // InternalEEBM.g:1542:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalEEBM.g:1543:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalEEBM.g:1543:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?) ) )
            // InternalEEBM.g:1545:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalEEBM.g:1545:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?) )
            // InternalEEBM.g:1546:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup());
            	
            // InternalEEBM.g:1549:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?)
            // InternalEEBM.g:1550:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+ {...}?
            {
            // InternalEEBM.g:1550:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=8;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalEEBM.g:1552:4: ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) )
            	    {
            	    // InternalEEBM.g:1552:4: ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) )
            	    // InternalEEBM.g:1553:5: {...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEEBM.g:1553:99: ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) )
            	    // InternalEEBM.g:1554:6: ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // InternalEEBM.g:1557:6: ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) )
            	    // InternalEEBM.g:1557:7: {...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1557:16: (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? )
            	    // InternalEEBM.g:1557:18: otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )?
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_6); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getTaskKeyword_0_0());
            	        
            	    // InternalEEBM.g:1561:1: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalEEBM.g:1562:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalEEBM.g:1562:1: (lv_name_2_0= RULE_ID )
            	    // InternalEEBM.g:1563:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"org.eclipse.xtext.common.Terminals.ID");
            	    	    

            	    }


            	    }

            	    // InternalEEBM.g:1579:2: (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==21) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalEEBM.g:1579:4: otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            	                	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getColonKeyword_0_2_0());
            	                
            	            // InternalEEBM.g:1583:1: ( (lv_title_4_0= RULE_STRING ) )
            	            // InternalEEBM.g:1584:1: (lv_title_4_0= RULE_STRING )
            	            {
            	            // InternalEEBM.g:1584:1: (lv_title_4_0= RULE_STRING )
            	            // InternalEEBM.g:1585:3: lv_title_4_0= RULE_STRING
            	            {
            	            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            			newLeafNode(lv_title_4_0, grammarAccess.getTaskAccess().getTitleSTRINGTerminalRuleCall_0_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTaskRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"title",
            	                    		lv_title_4_0, 
            	                    		"org.eclipse.xtext.common.Terminals.STRING");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_18); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_0_3());
            	        
            	    // InternalEEBM.g:1605:1: ( (lv_description_6_0= ruleDescription ) )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==30) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalEEBM.g:1606:1: (lv_description_6_0= ruleDescription )
            	            {
            	            // InternalEEBM.g:1606:1: (lv_description_6_0= ruleDescription )
            	            // InternalEEBM.g:1607:3: lv_description_6_0= ruleDescription
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTaskAccess().getDescriptionDescriptionParserRuleCall_0_4_0()); 
            	            	    
            	            pushFollow(FOLLOW_19);
            	            lv_description_6_0=ruleDescription();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"edu.cmu.sei.eebm.EEBM.Description");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEEBM.g:1630:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1630:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalEEBM.g:1631:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEEBM.g:1631:99: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalEEBM.g:1632:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // InternalEEBM.g:1635:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) )
            	    // InternalEEBM.g:1635:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1635:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) )
            	    // InternalEEBM.g:1637:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalEEBM.g:1637:1: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) )
            	    // InternalEEBM.g:1638:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_1());
            	    	
            	    // InternalEEBM.g:1641:2: ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?)
            	    // InternalEEBM.g:1642:3: ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?
            	    {
            	    // InternalEEBM.g:1642:3: ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=3;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            int LA24_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 0) ) {
            	                alt24=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA24_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1) ) {
            	                alt24=2;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA24_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1) ) {
            	                alt24=2;
            	            }


            	            }
            	            break;
            	        case 35:
            	            {
            	            int LA24_5 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1) ) {
            	                alt24=2;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA24_6 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1) ) {
            	                alt24=2;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalEEBM.g:1644:4: ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) )
            	    	    {
            	    	    // InternalEEBM.g:1644:4: ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) )
            	    	    // InternalEEBM.g:1645:5: {...}? => ( ({...}? => (otherlv_8= 'priority' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 0)");
            	    	    }
            	    	    // InternalEEBM.g:1645:101: ( ({...}? => (otherlv_8= 'priority' ) ) )
            	    	    // InternalEEBM.g:1646:6: ({...}? => (otherlv_8= 'priority' ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 0);
            	    	    	 				
            	    	    // InternalEEBM.g:1649:6: ({...}? => (otherlv_8= 'priority' ) )
            	    	    // InternalEEBM.g:1649:7: {...}? => (otherlv_8= 'priority' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // InternalEEBM.g:1649:16: (otherlv_8= 'priority' )
            	    	    // InternalEEBM.g:1649:18: otherlv_8= 'priority'
            	    	    {
            	    	    otherlv_8=(Token)match(input,22,FOLLOW_19); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getPriorityKeyword_1_0());
            	    	        

            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalEEBM.g:1660:4: ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) )
            	    	    {
            	    	    // InternalEEBM.g:1660:4: ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) )
            	    	    // InternalEEBM.g:1661:5: {...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1)");
            	    	    }
            	    	    // InternalEEBM.g:1661:101: ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) )
            	    	    // InternalEEBM.g:1662:6: ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_1(), 1);
            	    	    	 				
            	    	    // InternalEEBM.g:1665:6: ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) )
            	    	    // InternalEEBM.g:1665:7: {...}? => ( (lv_priority_9_0= rulePriorityEnum ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // InternalEEBM.g:1665:16: ( (lv_priority_9_0= rulePriorityEnum ) )
            	    	    // InternalEEBM.g:1666:1: (lv_priority_9_0= rulePriorityEnum )
            	    	    {
            	    	    // InternalEEBM.g:1666:1: (lv_priority_9_0= rulePriorityEnum )
            	    	    // InternalEEBM.g:1667:3: lv_priority_9_0= rulePriorityEnum
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getPriorityPriorityEnumEnumRuleCall_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_priority_9_0=rulePriorityEnum();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	    	        }
            	    	           		set(
            	    	           			current, 
            	    	           			"priority",
            	    	            		lv_priority_9_0, 
            	    	            		"edu.cmu.sei.eebm.EEBM.PriorityEnum");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup_1()) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup_1())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup_1());
            	    	

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEEBM.g:1705:4: ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1705:4: ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1706:5: {...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEEBM.g:1706:99: ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1707:6: ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // InternalEEBM.g:1710:6: ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1710:7: {...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1710:16: (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1710:18: otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_14); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getTimeKeyword_2_0());
            	        
            	    // InternalEEBM.g:1714:1: ( (lv_time_11_0= RULE_INT ) )
            	    // InternalEEBM.g:1715:1: (lv_time_11_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1715:1: (lv_time_11_0= RULE_INT )
            	    // InternalEEBM.g:1716:3: lv_time_11_0= RULE_INT
            	    {
            	    lv_time_11_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    			newLeafNode(lv_time_11_0, grammarAccess.getTaskAccess().getTimeINTTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"time",
            	            		lv_time_11_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEEBM.g:1739:4: ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1739:4: ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1740:5: {...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalEEBM.g:1740:99: ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1741:6: ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // InternalEEBM.g:1744:6: ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1744:7: {...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1744:16: (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1744:18: otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getCostKeyword_3_0());
            	        
            	    // InternalEEBM.g:1748:1: ( (lv_cost_13_0= RULE_INT ) )
            	    // InternalEEBM.g:1749:1: (lv_cost_13_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1749:1: (lv_cost_13_0= RULE_INT )
            	    // InternalEEBM.g:1750:3: lv_cost_13_0= RULE_INT
            	    {
            	    lv_cost_13_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    			newLeafNode(lv_cost_13_0, grammarAccess.getTaskAccess().getCostINTTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cost",
            	            		lv_cost_13_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEEBM.g:1773:4: ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1773:4: ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) )
            	    // InternalEEBM.g:1774:5: {...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalEEBM.g:1774:99: ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) )
            	    // InternalEEBM.g:1775:6: ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // InternalEEBM.g:1778:6: ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) )
            	    // InternalEEBM.g:1778:7: {...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1778:16: (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) )
            	    // InternalEEBM.g:1778:18: otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) )
            	    {
            	    otherlv_14=(Token)match(input,25,FOLLOW_14); 

            	        	newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getBenefitKeyword_4_0());
            	        
            	    // InternalEEBM.g:1782:1: ( (lv_benefit_15_0= RULE_INT ) )
            	    // InternalEEBM.g:1783:1: (lv_benefit_15_0= RULE_INT )
            	    {
            	    // InternalEEBM.g:1783:1: (lv_benefit_15_0= RULE_INT )
            	    // InternalEEBM.g:1784:3: lv_benefit_15_0= RULE_INT
            	    {
            	    lv_benefit_15_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    			newLeafNode(lv_benefit_15_0, grammarAccess.getTaskAccess().getBenefitINTTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"benefit",
            	            		lv_benefit_15_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEEBM.g:1807:4: ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalEEBM.g:1807:4: ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) )
            	    // InternalEEBM.g:1808:5: {...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalEEBM.g:1808:99: ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) )
            	    // InternalEEBM.g:1809:6: ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // InternalEEBM.g:1812:6: ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) )
            	    // InternalEEBM.g:1812:7: {...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1812:16: (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) )
            	    // InternalEEBM.g:1812:18: otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,26,FOLLOW_3); 

            	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getCompletionKeyword_5_0());
            	        
            	    // InternalEEBM.g:1816:1: ( (lv_date_17_0= RULE_STRING ) )
            	    // InternalEEBM.g:1817:1: (lv_date_17_0= RULE_STRING )
            	    {
            	    // InternalEEBM.g:1817:1: (lv_date_17_0= RULE_STRING )
            	    // InternalEEBM.g:1818:3: lv_date_17_0= RULE_STRING
            	    {
            	    lv_date_17_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    			newLeafNode(lv_date_17_0, grammarAccess.getTaskAccess().getDateSTRINGTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"date",
            	            		lv_date_17_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalEEBM.g:1841:4: ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) )
            	    {
            	    // InternalEEBM.g:1841:4: ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) )
            	    // InternalEEBM.g:1842:5: {...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalEEBM.g:1842:99: ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) )
            	    // InternalEEBM.g:1843:6: ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // InternalEEBM.g:1846:6: ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) )
            	    // InternalEEBM.g:1846:7: {...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // InternalEEBM.g:1846:16: ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' )
            	    // InternalEEBM.g:1846:17: (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']'
            	    {
            	    // InternalEEBM.g:1846:17: (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==27) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalEEBM.g:1846:19: otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) )
            	            {
            	            otherlv_18=(Token)match(input,27,FOLLOW_14); 

            	                	newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getDelayCostKeyword_6_0_0());
            	                
            	            // InternalEEBM.g:1850:1: ( (lv_cod_19_0= RULE_INT ) )
            	            // InternalEEBM.g:1851:1: (lv_cod_19_0= RULE_INT )
            	            {
            	            // InternalEEBM.g:1851:1: (lv_cod_19_0= RULE_INT )
            	            // InternalEEBM.g:1852:3: lv_cod_19_0= RULE_INT
            	            {
            	            lv_cod_19_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            	            			newLeafNode(lv_cod_19_0, grammarAccess.getTaskAccess().getCodINTTerminalRuleCall_6_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTaskRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"cod",
            	                    		lv_cod_19_0, 
            	                    		"org.eclipse.xtext.common.Terminals.INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,17,FOLLOW_19); 

            	        	newLeafNode(otherlv_20, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDescription"
    // InternalEEBM.g:1895:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalEEBM.g:1896:2: (iv_ruleDescription= ruleDescription EOF )
            // InternalEEBM.g:1897:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalEEBM.g:1904:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // InternalEEBM.g:1907:28: ( (otherlv_0= 'description' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalEEBM.g:1908:1: (otherlv_0= 'description' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalEEBM.g:1908:1: (otherlv_0= 'description' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalEEBM.g:1908:3: otherlv_0= 'description' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
                
            // InternalEEBM.g:1912:1: ( (lv_text_1_0= RULE_STRING ) )
            // InternalEEBM.g:1913:1: (lv_text_1_0= RULE_STRING )
            {
            // InternalEEBM.g:1913:1: (lv_text_1_0= RULE_STRING )
            // InternalEEBM.g:1914:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_text_1_0, grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleRationale"
    // InternalEEBM.g:1938:1: entryRuleRationale returns [EObject current=null] : iv_ruleRationale= ruleRationale EOF ;
    public final EObject entryRuleRationale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationale = null;


        try {
            // InternalEEBM.g:1939:2: (iv_ruleRationale= ruleRationale EOF )
            // InternalEEBM.g:1940:2: iv_ruleRationale= ruleRationale EOF
            {
             newCompositeNode(grammarAccess.getRationaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRationale=ruleRationale();

            state._fsp--;

             current =iv_ruleRationale; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRationale"


    // $ANTLR start "ruleRationale"
    // InternalEEBM.g:1947:1: ruleRationale returns [EObject current=null] : (otherlv_0= 'rationale' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRationale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // InternalEEBM.g:1950:28: ( (otherlv_0= 'rationale' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalEEBM.g:1951:1: (otherlv_0= 'rationale' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalEEBM.g:1951:1: (otherlv_0= 'rationale' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalEEBM.g:1951:3: otherlv_0= 'rationale' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRationaleAccess().getRationaleKeyword_0());
                
            // InternalEEBM.g:1955:1: ( (lv_text_1_0= RULE_STRING ) )
            // InternalEEBM.g:1956:1: (lv_text_1_0= RULE_STRING )
            {
            // InternalEEBM.g:1956:1: (lv_text_1_0= RULE_STRING )
            // InternalEEBM.g:1957:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_text_1_0, grammarAccess.getRationaleAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRationaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRationale"


    // $ANTLR start "entryRuleReference"
    // InternalEEBM.g:1981:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalEEBM.g:1982:2: (iv_ruleReference= ruleReference EOF )
            // InternalEEBM.g:1983:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalEEBM.g:1990:1: ruleReference returns [EObject current=null] : (otherlv_0= 'see document' ( (lv_docReference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_docReference_1_0=null;

         enterRule(); 
            
        try {
            // InternalEEBM.g:1993:28: ( (otherlv_0= 'see document' ( (lv_docReference_1_0= RULE_STRING ) ) ) )
            // InternalEEBM.g:1994:1: (otherlv_0= 'see document' ( (lv_docReference_1_0= RULE_STRING ) ) )
            {
            // InternalEEBM.g:1994:1: (otherlv_0= 'see document' ( (lv_docReference_1_0= RULE_STRING ) ) )
            // InternalEEBM.g:1994:3: otherlv_0= 'see document' ( (lv_docReference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getSeeDocumentKeyword_0());
                
            // InternalEEBM.g:1998:1: ( (lv_docReference_1_0= RULE_STRING ) )
            // InternalEEBM.g:1999:1: (lv_docReference_1_0= RULE_STRING )
            {
            // InternalEEBM.g:1999:1: (lv_docReference_1_0= RULE_STRING )
            // InternalEEBM.g:2000:3: lv_docReference_1_0= RULE_STRING
            {
            lv_docReference_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_docReference_1_0, grammarAccess.getReferenceAccess().getDocReferenceSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"docReference",
                    		lv_docReference_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rulePriorityEnum"
    // InternalEEBM.g:2026:1: rulePriorityEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'LOW' ) | (enumLiteral_2= 'MED' ) | (enumLiteral_3= 'HIGH' ) ) ;
    public final Enumerator rulePriorityEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalEEBM.g:2028:28: ( ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'LOW' ) | (enumLiteral_2= 'MED' ) | (enumLiteral_3= 'HIGH' ) ) )
            // InternalEEBM.g:2029:1: ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'LOW' ) | (enumLiteral_2= 'MED' ) | (enumLiteral_3= 'HIGH' ) )
            {
            // InternalEEBM.g:2029:1: ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'LOW' ) | (enumLiteral_2= 'MED' ) | (enumLiteral_3= 'HIGH' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt27=1;
                }
                break;
            case 34:
                {
                alt27=2;
                }
                break;
            case 35:
                {
                alt27=3;
                }
                break;
            case 36:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalEEBM.g:2029:2: (enumLiteral_0= 'NA' )
                    {
                    // InternalEEBM.g:2029:2: (enumLiteral_0= 'NA' )
                    // InternalEEBM.g:2029:4: enumLiteral_0= 'NA'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                            current = grammarAccess.getPriorityEnumAccess().getNAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPriorityEnumAccess().getNAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalEEBM.g:2035:6: (enumLiteral_1= 'LOW' )
                    {
                    // InternalEEBM.g:2035:6: (enumLiteral_1= 'LOW' )
                    // InternalEEBM.g:2035:8: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                            current = grammarAccess.getPriorityEnumAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPriorityEnumAccess().getLOWEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalEEBM.g:2041:6: (enumLiteral_2= 'MED' )
                    {
                    // InternalEEBM.g:2041:6: (enumLiteral_2= 'MED' )
                    // InternalEEBM.g:2041:8: enumLiteral_2= 'MED'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                            current = grammarAccess.getPriorityEnumAccess().getMEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPriorityEnumAccess().getMEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalEEBM.g:2047:6: (enumLiteral_3= 'HIGH' )
                    {
                    // InternalEEBM.g:2047:6: (enumLiteral_3= 'HIGH' )
                    // InternalEEBM.g:2047:8: enumLiteral_3= 'HIGH'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                            current = grammarAccess.getPriorityEnumAccess().getHIGHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPriorityEnumAccess().getHIGHEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePriorityEnum"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\21\6\uffff\3\6\1\4\1\6\2\4\11\uffff\1\21\1\uffff";
    static final String dfa_3s = "\1\44\6\uffff\3\6\1\4\1\6\2\4\11\uffff\1\21\1\uffff";
    static final String dfa_4s = "\1\uffff\6\1\7\uffff\1\1\1\2\1\3\6\1\1\uffff\1\1";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\16\2\uffff\1\1\1\uffff\1\2\1\7\1\10\1\11\1\12\1\13\1\20\1\17\1\uffff\1\14\1\15\1\3\1\4\1\5\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "175:1: (this_Goal_0= ruleGoal | this_Task_1= ruleTask | this_Softgoal_2= ruleSoftgoal )";
        }
    }
    static final String dfa_7s = "\1\1\30\uffff";
    static final String dfa_8s = "\1\14\1\uffff\16\0\11\uffff";
    static final String dfa_9s = "\1\44\1\uffff\16\0\11\uffff";
    static final String dfa_10s = "\1\uffff\1\12\16\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_11s = "\2\uffff\1\10\1\5\1\12\1\4\1\15\1\6\1\14\1\0\1\1\1\3\1\7\1\13\1\2\1\11\11\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\4\uffff\1\17\2\1\1\2\1\uffff\1\3\1\10\1\11\1\12\1\13\1\14\2\1\1\uffff\1\15\1\16\1\4\1\5\1\6\1\7",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 700:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Goal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 3) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 4) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 8) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 5) ) {s = 21;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 6) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 8) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 7) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\1\uffff\1\12\16\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\1";
    static final String dfa_14s = "\2\uffff\1\11\1\5\1\0\1\14\1\3\1\6\1\7\1\12\1\13\1\2\1\10\1\1\1\4\1\15\11\uffff}>";
    static final String[] dfa_15s = {
            "\1\1\4\uffff\1\16\3\1\1\uffff\1\2\1\7\1\10\1\11\1\12\1\13\1\17\1\1\1\uffff\1\14\1\15\1\3\1\4\1\5\1\6",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "()+ loopback of 1125:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Softgoal' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rationale_20_0= ruleRationale ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_ref_21_0= ruleReference ) )? otherlv_22= ']' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_4 = input.LA(1);

                         
                        int index21_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_13 = input.LA(1);

                         
                        int index21_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 8) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 6) ) {s = 21;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_14 = input.LA(1);

                         
                        int index21_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 8) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_3 = input.LA(1);

                         
                        int index21_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 7) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_2 = input.LA(1);

                         
                        int index21_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 4) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 5) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_15 = input.LA(1);

                         
                        int index21_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSoftgoalAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index21_15);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_16s = "\25\uffff";
    static final String dfa_17s = "\1\1\24\uffff";
    static final String dfa_18s = "\1\14\1\uffff\14\0\7\uffff";
    static final String dfa_19s = "\1\44\1\uffff\14\0\7\uffff";
    static final String dfa_20s = "\1\uffff\1\10\14\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1";
    static final String dfa_21s = "\2\uffff\1\13\1\3\1\1\1\11\1\5\1\6\1\7\1\10\1\12\1\2\1\4\1\0\7\uffff}>";
    static final String[] dfa_22s = {
            "\1\1\4\uffff\1\14\3\1\1\uffff\1\2\1\7\1\10\1\11\1\12\1\13\1\1\1\15\1\uffff\2\1\1\3\1\4\1\5\1\6",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_16;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()+ loopback of 1550:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_title_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( (lv_description_6_0= ruleDescription ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'priority' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_priority_9_0= rulePriorityEnum ) ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'time' ( (lv_time_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'cost' ( (lv_cost_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'benefit' ( (lv_benefit_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completion' ( (lv_date_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'delay cost' ( (lv_cod_19_0= RULE_INT ) ) )? otherlv_20= ']' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_13 = input.LA(1);

                         
                        int index26_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 0) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 6) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_12 = input.LA(1);

                         
                        int index26_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 6) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 2) ) {s = 15;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 5) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup(), 1) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001FBFDE1002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C1002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FCFD20002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001F8FD20002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FDFC20002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001F9FC20002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001E6FC20002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001E2FC20002L});

}
