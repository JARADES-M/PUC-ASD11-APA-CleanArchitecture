package domain.valueObjects;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Objects;

public class ISBN {

    Integer isbn; // 13 digits

    public boolean isValid() {
        throw new NotImplementedException();
        // checa regras isbn
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ISBN isbn1 = (ISBN) o;
        return isbn.equals(isbn1.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return String.valueOf(isbn);
    }
}
