import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;
@JsonRootName("Feed")
public class Feed {
    @JsonProperty
   String feedUrl;
    @JsonProperty
   String title;
    @JsonProperty
   String link;
    @JsonProperty
   String author;
    @JsonProperty
   String description;
    @JsonProperty
   String type;
    @JsonProperty("entries")
   List<Entry> entriesList;

    public Feed() {
    }

    public Feed(String feedUrl, String title, String link, String author, String description, String type, List<Entry> entriesList) {
        this.feedUrl = feedUrl;
        this.title = title;
        this.link = link;
        this.author = author;
        this.description = description;
        this.type = type;
        this.entriesList = entriesList;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Entry> getEntriesList() {
        return entriesList;
    }

    public void setEntriesList(List<Entry> entriesList) {
        this.entriesList = entriesList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Entry entry:entriesList){
            stringBuilder =  stringBuilder.append(entry.toString());
        }
        return "Feed{" +
                "feedUrl='" + feedUrl + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", entriesList=" + entriesList.toString() +
                '}'+ stringBuilder.toString();
    }
}
