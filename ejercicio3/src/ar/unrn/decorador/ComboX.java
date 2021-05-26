package ar.unrn.decorador;

public class ComboX implements Combo {

    private final String descripcion;
    private final Double precio;

    public ComboX(String descripcio, Double precio) {
        this.precio = precio;
        this.descripcion = descripcio;
    }


    @Override
    public String obtenerDescripcion() {
        return this.descripcion;

    }

    @Override
    public Double obtenerPrecio() {
        return this.precio;
    }
}