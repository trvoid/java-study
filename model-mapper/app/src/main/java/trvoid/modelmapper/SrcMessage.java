package trvoid.modelmapper;

public class SrcMessage {
    private String name;
    private String type;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return String.format("SrcMessage[name:%s, type:%s, title:%s]", getName(), getType(), getTitle());
    }
}
