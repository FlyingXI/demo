package nesting.extend;

public class ExtendItemFiled implements ExtendFiled {
    public static final String TOP = "top";
    public static final String BOTTOM = "bottom";
    public static final String NONE = "none";
    public static final String TOP_BOTTOM = "none";

    private String radiusType;

    private boolean enableDivider; // 分割线

    public String getRadiusType() {
        return radiusType;
    }

    public void setRadiusType(String radiusType) {
        this.radiusType = radiusType;
    }
}
