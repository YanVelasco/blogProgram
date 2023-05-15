package application;

import java.text.SimpleDateFormat;

import application.entities.Comment;
import application.entities.Post;

public class Program {
    public static void main(String[] args) throws Exception {
        // Passando um data para Sting
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that`s aweaome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to the New Zelasnd", "I`m going to visit this wonderful country", 12);
        Post p2 = new Post(sdf.parse("20/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
        p1.addComment(c1);
        p1.addComment(c2);
        p2.addComment(c1);
        p2.addComment(c2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
