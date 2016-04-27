package br.univel.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JPanel pnlLeft = new JPanel();
		contentPane.add(pnlLeft, BorderLayout.WEST);
		GridBagLayout gbl_pnlLeft = new GridBagLayout();
		gbl_pnlLeft.columnWidths = new int[]{117, 0};
		gbl_pnlLeft.rowHeights = new int[]{25, 0, 0, 0, 0};
		gbl_pnlLeft.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlLeft.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLeft.setLayout(gbl_pnlLeft);
		
		JButton btnSeach = new JButton("New button");
		btnSeach.setToolTipText("Pesquisar Arquivos");
		GridBagConstraints gbc_btnSeach = new GridBagConstraints();
		gbc_btnSeach.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeach.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnSeach.gridx = 0;
		gbc_btnSeach.gridy = 0;
		pnlLeft.add(btnSeach, gbc_btnSeach);
		
		JButton btnDownloads = new JButton("New button");
		GridBagConstraints gbc_btnDownloads = new GridBagConstraints();
		gbc_btnDownloads.insets = new Insets(0, 0, 5, 0);
		gbc_btnDownloads.gridx = 0;
		gbc_btnDownloads.gridy = 1;
		pnlLeft.add(btnDownloads, gbc_btnDownloads);
		
		JButton btnChat = new JButton("New button");
		GridBagConstraints gbc_btnChat = new GridBagConstraints();
		gbc_btnChat.insets = new Insets(0, 0, 5, 0);
		gbc_btnChat.gridx = 0;
		gbc_btnChat.gridy = 2;
		pnlLeft.add(btnChat, gbc_btnChat);
		
		JButton btnConfigurations = new JButton("Config");
		GridBagConstraints gbc_btnConfigurations = new GridBagConstraints();
		gbc_btnConfigurations.gridx = 0;
		gbc_btnConfigurations.gridy = 3;
		pnlLeft.add(btnConfigurations, gbc_btnConfigurations);
	}

}
