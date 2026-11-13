package spring_boot_cloud.review.infrastructure;

import jakarta.persistence.*;
import lombok.Data;
import spring_boot_cloud.entity.ProductEntity;

@Data
@Entity
@Table(name = "reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private String score;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;
}
