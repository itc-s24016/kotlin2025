package APP;

public class User {
    private String name;
    private Note note;

    public User(String name) {
        this.name = name;
        this.note = new Note(this); // User作成時にNoteインスタンスも作成
    }

    public String getName() {
        return name;
    }

    public Note getNote() {
        return note;
    }
}
