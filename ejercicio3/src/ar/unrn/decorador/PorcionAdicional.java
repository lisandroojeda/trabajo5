package ar.unrn.decorador;

public class PorcionAdicional implements Combo{


    private final Combo combo;
    private final String descripcion;
    private final Double precio;

    public PorcionAdicional(String descripcion,Double precio,Combo combo) {
        this.combo = combo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String obtenerDescripcion() {
        return this.combo.obtenerDescripcion()+ "\n" + this.descripcion;
    }

    @Override
    public Double obtenerPrecio() {
        return this.precio + this.combo.obtenerPrecio();
    }

}
