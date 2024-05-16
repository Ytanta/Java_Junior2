package javajun2.rand;

@FunctionalInterface
public interface DateConverter<T> {
    T convert(long randomEpochDay);
}