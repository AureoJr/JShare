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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

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
		setBounds(100, 100, 606, 433);
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
		gbl_pnlLeft.rowHeights = new int[]{0, 25, 0, 0, 0, 0};
		gbl_pnlLeft.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlLeft.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlLeft.setLayout(gbl_pnlLeft);
		
		JButton btnHome = new JButton("");
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		btnHome.setIcon(new ImageIcon(MainFrame.class.getResource("/icons/64/home-icon.png")));
		gbc_btnHome.insets = new Insets(0, 0, 5, 0);
		gbc_btnHome.gridx = 0;
		gbc_btnHome.gridy = 0;
		pnlLeft.add(btnHome, gbc_btnHome);
		
		JButton btnSeach = new JButton("");
		btnSeach.setIcon(new ImageIcon(MainFrame.class.getResource("/icons/64/search-icon.png")));
		btnSeach.setToolTipText("Pesquisar Arquivos");
		GridBagConstraints gbc_btnSeach = new GridBagConstraints();
		gbc_btnSeach.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeach.anchor = GridBagConstraints.NORTH;
		gbc_btnSeach.gridx = 0;
		gbc_btnSeach.gridy = 1;
		pnlLeft.add(btnSeach, gbc_btnSeach);
		
		JButton btnDownloads = new JButton("");
		GridBagConstraints gbc_btnDownloads = new GridBagConstraints();
		btnDownloads.setIcon(new ImageIcon(MainFrame.class.getResource("/icons/64/download-2-icon.png")));
		gbc_btnDownloads.insets = new Insets(0, 0, 5, 0);
		gbc_btnDownloads.gridx = 0;
		gbc_btnDownloads.gridy = 2;
		pnlLeft.add(btnDownloads, gbc_btnDownloads);
		
		JButton btnChat = new JButton("");
		GridBagConstraints gbc_btnChat = new GridBagConstraints();
		btnChat.setIcon(new ImageIcon(MainFrame.class.getResource("/icons/64/chat-2-icon.png")));
		gbc_btnChat.insets = new Insets(0, 0, 5, 0);
		gbc_btnChat.gridx = 0;
		gbc_btnChat.gridy = 3;
		pnlLeft.add(btnChat, gbc_btnChat);
		
		JButton btnConfigurations = new JButton("");
		GridBagConstraints gbc_btnConfigurations = new GridBagConstraints();
		btnConfigurations.setIcon(new ImageIcon(MainFrame.class.getResource("/icons/64/settings-3-icon.png")));
		gbc_btnConfigurations.gridx = 0;
		gbc_btnConfigurations.gridy = 4;
		pnlLeft.add(btnConfigurations, gbc_btnConfigurations);
	}

}
