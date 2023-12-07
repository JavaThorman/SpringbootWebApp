package JavaThorman.items.webservices.SpringbootWebApp.Controller;
import JavaThorman.items.webservices.SpringbootWebApp.Models.LoginResponse;
import JavaThorman.items.webservices.SpringbootWebApp.Models.RegistrationPayload;
import JavaThorman.items.webservices.SpringbootWebApp.Services.AuthService;
import lombok.RequiredArgsConstructor;
import JavaThorman.items.webservices.SpringbootWebApp.Models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register (
            @RequestBody RegistrationPayload payload
    ) {
        return authService.register(payload.getUsername(), payload.getPassword());
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login (
            @RequestBody RegistrationPayload payload
    ) {
        return authService.login(payload.getUsername(), payload.getPassword());
    }
}
