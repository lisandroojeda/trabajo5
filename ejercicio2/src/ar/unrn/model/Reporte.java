package ar.unrn.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Reporte implements Exportable{

    private final String reporte;

    public Reporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        Objects.requireNonNull(file);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(reporte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
