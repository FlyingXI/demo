package nesting;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

import nesting.extend.ExtendGroupFiled;
import nesting.extend.ExtendItemFiled;

public class NestingAdapter {

    private static final int VIEW_TYPE_ITEM = 1;

    private static final int VIEW_TYPE_HEADER = 2;

    private static final int VIEW_TYPE_SUB_HEADER = 3;

    private void setData(List<EntryBean> entryBeans) {
        List<EntryDecoration> list = new ArrayList<>();
        for (int i = 0; i < entryBeans.size(); i++) {
            EntryBean entryBean = entryBeans.get(i);
            if (entryBean.viewType() == "item") {
                // 单独为一项的场景
                ExtendItemFiled extendItemFiled = new ExtendItemFiled();
                extendItemFiled.setRadiusType(ExtendItemFiled.TOP_BOTTOM);

                EntryDecoration entryDecoration = new EntryDecoration(extendItemFiled, entryBean);
                entryDecoration.setViewType(VIEW_TYPE_ITEM);
                list.add(entryDecoration);
            } else if (entryBean.viewType() == "group1") {
                List<EntryBean> children = entryBean.children();

                // 第一层 header
                // 顶部圆角，有分割线
                ExtendGroupFiled groupFiled = new ExtendGroupFiled();
                EntryDecoration entryDecoration = new EntryDecoration(groupFiled, entryBean);
                groupFiled.setRadiusType(ExtendItemFiled.TOP);
                groupFiled.setRadiusType(ExtendItemFiled.TOP);
                entryDecoration.setViewType(VIEW_TYPE_HEADER);
                list.add(entryDecoration);

                // 第二层分组
                for (int i1 = 0; i1 < children.size(); i1++) {
                    EntryBean entryBean1 = children.get(i1);

                    EntryDecoration entryDecoration1 = null;
                    if (entryBean1.title() != null) {
                        // 带有title的分组，这种就不需要大分各县
                        ExtendGroupFiled groupFiled1 = new ExtendGroupFiled();
                        entryDecoration1 = new EntryDecoration(groupFiled1, entryBean);
                        groupFiled1.setRadiusType(ExtendItemFiled.TOP);
                        entryDecoration.setViewType(VIEW_TYPE_SUB_HEADER);
                        list.add(entryDecoration1);
                    }

                    int startIndex = list.size() - 1;
                    // 第三层 实际的item
                    List<EntryBean> children1 = entryBean1.children();
                    for (int i2 = 0; i2 < children1.size(); i2++) {
                        ExtendItemFiled itemFiled = new ExtendItemFiled();
                        list.add(new EntryDecoration(itemFiled, entryBean));
                        if (i2 == children1.size()) {
                            if (i1 == children.size()) {
                                // 如果是最后一组的话，就不要大分割线
                                // 设置底部圆角
                            } else {
                                // 最后一项设置大分割线
                            }
                        }
                    }
                }
            }
        }
    }
}
