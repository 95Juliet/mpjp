package m3.s20;

import java.util.Locale;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JUL {
    public static void someLog() {

        Logger log = Logger.getLogger("sample");

        log.finest("finest message");
        log.finer("finer message");
        log.fine("fine message");
        log.config("config message");
        log.info("info message");
        log.warning("warning message");
        log.severe("severe message");
    }

    public static void main(String[] args) {
        //Creazione nuovo Locale per cambiare lingua
    	Locale.setDefault(new Locale("en", "EN"));
        Logger log = Logger.getLogger("sample");

        //Con questa chiamata si ha la stampa solo da info in poi
        someLog();

        //Configurazione: viene impostato di stampare tutto
        //Il livello di stampa può essere impostato: da tutto a nulla
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        log.setLevel(Level.ALL);
        log.addHandler(handler);
        log.setUseParentHandlers(false);

        //Ora vengono stampati tutti da finest
        someLog();
        
        //Solitamente il Log è agganciato a un File
    }
}
