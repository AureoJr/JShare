package br.univel.view.frames;

import javax.swing.JPanel;

import org.omg.CORBA.RepositoryIdHelper;

import br.dagostini.jshare.comun.IServer;
import br.univel.main.Server;
import br.univel.main.repository.ClientRepository;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HomeFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomeFrame() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 187, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnIniciarApp = new JButton("Iniciar");
		btnIniciarApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IServer server = Server.getInstance();
				
			}
		});
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 1;
		add(lblCliente, gbc_lblCliente);
		
		JLabel lblClienteNome = new JLabel(" ");
		GridBagConstraints gbc_lblClienteNome = new GridBagConstraints();
		gbc_lblClienteNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblClienteNome.gridx = 3;
		gbc_lblClienteNome.gridy = 1;
		add(lblClienteNome, gbc_lblClienteNome);
		
		JLabel lblDownloadas = new JLabel("Downloads");
		GridBagConstraints gbc_lblDownloadas = new GridBagConstraints();
		gbc_lblDownloadas.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDownloadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblDownloadas.gridx = 2;
		gbc_lblDownloadas.gridy = 2;
		add(lblDownloadas, gbc_lblDownloadas);
		
		JLabel lblNomeDownloads = new JLabel(" ");
		GridBagConstraints gbc_lblNomeDownloads = new GridBagConstraints();
		gbc_lblNomeDownloads.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDownloads.gridx = 3;
		gbc_lblNomeDownloads.gridy = 2;
		add(lblNomeDownloads, gbc_lblNomeDownloads);
		
		JLabel lblArquivos = new JLabel("Arquivos");
		GridBagConstraints gbc_lblArquivos = new GridBagConstraints();
		gbc_lblArquivos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblArquivos.insets = new Insets(0, 0, 5, 5);
		gbc_lblArquivos.gridx = 2;
		gbc_lblArquivos.gridy = 3;
		add(lblArquivos, gbc_lblArquivos);
		
		JLabel label = new JLabel("New label");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 3;
		add(label, gbc_label);
		GridBagConstraints gbc_btnIniciarApp = new GridBagConstraints();
		gbc_btnIniciarApp.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciarApp.gridx = 15;
		gbc_btnIniciarApp.gridy = 9;
		add(btnIniciarApp, gbc_btnIniciarApp);
		
		ClientRepository repo = new ClientRepository();
		lblNomeDownloads.setText(repo.getDownloadPathName());
		lblClienteNome.setText(repo.getCliente().getNome());
	}
	

}
