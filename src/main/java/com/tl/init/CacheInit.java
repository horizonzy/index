package com.tl.init;

import com.tl.pojo.Index;
import com.tl.service.IndexService;
import com.tl.service.LikeSearch;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class CacheInit implements InitializingBean,ApplicationContextAware {

  @Autowired
    IndexService indexService;
  ApplicationContext applicationContext;
  public static LikeSearch<String> likeSearch=new LikeSearch<String>();
    @Override
    public void afterPropertiesSet() throws Exception {
        List<Index> all= indexService.all();
         for(Index index:all){
             likeSearch.put(index.getCompany_name(),index.getCompany_name()+index.getId());
         }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
