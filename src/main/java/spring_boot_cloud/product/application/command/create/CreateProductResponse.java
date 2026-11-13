package spring_boot_cloud.product.application.command.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_cloud.product.domain.entity.Product;

@Data
@AllArgsConstructor
public class CreateProductResponse {

    private Product product;
}
