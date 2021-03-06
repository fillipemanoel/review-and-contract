package revisor.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.protege.editor.owl.model.OWLModelManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * @author Márcio Ribeiro and Fillipe Resina
 */

public class PostulatesAction implements ActionListener {

	private OWLOntology ontology;
	
	private KernelButton[][] kernelButtons;
	
	private OWLModelManager manager;
	
	private RevisorAbstractView revisorView;
	
	PostulatesAction(RevisorAbstractView revView){
		revisorView = revView;
		manager = revisorView.manager;
		kernelButtons = revisorView.kernelButtons;
		ontology = revisorView.ontology;
	}
	
	public void actionPerformed(ActionEvent e) {
		if("finish".equals(e.getActionCommand())){
			if (kernelButtons == null) {
				revisorView.clearAxioms();
				revisorView.postulatesGUI();
				return;
			}
			for(KernelButton[] KB: kernelButtons){
				for (KernelButton kb: KB){				
					if(kb != null && kb.isSelected()){
						manager.applyChange(new RemoveAxiom(ontology, kb.getAxiom()));
					}
				}
			}	
		
		}
		revisorView.clearAxioms();
		revisorView.clearKernels();
		revisorView.postulatesGUI();		
	}
}