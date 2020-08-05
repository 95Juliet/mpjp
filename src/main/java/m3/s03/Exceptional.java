package m3.s03;

public class Exceptional {
    //Il metodo f() chiama il metodo g()
	public void f() {
        // ...

        // ...
        try {
            g();
        } catch (Exception ex) {
            //Avviso per aver incontrato l'eccezione di tipo Exception
        	System.out.println("Exception caught");
        } finally {
            cleanup();
        }
    }

    public void g() throws Exception {
        // ...
    	//somethingUnexpected() ritorna sempre true
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }
    
    //Questo metodo viene sempre eseguito
    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        //Creazione oggetto di tipo Exceptional, cioè della classe stessa che contiene il main
    	Exceptional exceptional = new Exceptional();
        //Chiamata metodo f() sull'oggetto appena creato
    	exceptional.f();

    	//Diversa gestione dell'eccezione
        try {
            exceptional.g();
            //g() tira l'eccezione
        } catch (Exception e) {
            //Stampa la storia dell'eccezione
        	e.printStackTrace();
        } //finally non è obbligatorio
    }
}
