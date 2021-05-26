package ar.unrn.persistencia;

import ar.unrn.model.Item;
import ar.unrn.model.Persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersistirEnTexto implements Persistencia {

    private final File file;

    public PersistirEnTexto(String file){
     this.file = new File (file);
    }

    @Override
    public void guardarItem(List<Item> items) {
        for (Item unItem: items ){
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(file,true))){
            escribir.write(
                    unItem.getUserId()+", "+unItem.getId()+", "+unItem.getBody()+", "+unItem.getTitle()
            );

        }catch (IOException e){
            throw new RuntimeException("Inconveniente en el volcado de datos");
        }
    }
    }



}
