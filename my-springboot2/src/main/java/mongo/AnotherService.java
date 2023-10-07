package mongo;

import lombok.Data;
import mongo.object.ReqResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@Service
public class AnotherService {
    private Integer integer2 = 511112;

    public ReqResponse service() {
        ReqResponse1 reqResponse = new ReqResponse1();
        final LinkedHashSet<String> labels1 = new LinkedHashSet<>();
        labels1.add("aaa");
        reqResponse.setLabels(labels1);

        ReqResponse r = new ReqResponse();
        BeanUtils.copyProperties(reqResponse, r);
        return r;
    }


    @Data
    public static class ReqResponse1 {
        private LinkedHashSet<String> labels;
    }
}