package mailong245.StrategyPattern;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
