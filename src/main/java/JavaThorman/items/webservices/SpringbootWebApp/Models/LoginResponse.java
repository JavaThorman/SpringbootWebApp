package JavaThorman.items.webservices.SpringbootWebApp.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private User user;
    private String jwt;
}