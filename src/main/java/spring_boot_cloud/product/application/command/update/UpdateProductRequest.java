package spring_boot_cloud.product.application.command.update;

import lombok.Data;
import spring_boot_cloud.common.application.mediator.Request;
import spring_boot_cloud.review.domain.Review;

@Data
public class UpdateProductRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String provider;
    private Review review;
    private Long categoryId;

}
