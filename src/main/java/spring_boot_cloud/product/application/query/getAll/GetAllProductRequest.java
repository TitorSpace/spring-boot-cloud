package spring_boot_cloud.product.application.query.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_cloud.common.application.mediator.Request;
import spring_boot_cloud.common.domain.PaginationQuery;
import spring_boot_cloud.product.domain.entity.ProductFilter;

@Data
@AllArgsConstructor
public class GetAllProductRequest implements Request<GetAllProductResponse> {

    PaginationQuery paginationQuery;
    ProductFilter productFilter;
}
