package spring_boot_cloud.user.infrastructure.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import spring_boot_cloud.common.infrastructure.service.JwtService;
import spring_boot_cloud.user.domain.ports.AuthenticationPort;
import spring_boot_cloud.user.infrastructure.database.entity.UserEntity;

@Service
@RequiredArgsConstructor
public class AuthenticationImpl implements AuthenticationPort {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @Override
    public String authenticate(String username, String password) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        username,
                        password
                )
        );

        UserEntity entity = (UserEntity) authenticate.getPrincipal();
        return jwtService.generateToken(entity);
    }
}
