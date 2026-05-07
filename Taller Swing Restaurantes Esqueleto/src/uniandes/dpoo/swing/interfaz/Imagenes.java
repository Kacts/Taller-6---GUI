package uniandes.dpoo.swing.interfaz;

import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;

public class Imagenes
{
    private static final String CARPETA_PROYECTO = "Taller Swing Restaurantes Esqueleto";

    private Imagenes( )
    {
    }

    public static ImageIcon cargarIcono( String nombreImagen )
    {
        URL recurso = Imagenes.class.getClassLoader( ).getResource( "imagenes/" + nombreImagen );
        if( recurso != null )
        {
            return new ImageIcon( recurso );
        }

        File imagen = new File( "imagenes", nombreImagen );
        if( imagen.exists( ) )
        {
            return new ImageIcon( imagen.getPath( ) );
        }

        imagen = new File( CARPETA_PROYECTO + File.separator + "imagenes", nombreImagen );
        return new ImageIcon( imagen.getPath( ) );
    }
}
