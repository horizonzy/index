package com.tl.mapper;

import com.tl.pojo.Index;

import java.util.List;

public interface IndexMapper {

    List<Index> search(String word);

    List<Index> listAll();
}
