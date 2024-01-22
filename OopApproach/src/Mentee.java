public class Mentee extends Mentor{
    public String comment;

    public Mentee(String emptyComment, String newName, int age, String newAddress, String username, String password) {
        super(newName, age, newAddress, username, password);
        comment = emptyComment;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
