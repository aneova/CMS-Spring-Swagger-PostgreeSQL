package CMS.cms.models;

import lombok.Data;

import java.util.Set;

@Data
public class News {
    String id;
    String title;
    String content;
    User author;
    Set<User> mandatoryReviewers;
    Set<Review> reviewers;
    Set<Category> categories;
    Set<Tag> tags;

    public Review review (String userID, String status)
    {
        final Review review = new Review(userID, status);
        this.reviewers.add(review);
        return review;
    }

    public Boolean revised(){
        return this.mandatoryReviewers.stream().allMatch(
                reviewer-> this.reviewers.stream().anyMatch(
                review -> reviewer.id.equals(review.userId)
                 && "approved".equals(review.status))
                );
    }
}
