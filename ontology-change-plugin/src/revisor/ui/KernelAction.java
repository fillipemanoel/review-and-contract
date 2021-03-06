package revisor.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.parser.OWLParseException;
import org.protege.editor.owl.ui.clsdescriptioneditor.ExpressionEditor;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassAxiom;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author Márcio Ribeiro and Fillipe Resina
 */

public class KernelAction implements ActionListener {

	private ExpressionEditor<OWLClassAxiom> editor;

	private OWLModelManager manager;

	private OWLOntology ontology;

	private RevisorAbstractView revisorView;

	protected KernelAction(RevisorAbstractView revView) {
		revisorView = revView;
		manager = revisorView.manager;
		editor = revisorView.editor;
		ontology = revisorView.ontology;
	}

	public void actionPerformed(ActionEvent e) {

		HashMap<String, String> options = new HashMap<String, String>();

		for (PostulateGroup postGroup : revisorView.postulateGroups) {
			for (PostulateButton button : postGroup.buttons) {
				if (button.isSelected()) {
					options.put(postGroup.title, button.getText());
				}
			}
		}

		String minimality = options.get("Minimality Type");
		// Prepares and Editor Parser to parse the given expression in Protege  Editor
		OWLAxiom alpha = null;
		try {
			if((editor.getText()).contains("Type") || editor.isWellFormed()) {
				alpha = editor.createObject();
				revisorView.addAxiom(alpha,editor.getText());
				// Get the axioms according to the desired operation
				Set<Set<OWLAxiom>> axioms = revisorView.getAxioms(manager, ontology, options);
				// Show them to the user
				revisorView.axiomsGUI(axioms, minimality,ontology.getOntologyID().getOntologyIRI());
				revisorView.finishState(minimality);
			}
			else{
				throw new OWLParseException("Ill-formed expressions: "+editor.getText());
			}
		} catch (OWLException e1) {
			e1.printStackTrace();
		}
		
	}
}