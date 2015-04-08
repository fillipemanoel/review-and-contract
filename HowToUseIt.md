Obs: if you still haven't installed Protégé and would like to do so, you can go to [Protégé download page](http://protege.stanford.edu/download/download.html) and follow the instructions.

# The plug-in #
The plug-in is a _jar_ file you need to add to the folder _plugins_ of Protégé main folder.
You can download it from the _[Downloads](http://code.google.com/p/review-and-contract/downloads/list)_ page.

The next time you run Protégé, the plug-in will be loaded. If you are already running Protégé, you should save your files and restart it to be able to use the plug-in.

# Using it #
The plug-in appears under the labels _Contraction_ and _Revision_ on the menu _Window_ - _View_ - _Misc views_.

After you have your ontology, you just select from the menu the desired operation  (contraction or revision) and, with the small black ball that appears, click on the ontology on which you want to perform changes.

Let's explain how it works through a simple example applying _Contraction_. _Revision_ will be analogous, as both operations have the same graphical interface structure. Suppose you want to build an ontology asserting a class _FlyingAnimal_ and setting _Bird_ as a subclass of _FlyingAnimal_ and _Penguin_ as a subclass of _Bird_. In addition, you want _Tweety_ to be a member of _Penguin_. By doing so, you get the following ontology representation:

<img src='http://review-and-contract.googlecode.com/files/Ontology.jpeg' align='middle' width='320' height='300' />

We go to the menu _Window_ - _View_ - _Misc views_, select _Contraction_ and then the ontology we built. The plug-in appears under the label _Contraction_ and, on its bottom, there is a blank editor. That's where we write the information we want to contract from the ontology, using the _Manchester OWL Syntax_. If you don't know it, there is an introductory guide [here](http://www.co-ode.org/downloads/manchesterowlsyntaxeditor/EditorGuide.pdf).

Suppose that in our ontology we don't want penguins to be represented as flying animals. So, we should contract the information that _Penguin_ is a subclass of _FlyingAnimal_. We write "Penguin SubClassOf FlyingAnimal" and click the button _Next_. Before clicking _Next_, it should be like this:

<img src='http://review-and-contract.googlecode.com/files/contraction-colon.jpeg' align='middle' width='280' height='330' />

Note that _SubClassOf:_ is underlined red as a syntax error. It's due to the colon. However, the internal interpreter of the syntax only accepts it with colon. Thus, for instance you can ignore this warning. As we click _Next_, the plug-in returns the kernel set of the belief base representing the ontology in regard of the information chosen to be retracted. We now choose one information of each element of the kernel set and click _Finish_.

In our case, the kernel set has only one element with the following information: _Bird_ as a subclass of _FlyingAnimal_ and _Penguin_ as a subclass of _Bird_. We may realize that penguins are really birds and that not all birds fly. So, we choose to eliminate the information _Bird_ subclass of _FlyingAnimal_, like this:

<img src='http://review-and-contract.googlecode.com/files/KernelCont.jpeg' align='middle' width='900' height='280' />

As we click _Finish_, the ontology will be contracted accordingly. In our case, it will appear this way:

<img src='http://review-and-contract.googlecode.com/files/OntContracted.jpeg' align='middle' width='340' height='300' />