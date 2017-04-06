package br.univel.jshare.application.logger;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.swing.*;

/**
 * Exibe alertas para o usuário
 * @author aureo
 * @since 06/04/17.
 */
public class SystemAlert {
    private static final Logger LOG = LogManager.getLogger(SystemAlert.class);

    /**
     * Exibe mensagem de alerta para o usuário
     * @param s string key, será trocada pela string de acrodo com local
     * @param alert {@code EnumAlertTypes} Enum com o tipo de alerta
     */
    public void alert(String s, EnumAlertTypes alert) {
        LOG.warn(s);
        JOptionPane.showMessageDialog(null,s,"message.warning.title",1);
    }
}
