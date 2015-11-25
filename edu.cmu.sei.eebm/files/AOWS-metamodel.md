//translate the FDA powerpoint roadmap into a DSL

# Implemented

* Roadmap is the top element. It consists of intentional elements and stakeholders.
* Intentional elements are Options or Goals. 
* Goals determine rationale/objectives (the why) and refer to external motivations like EA docs.
* Stakeholders are either participants or consultants. Participants can have preferences.
* Preferences are held by participants and expressed over two options (pref(optA, optB)) where the first one is preferred to the second.
* Options have attributes including time, cost, schedule, cost of delay. They conflict with other Intentional Elements and refine IEs.
* A Path is a set of Options optimal wrt constraints and stakeholder preferences. One constraint is time, really just A precedes B.
* Decisions are sets of options (presumably that are to be acted on), and have a responsible Stakeholder, 

# TODO 
(see also the TODO: in the DSL file.

- Add goal constraints
- Target (tech) architecture ultimately implements the decisions
- Scenarios/use cases guide analysis and outline value proposition/testing.
- Arch principles outline high level objectives

