package entities;

import java.util.Objects;

public class Students {

    private int regitration;

    public Students(int registration) {
        this.regitration = registration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return regitration == students.regitration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regitration);
    }
}
