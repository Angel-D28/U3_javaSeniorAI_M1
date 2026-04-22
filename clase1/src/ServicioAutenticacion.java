public class ServicioAutenticacion {
    
    public void autenticar(Cuenta cuenta, String password) throws AuthenticationException {
        if (!cuenta.getPassword().equals(password)) {
            throw new AuthenticationException("Contraseña incorrecta");
        }
    }
}
