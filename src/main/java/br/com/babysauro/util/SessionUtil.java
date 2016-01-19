package br.com.babysauro.util;

import javax.faces.context.FacesContext;
import javax.inject.Inject;

public class SessionUtil {

	@Inject
	private FacesContext context;
	
	public void colocaNaSession(String name, Object value) {
		context.getExternalContext().getSessionMap().put(name, value);
	}
	
	public Object pegaDaSession(String name) {
		return context.getExternalContext().getSessionMap().get(name);
	}
	
	public void retiraDaSession(String name) {
		context.getExternalContext().getSessionMap().remove(name);
	}
	
}
