package br.univel.main;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.dagostini.jshare.comum.pojos.Arquivo;
import br.dagostini.jshare.comun.Cliente;
import br.dagostini.jshare.comun.IServer;

public class Server implements IServer {

	private Server instance;
	
	private List<Cliente> listaClientesDisponiveis;
	
	private Map<Cliente,List<Arquivo>> mapaArquivos;
	
	private Server(){
			
	}
	
	@Override
	public void registrarCliente(Cliente c) throws RemoteException {
		if(listaClientesDisponiveis.contains(c)){
//			showNotifications();
		}

	}

	@Override
	public void publicarListaArquivos(Cliente c, List<Arquivo> lista) throws RemoteException {
		

	}

	@Override
	public Map<Cliente, List<Arquivo>> procurarArquivo(String nome) throws RemoteException {
		
		return null;
	}

	@Override
	public byte[] baixarArquivo(Arquivo arq) throws RemoteException {
		
		return null;
	}

	@Override
	public void desconectar(Cliente c) throws RemoteException {
		

	}

	public static Server getInstance() {
		
		return new Server();
	}

	public void setInstance(Server instance) {

		this.instance = instance;
	}

	public List<Cliente> getListaClientesDisponiveis() {
		if(listaClientesDisponiveis == null)
			listaClientesDisponiveis = new ArrayList<>();
		
		return listaClientesDisponiveis;
	}

	public void setListaClientesDisponiveis(List<Cliente> listaClientesDisponiveis) {
		if(this.listaClientesDisponiveis == null){
			listaClientesDisponiveis = new ArrayList<>();
		}
		
		this.listaClientesDisponiveis = listaClientesDisponiveis;
	}

	public Map<Cliente, List<Arquivo>> getMapaArquivos() {
		if(mapaArquivos == null)
			mapaArquivos = new HashMap<>();
		
		return mapaArquivos;
	}

	public void setMapaArquivos(Map<Cliente, List<Arquivo>> mapaArquivos) {
		this.mapaArquivos = mapaArquivos;
	}

	
	
}
