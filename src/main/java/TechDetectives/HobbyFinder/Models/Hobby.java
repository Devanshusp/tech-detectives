package TechDetectives.HobbyFinder.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Hobby extends AbstractEntity {

    @ManyToOne
    private Category category;
    private String description;
    private String location;

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }

    @OneToMany
    @JoinColumn(name = "hobby_id")
    private List<PostModel> posts = new ArrayList<>();

    public Hobby() {

    }

    public Hobby(Category aCategory) {
        super();
        this.category = aCategory;

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

