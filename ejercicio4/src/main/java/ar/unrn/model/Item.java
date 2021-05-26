package ar.unrn.model;

public class Item {

    private int userId;
    private int id;
    private String title;
    private String body;

    public Item(int userId, int id, String titulo, String cuerpo) {
        this.userId = userId;
        this.id = id;
        this.title = titulo;
        this.body = cuerpo;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
