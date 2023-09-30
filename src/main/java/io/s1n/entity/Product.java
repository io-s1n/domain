package io.s1n.entity;

import io.s1n.value.Brand;
import io.s1n.value.Certification;
import io.s1n.value.Country;
import io.s1n.value.Date;
import io.s1n.value.Description;
import io.s1n.value.Dimensions;
import io.s1n.value.Group;
import io.s1n.value.Image;
import io.s1n.value.Material;
import io.s1n.value.Policy;
import io.s1n.value.Price;
import io.s1n.value.ProductID;
import io.s1n.value.Video;
import io.s1n.value.Weight;
import java.util.List;

public final class Product {
  private final ProductID productID;
  private final Brand brand;
  private final Group group;
  private final Country country;
  private final Certification certification;
  private final Dimensions dimensions;
  private final List<Date> dates;

  private final List<Weight> weights;
  private final List<Price> prices;

  private final List<Material> materials;

  private final List<Policy> policies;

  private final List<Image> images;

  private final List<Video> videos;

  private final List<Description> descriptions;

  private Product(Builder builder) {
    productID = builder.productID;
    brand = builder.brand;
    group = builder.group;
    country = builder.country;
    certification = builder.certification;
    dimensions = builder.dimensions;
    dates = builder.dates;
    weights = builder.weights;
    prices = builder.prices;
    materials = builder.materials;
    policies = builder.policies;
    images = builder.images;
    videos = builder.videos;
    descriptions = builder.descriptions;
  }

  public ProductID getProductID() {
    return productID;
  }

  public Brand getBrand() {
    return brand;
  }

  public Group getGroup() {
    return group;
  }

  public Country getCountry() {
    return country;
  }

  public Certification getCertification() {
    return certification;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public List<Date> getDates() {
    return dates;
  }

  public List<Weight> getWeights() {
    return weights;
  }

  public List<Price> getPrices() {
    return prices;
  }

  public List<Material> getMaterials() {
    return materials;
  }

  public List<Policy> getPolicies() {
    return policies;
  }

  public List<Image> getImages() {
    return images;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public List<Description> getDescriptions() {
    return descriptions;
  }

  public static final class Builder {

    private ProductID productID;
    private Brand brand;
    private Group group;
    private Country country;
    private Certification certification;
    private Dimensions dimensions;
    private List<Date> dates;
    private List<Weight> weights;
    private List<Price> prices;
    private List<Material> materials;
    private List<Policy> policies;
    private List<Image> images;
    private List<Video> videos;
    private List<Description> descriptions;

    private Builder() {
    }

    public static Builder builder() {
      return new Builder();
    }

    public Builder productID(ProductID val) {
      productID = val;
      return this;
    }

    public Builder brand(Brand val) {
      brand = val;
      return this;
    }

    public Builder group(Group val) {
      group = val;
      return this;
    }

    public Builder country(Country val) {
      country = val;
      return this;
    }

    public Builder certification(Certification val) {
      certification = val;
      return this;
    }

    public Builder dimensions(Dimensions val) {
      dimensions = val;
      return this;
    }

    public Builder dates(List<Date> val) {
      dates = val;
      return this;
    }

    public Builder weights(List<Weight> val) {
      weights = val;
      return this;
    }

    public Builder prices(List<Price> val) {
      prices = val;
      return this;
    }

    public Builder materials(List<Material> val) {
      materials = val;
      return this;
    }

    public Builder policies(List<Policy> val) {
      policies = val;
      return this;
    }

    public Builder images(List<Image> val) {
      images = val;
      return this;
    }

    public Builder videos(List<Video> val) {
      videos = val;
      return this;
    }

    public Builder descriptions(List<Description> val) {
      descriptions = val;
      return this;
    }

    public Product build() {
      return new Product(this);
    }
  }
}
