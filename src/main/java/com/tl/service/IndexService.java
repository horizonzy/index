package com.tl.service;

import com.tl.pojo.Index;

import java.util.List;
import java.util.Set;

public interface IndexService {
    /***
     * 根据关键字查询结果
     * @param word
     * @return
     */
    List<Index> search(String word);

    /***
     * 加载数据
     * @return
     */
    List<Index> all();

    Set<String> search2(String word);
}
