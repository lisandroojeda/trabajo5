package ar.unrn.persistencia;

import ar.unrn.model.Item;
import ar.unrn.model.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersistirEnDB implements Persistencia {

    private Persistencia persistir;

    public  PersistirEnDB(Persistencia persistir) {
        this.persistir = persistir;
    }

    @Override
    public void guardarItem(List<Item> items) {
        Connection conexion;
        for (Item unItem : items) {
            try {
                conexion = obtenerConexion();
                PreparedStatement st = conexion.prepareStatement("Insert into publicaciones (user_id, id, titulo, cuerpo) values(?, ?, ?, ?)");
                st.setInt(1, unItem.getUserId());
                st.setInt(2, unItem.getId());
                st.setString(3, unItem.getTitle());
                st.setString(4, unItem.getBody());
                st.executeUpdate();
                st.close();
                conexion.close();
            } catch (SQLException e) {
                throw new RuntimeException("Error en volcado de Item", e);
            }
        }
    }
    private Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ejercicio4?useSSL=false";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }

}
