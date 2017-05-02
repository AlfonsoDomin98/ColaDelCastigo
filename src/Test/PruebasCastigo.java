package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Exception.ColaException;
import Models.ColaCastigo;
import Models.ColaCastigo;
import junit.framework.TestCase;

public class PruebasCastigo {

	private ColaCastigo<Integer> c;

	@Test
	public void AddSuccess() {
		Setup();
		assert (c.add(9)); // ASSERT ASEGURA QUE SE HA AÑADIDO 9, SI SE AÑADE DEVUELVE TRUE SI NO FALLA LA PRUEBA
		assert (c.contains(9)); // PEEK: DEVUELVE EL PRIMER ELEMENTO
	}
	@Test
	public void AddFail(){
		Setup();
		for(int i = 0; i< 10; i++){
			c.add(i);
		}
		// PARA CAPTURAR LA EXCEPCION
		try{
			c.add(10);
		}
		catch(ColaException e){
			assert (c.size() == 10);
			assert (!c.contains(10));
		}
	}

	@Before
	public void Setup(){
	
		
	}

}
