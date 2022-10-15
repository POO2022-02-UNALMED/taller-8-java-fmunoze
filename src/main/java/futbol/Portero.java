package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    public Boolean jugarConLasManos() {return true;}
    // toString
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }
    @Override
    public int compareTo(Futbolista o) {
        Portero p = (Portero) o;
        return Math.abs(this.golesRecibidos - p.golesRecibidos);
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
}
