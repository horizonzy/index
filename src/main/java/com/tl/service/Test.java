package com.tl.service;

import java.util.Collection;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        LikeSearch<String> search = new LikeSearch<String>();
        search.put("湖南", "湖南");
        search.put("湖南", "湖南");
        search.put("湖北", "湖北");
        Collection<String> search1 = search.search("湖北", 10);
        for (Iterator it = search1.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        char a = '中';

    }

}
