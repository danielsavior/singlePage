package br.com.restaurante.controllers;

import java.util.List;

/**
 *
 * @author daniel
 */
public interface ITodosController<T> {
    void insert(T objeto);
    void delete(T objeto);
    void update(T objeto);
    T buscarPorID(long id);
    List<T> buscarPorNome(String nome);
    List<T> listar();
}
