package data.database;

import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task")
public class TaskEntry {
    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "dev_esn")
    private String devEsn;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "dev_type")
    private String devType;

    @ColumnInfo(name = "site_id")
    private String siteId;

    @ColumnInfo(name = "site_name")
    private String siteName;

    @ColumnInfo(name = "check_path")
    private String checkPath;

    @ColumnInfo(name = "report_path")
    private String reportPath;

    @ColumnInfo(name = "submit")
    private boolean submit;

    @ColumnInfo(name = "parent_id")
    private String parentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevEsn() {
        return devEsn;
    }

    public void setDevEsn(String devEsn) {
        this.devEsn = devEsn;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getCheckPath() {
        return checkPath;
    }

    public void setCheckPath(String checkPath) {
        this.checkPath = checkPath;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
