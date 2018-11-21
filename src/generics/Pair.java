package generics;

public class Pair<T,S> {
    private T typeT;
    private S typeS;

    public Pair(T typeT, S typeS) {
        this.typeT = typeT;
        this.typeS = typeS;
    }

    public T getFirst() {
        return typeT;
    }

    public S getSecond() {
        return typeS;
    }
}
