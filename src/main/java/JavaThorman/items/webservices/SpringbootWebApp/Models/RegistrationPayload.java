package JavaThorman.items.webservices.SpringbootWebApp.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationPayload {

    private String username;
    private String password;
}