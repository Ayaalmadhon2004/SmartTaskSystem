package smarttask.adapter;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter {
    public static List<NewsItem> adapt(List<ExternalNews> data) {
        List<NewsItem> result = new ArrayList<>();
        for (ExternalNews n : data) {
            NewsItem item = new NewsItem();
            item.title = n.headline;
            result.add(item);
        }
        return result;
    }
}

