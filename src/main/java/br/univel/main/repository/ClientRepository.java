package br.univel.main.repository;

import java.io.File;
import java.io.FileNotFoundException;

import br.dagostini.jshare.comun.Cliente;

public class ClientRepository {

	private static Cliente cliente;
	
	private static File downloadPath;
	
	public ClientRepository (){
		try{
			downloadPath = new File("/home/aureo/Música");
		} catch (NullPointerException e){
			/**
			 * Quando estiver utilizando Ruindows ou for outro usuário, mais uma moiô Exception
			 */
			System.out.println("Diretorio de Downloads não encontrado");
		}
	}
	
	public Cliente getCliente(){
		return ClientRepository.cliente;
	}
	
	public void setCliente( Cliente cliente){
		ClientRepository.cliente = cliente;
	}
	
	public String getDownloadPathName(){
		return ClientRepository.downloadPath.getAbsolutePath();
	}
	
	public void setNewPath(File file){
		ClientRepository.downloadPath = file;
	}
	
}
