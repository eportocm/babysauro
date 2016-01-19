package br.com.babysauro.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.context.RequestContext;

public class Mensagens {

	@SuppressWarnings("unused")
	@Inject
	private FacesContext context;
	
	public void errorMessage(String mensagem) {		
		addMessage(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", mensagem));
	}
	
	public void infoMessage(String mensagem) {
		addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação", mensagem));
	}
	
	public void warningMessage(String mensagem) {
		addMessage(new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", mensagem));
	}
	
	public void fatalMessage(String mensagem) {
		addMessage(new FacesMessage(FacesMessage.SEVERITY_FATAL, "Erro Fatal", mensagem));
	}
	
	private void addMessage(FacesMessage facesMessage) {
		
		//context.getExternalContext().getFlash().setKeepMessages(true);
		//context.addMessage(null, facesMessage);
		
		RequestContext.getCurrentInstance().showMessageInDialog(facesMessage);
	}
}
