package spring_boot_cloud.product.application.command.delete;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_cloud.common.application.mediator.Request;

@Data
@AllArgsConstructor
public class DeleteProductRequest implements Request<Void> {

    private Long id;

}
