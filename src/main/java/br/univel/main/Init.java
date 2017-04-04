package br.univel.main;

import java.rmi.RemoteException;

import br.dagostini.jshare.comun.Cliente;
import br.dagostini.jshare.comun.IServer;
import br.univel.main.repository.ClientRepository;
import br.univel.view.MainFrame;

/**
 * 
 * Classe responsável por iniciar o sistema
 * 
 * @author Aureo 
 *
 */
public class Init {

	public static void main(String[] args) {
		IServer s =  Server.getInstance();
//		Cliente c 

		Cliente c = new Cliente();
		c.setIp("192.168.105.65");
		c.setNome("Aureo");
		c.setPorta(1818);
		
		try {
			s.registrarCliente(c);
		} catch (RemoteException e) {
			System.out.println("Moiô o Cliente não foi adicionado");
		}
		
		System.out.println("Conectou com sucesso");
		
		ClientRepository repo = new ClientRepository();
		repo.setCliente(c);
		
		MainFrame.main(c.getNome().split(""));
		
		
	}
}
