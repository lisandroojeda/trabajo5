package ar.unrn.model;

import java.io.File;
import java.util.Objects;

public class ComprobarReporte implements Exportable{


    private final Reporte reporte;

    public ComprobarReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        Objects.requireNonNull(file);
        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe...");
        }
        reporte.exportar(file);
    }
}
