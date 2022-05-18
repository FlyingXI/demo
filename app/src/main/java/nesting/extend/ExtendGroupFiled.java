package nesting.extend;

import java.util.List;

import nesting.EntryDecoration;

public class ExtendGroupFiled extends ExtendItemFiled {
    private boolean enableExpand;
    private List<EntryDecoration> children;

    public boolean isEnableExpand() {
        return enableExpand;
    }

    public void setEnableExpand(boolean enableExpand) {
        this.enableExpand = enableExpand;
    }


    public List<EntryDecoration> getChildren() {
        return children;
    }

    public void setChildren(List<EntryDecoration> children) {
        this.children = children;
    }
}
