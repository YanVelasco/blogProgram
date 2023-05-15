package application.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comment> comments = new ArrayList<>(); 

    public Post(){
    }


    public Post(Date moment, String title, String content, Integer likes, ArrayList<Comment> comments) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return this.comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public Post moment(Date moment) {
        setMoment(moment);
        return this;
    }

    public Post title(String title) {
        setTitle(title);
        return this;
    }

    public Post content(String content) {
        setContent(content);
        return this;
    }

    public Post likes(Integer likes) {
        setLikes(likes);
        return this;
    }

    public Post comments(ArrayList<Comment> comments) {
        setComments(comments);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Post)) {
            return false;
        }
        Post post = (Post) o;
        return Objects.equals(moment, post.moment) && Objects.equals(title, post.title) && Objects.equals(content, post.content) && Objects.equals(likes, post.likes) && Objects.equals(comments, post.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moment, title, content, likes, comments);
    }

    @Override
    public String toString() {
        return "{" +
            " moment='" + getMoment() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", likes='" + getLikes() + "'" +
            ", comments='" + getComments() + "'" +
            "}";
    }
    

}
