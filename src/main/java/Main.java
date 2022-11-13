import my.idea.list.Post;
import my.idea.list.FormDate;

public class Main {

    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Александр";
        post.passport = "1234 № 567890";
        post.patronymic = "Николаевич";
        post.phone = "+7 (929) 123-45-67";
        post.surname = "Веденеев";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = "июнь";
        post.birthday.year = 1981;

    }

}