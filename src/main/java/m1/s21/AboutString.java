package m1.s21;

public class AboutString {
    
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3); //la posizione 3 viene esclusa: considera le posizioni 1 e 2
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); //substring: se chiamata con un solo parametro parte da lì e va avanti fino alla fine

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2)); //così sto chiedendo se sono lo stesso oggetto, non se hanno lo stesso contenuto

        System.out.println("First index of 'l' is s: " + s.indexOf('l')); //ritorna la posizione della prima l
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l')); //ritorna la posizione dell'ultima l
        System.out.println("there is no 'x' in s: " + s.indexOf('x')); //ritorna -1
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); //sto creando una stringa vuota e chiamo il metodo isEmpty
        // String x = new String("");
        // x.isEmpty();

        System.out.println("s length: " + s.length()); //se ritorna 0 la stringa è vuota
        //per un array length è una proprietà, non un metodo -> niente parentesi tonde
        
        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" "); //ottengo una serie di stringhe determinate dal separatore spazio
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); //come collante usa lo spazio, ma potrei usare anche _
        //Il metodo join viene chiamato sulla classe String -> è un metodo statico, quindi non lavora su un singolo oggetto

//        String joined = String.join(" ", "a", "b", "c");
        System.out.println("Joining back [" + joined + "]");

        String myS = s.toUpperCase();
        System.out.println("upper: " + myS);
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]"); //elimina gli spazi bianchi esterni

        String x = null; //null = finto reference
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
        //toString converte le variabili in stringhe. Non funziona bene se il reference su cui sto lavorando è un null
    }
}
