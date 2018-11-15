package inherits.forumUser;

public class ForumUser extends User {

    private String nick;
    private String posts;
    private Boolean logged;

    public ForumUser(Boolean logged, String posts, String nick, String name,
                     String surname, String sex, String age, String mail) {
        super(name, surname, sex, age, mail);
        this.nick = nick;
        this.posts = posts;
        this.logged = logged;
    }

    public Boolean getLogged() {
        return this.logged;
    }

    public String getPosts() {
        return this.posts;
    }

    public String getNick() {
        return this.nick;
    }

    public void addPost() {
    }

    public void deletePost() {
    }

    public void comment() {
    }

    public void aboutUser() {
    }

}
