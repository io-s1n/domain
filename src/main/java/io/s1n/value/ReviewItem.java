package io.s1n.value;

import java.util.Date;
import java.util.List;

public final class ReviewItem {
  private final Snippet snippet;
  private final Date date;
  private final Reviewer reviewer;
  private final Rating rating;
  private final Description description;
  private final List<Integer> positive;
  private final List<Integer> negative;
  private final List<Image> images;

  private ReviewItem(Builder builder) {
    snippet = builder.snippet;
    date = builder.date;
    reviewer = builder.reviewer;
    rating = builder.rating;
    description = builder.description;
    positive = builder.positive;
    negative = builder.negative;
    images = builder.images;
  }

  public Snippet getSnippet() {
    return snippet;
  }

  public Date getDate() {
    return date;
  }

  public Reviewer getReviewer() {
    return reviewer;
  }

  public Rating getRating() {
    return rating;
  }

  public Description getDescription() {
    return description;
  }

  public List<Integer> getPositive() {
    return positive;
  }

  public List<Integer> getNegative() {
    return negative;
  }

  public List<Image> getImages() {
    return images;
  }

  public static final class Builder {

    private Snippet snippet;
    private Date date;
    private Reviewer reviewer;
    private Rating rating;
    private Description description;
    private List<Integer> positive;
    private List<Integer> negative;
    private List<Image> images;

    private Builder() {
    }

    public static Builder builder() {
      return new Builder();
    }

    public Builder snippet(Snippet val) {
      snippet = val;
      return this;
    }

    public Builder date(Date val) {
      date = val;
      return this;
    }

    public Builder reviewer(Reviewer val) {
      reviewer = val;
      return this;
    }

    public Builder rating(Rating val) {
      rating = val;
      return this;
    }

    public Builder description(Description val) {
      description = val;
      return this;
    }

    public Builder positive(List<Integer> val) {
      positive = val;
      return this;
    }

    public Builder negative(List<Integer> val) {
      negative = val;
      return this;
    }

    public Builder images(List<Image> val) {
      images = val;
      return this;
    }

    public ReviewItem build() {
      return new ReviewItem(this);
    }
  }
}
