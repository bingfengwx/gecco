package com.geccocrawler.gecco.demo.jsonPost;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.request.HttpPostRequest;
import com.geccocrawler.gecco.spider.JsonBean;

import java.util.List;

@Gecco(matchUrl = "https://etax.ningbo.chinatax.gov.cn/yhs-web/api/slsz/query/list", pipelines = "consolePipeline")
public class TaxRateTest implements JsonBean {

    @JSONPath("$.value.result")
    private List<TaxRateItem> taxRateItems;

    public List<TaxRateItem> getTaxRateItems() {
        return taxRateItems;
    }

    public void setTaxRateItems(List<TaxRateItem> taxRateItems) {
        this.taxRateItems = taxRateItems;
    }

    public static void main(String[] args) {
        HttpPostRequest postRequest = new HttpPostRequest("https://etax.ningbo.chinatax.gov.cn/yhs-web/api/slsz/query/list");
        postRequest.setPayload("{\"zsxmmc\":\"契税\",\"pageIndex\":1,\"pageSize\":10}");
        postRequest.withApplicationJson();
        GeccoEngine.create()
                .classpath("com.geccocrawler.gecco.demo.jsonPost")
                .start(postRequest)
                .run();
    }
}
