package br.univel.view.frames;

import javax.swing.JPanel;

import br.dagostini.jshare.comun.IServer;
import br.univel.main.Server;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomeFrame() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnIniciarApp = new JButton("Iniciar");
		btnIniciarApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IServer server = Server.getInstance();
				
			}
		});
		GridBagConstraints gbc_btnIniciarApp = new GridBagConstraints();
		gbc_btnIniciarApp.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciarApp.gridx = 13;
		gbc_btnIniciarApp.gridy = 9;
		add(btnIniciarApp, gbc_btnIniciarApp);

	}

}
