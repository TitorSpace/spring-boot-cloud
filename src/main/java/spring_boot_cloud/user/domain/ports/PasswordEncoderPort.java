package spring_boot_cloud.user.domain.ports;

public interface PasswordEncoderPort {

    String encode(String password);
}
