package io.s1n.entity;

import io.s1n.value.NumberOfReview;
import io.s1n.value.ProductID;
import io.s1n.value.Rating;
import io.s1n.value.ReviewID;
import io.s1n.value.ReviewItem;
import java.util.List;
import java.util.Map;

public class Review {
  private final ProductID productID;
  private final ReviewID reviewID;
  private final NumberOfReview numberOfReviews;
  private final List<ReviewItem> reviewItemList;
  private final Map<String, Rating> ratingList;

  private Review(Builder builder) {
    productID = builder.productID;
    reviewID = builder.reviewID;
    numberOfReviews = builder.numberOfReviews;
    reviewItemList = builder.reviewItemList;
    ratingList = builder.ratingList;
  }

  public ProductID getProductID() {
    return productID;
  }

  public ReviewID getReviewID() {
    return reviewID;
  }

  public NumberOfReview getNumberOfReviews() {
    return numberOfReviews;
  }

  public List<ReviewItem> getReviewItemList() {
    return reviewItemList;
  }

  public Map<String, Rating> getRatingList() {
    return ratingList;
  }


  public static final class Builder {

    private ProductID productID;
    private ReviewID reviewID;
    private NumberOfReview numberOfReviews;
    private List<ReviewItem> reviewItemList;
    private Map<String, Rating> ratingList;

    public Builder() {
    }

    public Builder productID(ProductID val) {
      productID = val;
      return this;
    }

    public Builder reviewID(ReviewID val) {
      reviewID = val;
      return this;
    }

    public Builder numberOfReviews(NumberOfReview val) {
      numberOfReviews = val;
      return this;
    }

    public Builder reviewItemList(List<ReviewItem> val) {
      reviewItemList = val;
      return this;
    }

    public Builder ratingList(Map<String, Rating> val) {
      ratingList = val;
      return this;
    }

    public Review build() {
      return new Review(this);
    }
  }
}
