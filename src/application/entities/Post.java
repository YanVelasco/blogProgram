package application.entities;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comment> comments = new ArrayList<>(); 
}
