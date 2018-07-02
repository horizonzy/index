package com.tl.service;

import com.tl.init.CacheInit;
import com.tl.mapper.IndexMapper;
import com.tl.pojo.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public List<Index> search(String word) {
        // return indexMapper.search(word);

        return indexMapper.search(word);

    }


    @Override
    public Set<String> search2(String word) {

        return (Set<String>) CacheInit.likeSearch.search(word, 20);

    }


    @Override
    public List<Index> all() {
        return indexMapper.listAll();
    }

}
