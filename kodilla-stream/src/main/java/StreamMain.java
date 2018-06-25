import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

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

       Forum forum = new Forum(initList());

       Map<Integer, ForumUser> theResultOfFilteringForumUsers = forum.getUsersList().stream()
               .filter(forumUser -> forumUser.getSex() == 'M' && forumUser.getPublicatedPosts() >= 1 &&
                       forumUser.getBirthDate().isBefore(LocalDate.now().minus(20, ChronoUnit.YEARS)))
               .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

       System.out.println("# elements: " + theResultOfFilteringForumUsers.size());
       theResultOfFilteringForumUsers.entrySet().stream()
               .map(entry -> entry.getKey() + ": " + entry.getValue())
               .forEach(System.out::println);
    }

}