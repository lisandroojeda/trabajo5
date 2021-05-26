package ar.unrn.test;

import ar.unrn.model.ComprobarReporte;
import ar.unrn.model.Exportable;
import ar.unrn.model.Reporte;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestExporteDeReportes {
    private static final File documento = new File("./reporte.txt");
    private static final String mensajeEsperado = "Mensaje de reporte de ejemplo";
    @Test
   public void exportarReporteReescribiendo() throws IOException {
        Exportable reporte = new Reporte(mensajeEsperado);
        reporte.exportar(documento);
        try (BufferedReader reader = new BufferedReader(new FileReader("./reporte.txt"))) {
            assertEquals(mensajeEsperado, reader.readLine()
            );
        }
    }

    @Test
    public void ExportarReporteSinReescribir() {
        Exportable reporte = new ComprobarReporte(new Reporte(mensajeEsperado));
        assertThrows(IllegalArgumentException.class, () -> reporte.exportar(documento));
    }
}
