package data.vo;

import java.util.List;

public class CommissioningTask {
    private int id;
    private String name;
    private String devId;
    private String devEsn;
    private String siteId;
    private String siteName;
    private String state; // 未提交、审核中、审核拒绝、审核通过
    private String reportPath;
    private String checkPath;

    // 审核时间等信息

    private List<CommissioningTask> childTsk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getDevEsn() {
        return devEsn;
    }

    public void setDevEsn(String devEsn) {
        this.devEsn = devEsn;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public List<CommissioningTask> getChildTsk() {
        return childTsk;
    }

    public void setChildTsk(List<CommissioningTask> childTsk) {
        this.childTsk = childTsk;
    }
}
