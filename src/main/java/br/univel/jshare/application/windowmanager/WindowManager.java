package br.univel.jshare.application.windowmanager;

import br.univel.jshare.application.logger.EnumAlertTypes;
import br.univel.jshare.application.logger.SystemAlert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Gerencia as Janelas que serão exibidas nas views, utilizando
 * cache para algumas telas
 *
 * @author aureo
 * @since 05/04/17.
 */
public class WindowManager {

    /**
     * cache para as janelas que serão exibidas no sistema
     */
    private static final Map<String, JPanel> windowCache = new HashMap<>();

    public static ActionListener openWindow(String key, JPanel parentComponent){
        return e -> verifyWindow(key,parentComponent);
    }


    /**
     * Verifica se a janela foi registrada no sistema por meio do método #registerWindown
     * caso ele não encotre a janela uma excessão será lançada e um alerta será exibido
     *
     * @param windowKey chave para buscar a janela no cache
     * @param parent componente pai
     */
    private static void verifyWindow(String windowKey, JPanel parent){
        if(!windowCache.containsKey(windowKey)){
            new SystemAlert().alert("message.window.withoutRegister", EnumAlertTypes.WARNING);
            return;
        }
    }

}
