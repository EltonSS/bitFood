package Funcoes;

import java.awt.event.KeyEvent;

public class TratamentoCampos {

    public void soLetras(java.awt.event.KeyEvent evt) {
        //OBS: ESSA FUNÇÃO SÓ FUNCIONA NO EVENTO KEYTYPED DO TEXTFIELD
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')
                && c != 'á' //Minúsculas             
                && c != 'ã'
                && c != 'â'
                && c != 'é'
                && c != 'ê'
                && c != 'í'
                && c != 'ó'
                && c != 'õ'
                && c != 'ô'
                && c != 'ú'
                && c != 'ç'
                && c != 'Á' //Mayúsculas             
                && c != 'Ã'
                && c != 'Â'
                && c != 'É'
                && c != 'Ê'
                && c != 'Í'
                && c != 'Ó'
                && c != 'Õ'
                && c != 'Ô'
                && c != 'Ú'
                && c != 'Ç'
                && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    public void soNumeros(java.awt.event.KeyEvent evt) {
        //OBS: ESSA FUNÇÃO SÓ FUNCIONA NO EVENTO KEYTYPED DO TEXTFIELD
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }

    public void NumeroLetras(java.awt.event.KeyEvent evt) {
        //OBS: ESSA FUNÇÃO SÓ FUNCIONA NO EVENTO KEYTYPED DO TEXTFIELD
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')
                && c != 'á' //Minúsculas             
                && c != 'ã'
                && c != 'â'
                && c != 'é'
                && c != 'ê'
                && c != 'í'
                && c != 'ó'
                && c != 'õ'
                && c != 'ô'
                && c != 'ú'
                && c != 'ç'
                && c != 'Á' //Mayúsculas             
                && c != 'Ã'
                && c != 'Â'
                && c != 'É'
                && c != 'Ê'
                && c != 'Í'
                && c != 'Ó'
                && c != 'Õ'
                && c != 'Ô'
                && c != 'Ú'
                && c != 'Ç'
                && (c < '0' || c > '9')
                && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }
}
