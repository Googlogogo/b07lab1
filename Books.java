package lab4.Lab4Part2;

public abstract class Books {
    String isbn;
    String title;

    public Books(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public abstract double getLength();
    public abstract double getHeight();
    public abstract double getWidth();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Books))
            return false;
        Books other = (Books) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return title;
    }
}
