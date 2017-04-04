package br.univel;


/**
 * 
 * Enum para controlar os tipos do servidor
 * 
 * @author aureo
 *
 */
public enum TipoNotificao {

	ALERTA("alerta","Encontramos um problema .."),
	ERRO("erro", "Uma falha no sistema encontrada no sistema"),
	INFORMACAO("info", "Essa e uma tela"),
	DEFAULT("default", "Mensagem padrão");

	
	private final String key, value;

	
	private TipoNotificao(String key, String value){
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
	
	
	
}
