package br.univel.main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.dagostini.jshare.comum.pojos.Arquivo;
import br.dagostini.jshare.comun.Cliente;
import br.dagostini.jshare.comun.IServer;

public class Server implements IServer {

	private String SERVER_NAME = "TORRENT Z1K4";

	private static Server instance;

	private List<Cliente> listaClientesDisponiveis;

	private Map<Cliente, List<Arquivo>> mapaArquivos;

	private Server() {

		IServer servico;
		Registry registry;
		try {
			servico = (IServer) UnicastRemoteObject.exportObject(this, 0);
			registry = LocateRegistry.createRegistry(1818);
			registry.rebind(SERVER_NAME, this);

		} catch (RemoteException e) {
			System.out.println("Moiô, não deu de conectar" );
			e.printStackTrace();
		}

	}

	@Override
	public void registrarCliente(Cliente c) throws RemoteException {
		if(listaClientesDisponiveis == null)
			listaClientesDisponiveis = new ArrayList<>();
		
		if (listaClientesDisponiveis.contains(c)) {
			showNotifications("O Cliente " + c.getNome() + " já foi registrado ");
		}
		listaClientesDisponiveis.add(c);
		showNotifications("O Cliente " + c.getNome() + "  registrado com sucesso");
	}

	private void showNotifications(String mensagem) {
		ToastMessage toastMessage = new ToastMessage("mensagem ", 3000);
		toastMessage.setVisible(true);

	}

	@Override
	public void publicarListaArquivos(Cliente c, List<Arquivo> lista) throws RemoteException {

		mapaArquivos.put(c, lista);
		showNotifications("Arquivos adicionados com sucesso");
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

		listaClientesDisponiveis.remove(c);
		showNotifications("Cliente " + c.getNome() + " Desconectado");
	}

	public static Server getInstance() {

		if (instance == null)
			instance = new Server();
		return instance;
	}

	public void setInstance(Server instance) {

		this.instance = instance;
	}

	public List<Cliente> getListaClientesDisponiveis() {
		if (listaClientesDisponiveis == null)
			listaClientesDisponiveis = new ArrayList<>();

		return listaClientesDisponiveis;
	}

	public void setListaClientesDisponiveis(List<Cliente> listaClientesDisponiveis) {
		if (this.listaClientesDisponiveis == null) {
			listaClientesDisponiveis = new ArrayList<>();
		}

		this.listaClientesDisponiveis = listaClientesDisponiveis;
	}

	public Map<Cliente, List<Arquivo>> getMapaArquivos() {
		if (mapaArquivos == null)
			mapaArquivos = new HashMap<>();

		return mapaArquivos;
	}

	public void setMapaArquivos(Map<Cliente, List<Arquivo>> mapaArquivos) {
		this.mapaArquivos = mapaArquivos;
	}

}
