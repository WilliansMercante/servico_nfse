package com.github.williansmercante.serviconfse.utils;

import org.apache.commons.text.StringEscapeUtils;

public class CaracteresEspeciaisUtils {

    // Caracteres especiais que geram erro
    private static String MAIOR = "&gt;";
    private static String MENOR = "&lt;";
    private static String E_COMERCIAL = "&amp;";
    private static String ASPAS = "&quot;";
    private static String APOSTROFE = "&apos;";

    public static String removerCaracteresEspeciais(String texto) {
        if (texto == null) {
            return null;
        }
        return StringEscapeUtils.escapeXml11(texto);
    }

    public static String adicionarCaracteresEspeciais(String texto) {
        if (texto == null) {
            return null;
        }
        return StringEscapeUtils.unescapeXml(texto);
    }


    public static void main(String[] args) {
        String original = "5 > 3 & 2 < 4 \"aspas\" 'apóstrofo'";

        String escapado = CaracteresEspeciaisUtils.removerCaracteresEspeciais(original);
        System.out.println("Escapado: " + escapado);

        String recuperado = CaracteresEspeciaisUtils.adicionarCaracteresEspeciais(escapado);
        System.out.println("Unescape: " + recuperado);
    }
}
