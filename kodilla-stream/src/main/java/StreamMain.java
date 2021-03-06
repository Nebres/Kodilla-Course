import com.kodilla.spring.stream.beautifier.PoemBeautifier;
import com.kodilla.spring.stream.forumuser.Forum;
import com.kodilla.spring.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public final static List<ForumUser> initList() {

        List<ForumUser> users = new ArrayList<>();

        users.add(new ForumUser(1, "Jan", 'M',
                LocalDate.of(1980,10,1),12));
        users.add(new ForumUser(2, "Ewelina", 'F',
                LocalDate.of(1988,1,30),3));
        users.add(new ForumUser(3, "Karolina", 'F',
                LocalDate.of(1999,5,3),21));
        users.add(new ForumUser(4, "Krzysztof", 'M',
                LocalDate.of(1979,12,12),1));
        users.add(new ForumUser(5, "Izydor", 'M',
                LocalDate.of(1998,6,25),1));
        users.add(new ForumUser(6, "Aleksandra", 'F',
                LocalDate.of(1982,2,12),0));
        users.add(new ForumUser(7, "Maciej", 'M',
                LocalDate.of(2001,11,11),4));
        users.add(new ForumUser(8, "Grzegorz", 'M',
                LocalDate.of(2005,1,23),31));
        users.add(new ForumUser(9, "Krystyna", 'F',
                LocalDate.of(1960,7,31),2));
        users.add(new ForumUser(10, "Szymon", 'M',
                LocalDate.of(2000,12,30),15));

        return users;
    }

    public static void main(String[] args) {

        // task 7.1
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("example text", text -> text.toUpperCase());
        beautifier.beautify("another text", text -> text
                .substring(text.length() < 3 ? 0 : text.length()/ 2 + 2)
                .replace('t', 'T'));
        beautifier.beautify("one more time", text -> "".concat("..::||" ).concat(text).concat("||::.."));

        // task 7.4
        Forum forum = new Forum(initList());

        Map<Integer, ForumUser> theResultOfFilteringForumUsers = forum.getUsersList()
                .stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPublicatedPosts() >= 1)
                .filter(forumUser -> forumUser.getBirthDate()
                        .isBefore(LocalDate.now().minus(20, ChronoUnit.YEARS)))
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultOfFilteringForumUsers.size());
        theResultOfFilteringForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}