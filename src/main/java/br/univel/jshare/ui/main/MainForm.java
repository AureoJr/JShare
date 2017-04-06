package br.univel.jshare.ui.main;

import br.univel.jshare.application.windowmanager.WindowManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author aureo
 * @since 04/04/17.
 */
public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JPanel systemOptions;
    private JButton btnDownloads;
    private JButton btnUploads;
    private JButton btnProfile;
    private JButton btnStatistics;
    private JButton btnSettings;
    private JPanel centerPage;

    public MainForm(){
        super("Teste");
        pack();
        setSize(800,600);
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnDownloads.addActionListener(WindowManager.openWindow("download",centerPage));
        btnUploads.addActionListener(WindowManager.openWindow("uploads",centerPage));
        btnProfile.addActionListener(WindowManager.openWindow("profile",centerPage));
        btnStatistics.addActionListener(WindowManager.openWindow("statistics",centerPage));
        btnProfile.addActionListener(WindowManager.openWindow("profile",centerPage));

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
