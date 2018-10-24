package inherits.forumUser;

public class Application {
    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser(true, "30", "Kris", "Krzysiek",
                "Kozlowski", "Mezczyzna", "23", "krzychu@o2.pl");

        String name = forumUser.getName();
        String surname = forumUser.getSurname();
        String sex = forumUser.getSex();
        String age = forumUser.getAge();
        String mail = forumUser.getMail();
        String nick = forumUser.getNick();
        String posts = forumUser.getPosts();
        Boolean logged = forumUser.getLogged();

        System.out.println("Moje imie to "+ name +" a nazwisko to "+surname+"."+" Mam "+age+" lat. Jestem "+sex+
                ". Moj nick to "+nick+" ,zas email to: "+mail+". Opublikowalem "+posts+" postow. Zalogowany? "+logged );
    }

}
