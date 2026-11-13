package spring_boot_cloud.mapper;

import org.mapstruct.*;
import spring_boot_cloud.category.domain.Category;
import spring_boot_cloud.category.infrastructure.CategoryEntity;
import spring_boot_cloud.entity.ProductEntity;
import spring_boot_cloud.product.domain.entity.Product;
import spring_boot_cloud.review.domain.Review;
import spring_boot_cloud.review.infrastructure.ReviewEntity;


@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface ProductEntityMapper {

    @Mapping(target = "productDetail.productEntity", ignore = true)
    ProductEntity mapToProductEntity(Product product);

    @Mapping(target = "productDetail.product", ignore = true)
    Product mapToProduct(ProductEntity productEntity);

    @Mapping(target = "product", ignore = true)
    Review mapToReview(ReviewEntity reviewEntity);

    @Mapping(target = "productEntity", ignore = true)
    ReviewEntity mapToReviewEntity(Review review);

    @Mapping(target = "products", ignore = true)
    Category mapToCategory(CategoryEntity categoryEntity);

    @Mapping(target = "products", ignore = true)
    CategoryEntity mapToCategoryEntity(Category category);

    @AfterMapping
    default void linkReviews(@MappingTarget ProductEntity productEntity) {
        if (productEntity.getReviews() != null) {
            productEntity.getReviews().forEach(
                    review -> review.setProductEntity(productEntity)
            );
        }
    }
}
