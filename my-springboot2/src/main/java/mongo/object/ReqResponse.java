package mongo.object;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author: 周子恒
 * @create: 2023-10-07 14:38
 **/
@Data
public class ReqResponse {
    private LinkedHashSet<String> labels;
}
