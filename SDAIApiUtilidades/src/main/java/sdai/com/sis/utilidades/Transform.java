package sdai.com.sis.utilidades;

/**
 * @date 08/05/2025
 * @author Sergio_M
 * @since VERSIONDUTILIDADESENCURSO
 */
public abstract class Transform {

    public static String toString(Object value) {
        String cadena = String.valueOf(value);
        return cadena;
    }

    public static Integer toInteger(Object value) {
        try {
            String cadena = Transform.toString(value);
            return Integer.valueOf(cadena);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

}
