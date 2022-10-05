import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int x = 0;
        for (int i : list) {
            if (i >= treshold) {
                logger.log("Элемент " + i + " подходит");
                result.add(i);
                x++;
            } else logger.log("Элемент " + i + " не подходит");
        }
        logger.log("Прошло элементов " + x + " из " + list.size());
        return result;
    }
}