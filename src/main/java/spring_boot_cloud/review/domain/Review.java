package spring_boot_cloud.review.domain;

import lombok.Builder;
import lombok.Data;
import spring_boot_cloud.product.domain.entity.Product;

@Data
@Builder
public class Review {

    private Long id;
    private String comment;
    private String score;

    private Product product;
}
