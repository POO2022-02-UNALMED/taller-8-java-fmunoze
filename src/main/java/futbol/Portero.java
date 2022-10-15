package futbol;

public class Portero extends Futbolista {
	
	public short golesRecibidos;
	public byte dorsal;
	
	
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		
		String txt = "El futbolista " + getNombre() +" tiene " + getEdad() + ", y juega de "  + getPosicion() +  " con el dorsal "+ dorsal + ". Le han marcado "+ golesRecibidos;
		
		return txt;
	}
	public Boolean jugarConLasManos() {
		return true;
	}
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

    @Override
    public int compareTo(Futbolista o) {
		Portero p = (Portero) o;
		int dif = this.golesRecibidos - p.golesRecibidos;
		return Math.abs(dif);
    }
}
