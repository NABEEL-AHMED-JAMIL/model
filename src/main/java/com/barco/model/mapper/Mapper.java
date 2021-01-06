package com.barco.model.mapper;

/**
 * @author Nabeel Ahmed
 */
public interface Mapper<V, E> {

    public V mapToVo(E e);

    public E mapToEntity(V v);

}
