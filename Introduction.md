# Abstract #

Ontologies have been largely used to represent knowledge. Nonetheless, knowledge is not static, what causes us to study its dynamics. Thus, belief revision becomes an important tool to be applied on our knowledge bases. Here, we present an ontology revision tool as a plug-in for Protégé, the most used ontology editor currently.


# Introduction #

The knowledge representation problem is an important topic within current researches in Philosophy, Artificial Intelligence and Cognitive Science. In this context, ontologies have become a great resource as they provide a formal knowledge representation by describing, in a particular domain, concepts, their relations and individuals. There are softwares developed to edit ontologies and the foremost has been [Protégé](http://protege.stanford.edu/), a free software that allows users to create and edit ontologies. It is done through a graphical interface and, in addition, it is possible to export the knowledge base in different formats.

<img src='http://review-and-contract.googlecode.com/files/Protege.jpeg' align='middle' width='380' height='160' />

Logic is the basis for most of the formalisms to represent knowledge. In this work, the main one are Description Logics because, besides their great capacity in representing knowledge base systems, they provide efficient reasoning and inference methods. In addition, the [Web Ontology Language](http://www.w3.org/TR/owl-guide/) (OWL), defined as the standard to represent ontologies on the web, is based on Description Logics.

The dynamics of knowledge is also very discussed and, for this topic, we have Belief Revision as a great resource. The belief revision theory discuss how a rational agent should change their beliefs when they receive new information that is inconsistent with their current beliefs. In addition, as we don't want to do unnecessary changes, they need to be minimal. So, for ontologies, it is important to apply an efficient belief revision method, eliminating inconsistencies and promoting minimal changes.

On this purpose, we have been developing this tool for Protégé as a plug-in, interacting with the users when they needs to revise their ontologies.