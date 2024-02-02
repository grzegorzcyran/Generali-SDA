package edu.grcy.misc.immutability;

import java.util.Objects;

public class Key {
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return Objects.equals(key, key.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
