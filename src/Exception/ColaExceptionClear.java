package Exception;

public class ColaExceptionClear extends RuntimeException{
	public ColaExceptionClear(){
		super("[NO SE PUEDEN ELIMINAR MAS ELEMENTOS DE LA LISTA]");
	}
}
