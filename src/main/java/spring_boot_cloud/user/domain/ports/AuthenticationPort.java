package spring_boot_cloud.user.domain.ports;

public interface AuthenticationPort {

    String authenticate(String username, String password);
}
