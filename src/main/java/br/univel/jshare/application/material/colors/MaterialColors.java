package br.univel.jshare.application.material.colors;

/**
 * Google material colors pallete
 * https://material.io/guidelines/style/color.html#color-color-palette
 *
 * @author aureo
 * @since 06/04/17.
 */
public enum MaterialColors {
    RED_50(0xFFEBEE),
    RED_100(0xFFCDD2),
    RED_200(0xEF9A9A),
    RED_300(0xE57373),
    RED_400(0xEF5350),
    RED_500(0xF44336),
    RED_600(0xE53935),
    RED_700(0xD32F2F),
    RED_800(0xC62828),
    RED_900(0xB71C1C),
    RED_A100(0xFF8A80),
    RED_A200(0xFF5252),
    RED_A400(0xFF1744),
    RED_A700(0xD50000),

    BLUE_50(0xE3F2FD),
    BLUE_100(0xBBDEFB),
    BLUE_200(0x90CAF9),
    BLUE_300(0x64B5F6),
    BLUE_400(0x42A5F5),
    BLUE_500(0x2196F3),
    BLUE_600(0x1E88E5),
    BLUE_700(0x1976D2),
    BLUE_800(0x1565C0),
    BLUE_900(0x0D47A1),
    BLUE_A100(0x82B1FF),
    BLUE_A200(0x448AFF),
    BLUE_A400(0x2979FF),
    BLUE_A700(0x2962FF),

    ORANGE_50(0xFFF3E0),
    ORANGE_100(0xFFE0B2),
    ORANGE_200(0xFFCC80),
    ORANGE_300(0xFFB74D),
    ORANGE_400(0xFFA726),
    ORANGE_500(0xFF9800),
    ORANGE_600(0xFB8C00),
    ORANGE_700(0xF57C00),
    ORANGE_800(0xEF6C00),
    ORANGE_900(0xE65100),
    ORANGE_A100(0xFFD180),
    ORANGE_A200(0xFFAB40),
    ORANGE_A400(0xFF9100),
    ORANGE_A700(0xFF6D00);

    private final Integer value;

    MaterialColors(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
