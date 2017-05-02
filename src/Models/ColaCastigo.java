package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import Exception.ColaException;
import Exception.ColaExceptionClear;

public class ColaCastigo<E> extends ArrayList<E> {
	private ArrayList<E> Lista;
	private Comparator<E> Comparador;
	private final byte MAX_SIZE = 10;

	public ColaCastigo(Comparator comp) {
		this.Comparador = comp;
		this.Lista = new ArrayList<E>();
	}

	@Override
	public boolean add(E element) {
		if (element != null) {
			if (this.Lista.size() < MAX_SIZE) {
				return this.Lista.add(element);

			} else {
				throw new NullPointerException("No va");
			}
		} else {
			throw new NullPointerException("El elemento es nulo");
		}
	}

	@Override
	public boolean addAll(Collection<? extends E> coleccion) {
		if (coleccion.size() < MAX_SIZE) {
			return this.Lista.addAll(coleccion);
		} else {
			throw new ColaException();
		}
	}

	public boolean clear(E element) {
		if (this.Lista.size() > 1) {
			boolean estado = this.Lista.remove(element);
			return estado;
		} else {
			throw new ColaExceptionClear();
		}
	}

}
