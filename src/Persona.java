import conexion.Conexion;
import org.omg.CORBA.ORB;

public class Persona extends PersonaApp.PersonaPOA{
    
    private ORB orb;
    Conexion conex = new Conexion();

    @Override
    public boolean insertarPersona(int id_persona, String nombre, String apellido, int telefono, String direccion, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarPersona(int id_persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int id_persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(int id_persona, String nombre, String apellido, int telefono, String direccion, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
