package br.univel.view;

import java.awt.BorderLayout;
import java.awt.Component;

/**
 * 
 * Gerenciador de Janelas
 * 
 * @author aureo
 *
 */
public class WindowManager extends AbstractFrame {

	/**	
	 * 
	 */
	private static final long serialVersionUID = 987677527658032339L;

	private static final String PACKAGE = "br.univel.view.frames.";
	
	private String tela;

	private String nome ;
	
	public String getNome() {
		return nome;
	}

	@Override
	protected void configure() {
		if(tela == null){
			return;
		}
		
		try {
			Component newInstance = (Component) Class.forName(PACKAGE+tela).newInstance();
			this.nome = newInstance.toString();
			super.add(newInstance, BorderLayout.CENTER);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected String screenName() {
	    if(this.nome.isEmpty())
	    	this.nome = "Nova Tela";
	    return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public WindowManager(String tela) {
		super();
		this.tela = tela;
	}	
}
