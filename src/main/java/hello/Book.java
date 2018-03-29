package hello;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Shera on 29.03.2018.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String authorName;
    private String authorSurname;
    private String summary;
    private Integer publicationYear;
    private Double rate;
    @ElementCollection
    private List<String> userEmails;
    private Genre genre;

    protected Book(){}

    public Book(String title, String authorName, String authorSurname,
                String summary, Integer publicationYear, Double rate,
                List<String> userEmails, Genre genre) {

        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.summary = summary;
        this.publicationYear = publicationYear;
        this.rate = rate;
        this.userEmails = userEmails;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public List<String> getUserEmails() {
        return userEmails;
    }

    public void setUserEmails(List<String> userEmails) {
        this.userEmails = userEmails;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
