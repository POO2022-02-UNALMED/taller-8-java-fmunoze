package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	@Override
	public String toString() {
		
		String txt = "El futbolista " + getNombre() +" tiene " + getEdad() + ", y juega de "  + getPosicion() +  " con el dorsal "+ dorsal + ". Ha marcado "+ golesMarcados;
		
		return txt;
	}
	@Override
	public Boolean jugarConLasManos() {
		return false;
	}
	public short getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

    @Override
    public int compareTo(Object o) {
		Futbolista f = (Futbolista) o;
		int dif = this.getEdad() - f.getEdad();
		return Math.abs(dif);
    }
}
