// 
// Decompiled by Procyon v0.5.30
// 

package com.rwtema.extrautils.core;

import java.util.Iterator;

public class CastIterator<T> implements Iterable<T>, Iterator<T>
{
    Iterator iterator;
    
    public CastIterator(final Iterable iterable) {
        this(iterable.iterator());
    }
    
    public CastIterator(final Iterator iterator) {
        this.iterator = iterator;
    }
    
    @Override
    public Iterator<T> iterator() {
        return this;
    }
    
    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }
    
    @Override
    public T next() {
        return this.iterator.next();
    }
    
    @Override
    public void remove() {
        this.iterator.remove();
    }
}