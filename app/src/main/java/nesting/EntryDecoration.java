package nesting;

import nesting.extend.ExtendFiled;

public class EntryDecoration {
    private ExtendFiled extendFiled;

    private EntryBean entryBean;

    private int viewType;

    public EntryDecoration(ExtendFiled extendFiled, EntryBean entryBean) {
        this.extendFiled = extendFiled;
        this.entryBean = entryBean;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
