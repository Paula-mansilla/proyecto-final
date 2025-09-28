package Control;

public class LoginController {

    public boolean validacionDatos(String usuario, String contrasenna) {
        return usuario.equals("paula") && contrasenna.equals("123");
    }
}
