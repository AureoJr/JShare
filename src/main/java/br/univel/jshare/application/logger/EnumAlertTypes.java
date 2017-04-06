package br.univel.jshare.application.logger;

import br.univel.jshare.application.material.colors.MaterialColors;

/**
 * @author aureo
 * @since 06/04/17.
 */
public enum EnumAlertTypes {

    WARNING("alert.warning", MaterialColors.ORANGE_600),
    ERROR("alert.error", MaterialColors.RED_600),
    INFO("alert.info", MaterialColors.ORANGE_600),
    DEFAULT("alert.warning", MaterialColors.ORANGE_600);

    private final String key;
    private final MaterialColors value;

    EnumAlertTypes(String key, MaterialColors value){
        this.key = key;
        this.value = value;
    }
}
