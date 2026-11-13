package spring_boot_cloud.product.application.query.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_cloud.common.domain.PaginationResult;
import spring_boot_cloud.product.domain.entity.Product;

@Data
@AllArgsConstructor
public class GetAllProductResponse {

    private PaginationResult<Product> productsPage;

}
