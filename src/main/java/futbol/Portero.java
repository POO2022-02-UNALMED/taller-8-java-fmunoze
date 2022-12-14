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
		String txt = "El futbolista " + getNombre() +" tiene " + getEdad() + ", y juega de "  + getPosicion() +  " con el dorsal "+ this.dorsal + ". Le han marcado "+ this.golesRecibidos;
		return txt;
	}
	public boolean jugarConLasManos() {
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
    public int compareTo(Object o) {
        if(this.golesRecibidos == ((Portero) o).golesRecibidos){return 0;}
        else if (this.golesRecibidos> ((Portero) o).golesRecibidos){return this.golesRecibidos - ((Portero) o).golesRecibidos;}
        else {return ((Portero) o).golesRecibidos - this.golesRecibidos;}
    }
}
