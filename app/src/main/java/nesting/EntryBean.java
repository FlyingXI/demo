package nesting;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import nesting.extend.ExtendFiled;
import nesting.extend.ExtendFun;
import nesting.extend.ExtendGroupFiled;

public class EntryBean implements Entry<EntryBean> {
    private String title;
    private String name;
    private String description;
    private String viewType;
    private List<EntryBean> children;

    private ExtendGroupFiled extendGroup;

    @Override
    public String title() {
        return title;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String viewType() {
        return viewType;
    }

    @Override
    public List<EntryBean> children() {
        return children;
    }

    @Override
    public ExtendFiled extendFiled() {
        return extendGroup;
    }

    @Override
    public List<ExtendFun> extendFun() {
        return null;
    }
}
