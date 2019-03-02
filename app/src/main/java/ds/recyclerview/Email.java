package ds.recyclerview;

public class Email {

    private String sender;
    private String email;
    private String message;
    private int image;

    public Email(String sender, String email, String message, int image) {
        this.sender = sender;
        this.email = email;
        this.message = message;
        this.image = image;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
