package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
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
    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados;
    }
    @Override
    public int compareTo(Futbolista o) {
        Futbolista f = (Futbolista) o;
        return Math.abs(this.getEdad() - f.getEdad());
    }
    public Boolean jugarConLasManos(){return false;}
}
