package Funcoes;

import java.awt.Color;
import javax.swing.JLabel;

public class EventosBotoes {

//    public static void efeitoBotoes(String bt1, String bt2, String bt3, String bt4, 
//            String bt5, String bt6, String bt7, String bt8, String bt9, String bt10) {
//
//        setLblColor(bt1);
//        resetLblColor(bt2);
//        resetLblColor(bt3);
//        resetLblColor(bt4);
//        resetLblColor(bt5);
//        resetLblColor(bt6);
//        resetLblColor(bt7);
//        resetLblColor(bt8);
//        resetLblColor(bt9);
//        resetLblColor(bt10);
//    }

    public static void setLblColor(JLabel lbl) {

        lbl.setBackground(new Color(0, 2, 61));
    }

    public static void resetLblColor(JLabel lbl) {

        lbl.setBackground(new Color(1, 6, 167));
    }

    public static void setExitLblColor(JLabel lbl) {

        lbl.setBackground(new Color(204, 0, 0));
    }

    public static void setLblColorHover(JLabel lbl) {

        lbl.setBackground(new Color(0, 51, 153));
    }

//    private static void setLblColor(String bt1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static void resetLblColor(String bt2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
