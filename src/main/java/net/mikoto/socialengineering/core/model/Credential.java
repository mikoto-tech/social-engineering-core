package net.mikoto.socialengineering.core.model;

import java.util.Objects;

/**
 * @author mikoto
 * Create for core
 * Create at 2022/7/17
 */
public class Credential {
    private long id;

    public Credential(long id) {
        this.id = id;
    }

    public Credential() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credential that = (Credential) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Credential{" +
                "id=" + id +
                '}';
    }
}
