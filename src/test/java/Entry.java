import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;
@JsonRootName("Entry")
public class Entry {
    @JsonProperty
    String title;
    @JsonProperty
    String link;
    @JsonProperty
    String author;
    @JsonProperty
    String publishedDate;
    @JsonProperty
    String contentSnippet;
    @JsonProperty
    String content;
    @JsonProperty
    List<String> categories;

    public Entry() {
    }

    public Entry(String title, String link, String author, String publishedDate, String contentSnippet, String content, List<String> categories) {
        this.title = title;
        this.link = link;
        this.author = author;
        this.publishedDate = publishedDate;
        this.contentSnippet = contentSnippet;
        this.content = content;
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getContesntSnippet() {
        return contentSnippet;
    }

    public void setContesntSnippet(String contesntSnippet) {
        this.contentSnippet = contesntSnippet;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", contentSnippet='" + contentSnippet + '\'' +
                ", content='" + content + '\'' +
                ", categories=" + categories +
                '}';
    }

}
