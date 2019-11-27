package com.geccocrawler.gecco.demo.jsonPost;

import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.spider.JsonBean;

public class TaxRateItem implements JsonBean {

    @JSONPath("$.zsxmmc")
    private String zsxmmc;
    @JSONPath("$.zspmmc")
    private String zspmmc;
    @JSONPath("$.sl")
    private Double sl;

    public String getZsxmmc() {
        return zsxmmc;
    }

    public void setZsxmmc(String zsxmmc) {
        this.zsxmmc = zsxmmc;
    }

    public String getZspmmc() {
        return zspmmc;
    }

    public void setZspmmc(String zspmmc) {
        this.zspmmc = zspmmc;
    }

    public Double getSl() {
        return sl;
    }

    public void setSl(Double sl) {
        this.sl = sl;
    }
}
