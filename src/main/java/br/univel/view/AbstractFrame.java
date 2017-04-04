package br.univel.view;

import javax.swing.JPanel;

/**
 * 
 *  Padrão de Janelas
 * 
 * @author aureo
 *
 */
public abstract class AbstractFrame extends JPanel{

	private static final long serialVersionUID = 1L;

	/**
	 * Insere os demais componentes na tela
	 */
	protected abstract void  configure();
	
	/**
	 * Nome da tela
	 */
	protected abstract String screenName();
}
