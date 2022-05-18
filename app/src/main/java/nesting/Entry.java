package nesting;

import java.util.List;

import nesting.extend.ExtendFiled;
import nesting.extend.ExtendFun;

public interface Entry<T extends Entry<T>> {

    String title();

    String name();

    String description();

    String viewType();

    List<T> children(); // 应该放在组的扩展属性中，但是大多时候有很多子项，多了一层嵌套，不好

    ExtendFiled extendFiled();

    List<ExtendFun> extendFun();
}
