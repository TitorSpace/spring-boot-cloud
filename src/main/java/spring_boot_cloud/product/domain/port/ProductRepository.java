package spring_boot_cloud.product.domain.port;

import spring_boot_cloud.common.domain.PaginationQuery;
import spring_boot_cloud.common.domain.PaginationResult;
import spring_boot_cloud.product.domain.entity.Product;
import spring_boot_cloud.product.domain.entity.ProductFilter;

import java.util.Optional;

public interface ProductRepository {

    Product upsert(Product product);

    Optional<Product> findById(Long id);

    PaginationResult<Product> findAll(PaginationQuery paginationQuery, ProductFilter productFilter);

    void deleteById(Long id);
}
