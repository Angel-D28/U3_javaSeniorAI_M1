import java.util.logging.Logger;

public class AuthenticationService {
    private static final Logger logger = Logger.getLogger(AuthenticationService.class.getName());

    public void login(String usuario, String password) throws AuthenticationException {
        
        logger.info("Intentando autenticar usuario: " + usuario);

        if (usuario == null || password == null) {
            logger.warning("Usuario o contraseña nulos");
            throw new AuthenticationException("Datos de acceso inválidos");
        }

        if (!usuario.equals("admin") || !password.equals("1234")) {
            logger.warning("Credenciales incorrectas para usuario: " + usuario);
            throw new AuthenticationException("Credenciales incorrectas");
        }

        logger.info("Usuario autenticado correctamente: " + usuario);
    }
}
