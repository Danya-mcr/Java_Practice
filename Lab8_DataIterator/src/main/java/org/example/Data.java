package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.UUID;

public class Data implements Iterable<Object>{
    private UUID Id;
    private String Email;
    private String PasswordHash;
    private String Name;

    public Data(String email, String passwordHash, String name) {
        Id = UUID.randomUUID();
        Email = email;
        PasswordHash = passwordHash;
        Name = name;
    }

    @Override
    public Iterator<Object> iterator() {
        return new MyDataIterator();
    }

    private class MyDataIterator implements Iterator<Object> {
        private int ptr = 0;
        private final int elementsCount = 4;

        @Override
        public boolean hasNext() {
            return ptr < elementsCount;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Object result;
            switch (ptr) {
                case 0:
                    result = Id;
                    break;
                case 1:
                    result = Email;
                    break;
                case 2:
                    result = PasswordHash;
                    break;
                case 3:
                    result = Name;
                    break;
                default:
                    throw new NoSuchElementException();
            }

            ptr++;
            return result;
        }
    }
}
