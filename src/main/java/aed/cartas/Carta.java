package cartas;

/**
 * Clase que representa una carta de la baraja. 
 * Deberiamos probablemente usar un enum en vez de un int.
 */
public class Carta {
	/**
	 * Identifica el palo al que pertenece la carta
	 */
	private int palo;
	
	/**
	 * Identifica el valor numerico de la carta (1,2,3,...10). Las figuras tambien se 
	 * identifican de forma numerica 
	 */
	private int valor;

        private final static int pica = 0;
        private final static int corazon = 1;
        private final static int diamante = 2;
        private final static int trebol = 3;

        /**
         * Deberiamos usar un enum pero por ahora no.
         */
	public Carta(int palo, int valor) {
		if (palo < 0 || palo > 3) throw new RuntimeException();
		if (valor < 1 || valor > 10) throw new RuntimeException();
		this.palo = palo;
		this.valor = valor;
	}

        static public Carta pica(int valor) {
	    return new Carta(pica,valor);
        }

        static public Carta corazon(int valor) {
	    return new Carta(corazon,valor);
        }

        static public Carta diamante(int valor) {
	    return new Carta(diamante,valor);
        }

        static public Carta trebol(int valor) {
	    return new Carta(trebol,valor);
        }

	public boolean isPica() {
		return this.palo == pica;
	}

	public boolean isCorazon() {
		return this.palo == corazon;
	}

	public boolean isDiamante() {
		return this.palo == diamante;
	}

	public boolean isTrebol() {
		return this.palo == trebol;
	}

	public int getPalo() {
		return this.palo;
	}

	public int getValor() {
		return this.valor;
	}

	public String toString() {
	        return valor + " de " + Carta.paloString(this.palo);
	}

        static public String paloString(int palo) {
	    switch (palo) {
	    case pica: return "pica";
	    case corazon: return "corazon";
	    case diamante: return "diamante";
	    case trebol: return "trebol";
	    default: throw new RuntimeException("paloString("+palo+")");
	    }
	}

        public boolean equals(Object o) {
	    if (this == o) return true;
	    else if (o instanceof Carta) {
		Carta otherCarta = (Carta)o;
		return
		    (getPalo()==otherCarta.getPalo())
		    && (getValor()==otherCarta.getValor());		    
	    } else return false;
        }
}
