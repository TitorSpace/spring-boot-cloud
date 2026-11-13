package spring_boot_cloud.user.application.command.login;

import lombok.Data;
import spring_boot_cloud.common.application.mediator.Request;

@Data
public class LoginUserRequest implements Request<LoginUserResponse> {

    private String email;
    private String password;
}
