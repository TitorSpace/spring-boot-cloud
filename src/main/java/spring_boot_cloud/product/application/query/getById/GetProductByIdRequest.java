package spring_boot_cloud.product.application.query.getById;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_cloud.common.application.mediator.Request;

@Data
@AllArgsConstructor
public class GetProductByIdRequest implements Request<GetProductByIdResponse> {

    private Long id;

}
