package spring_boot_cloud.user.application.command.login;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring_boot_cloud.common.application.mediator.RequestHandler;
import spring_boot_cloud.user.domain.ports.AuthenticationPort;

@Service
@AllArgsConstructor
public class LoginUserHandler implements RequestHandler<LoginUserRequest, LoginUserResponse> {

    private final AuthenticationPort authenticationPort;

    @Override
    public LoginUserResponse handle(LoginUserRequest request) {

        String token = authenticationPort.authenticate(request.getEmail(), request.getPassword());

        return new LoginUserResponse(token);
    }

    @Override
    public Class<LoginUserRequest> getRequestType() {
        return null;
    }
}
