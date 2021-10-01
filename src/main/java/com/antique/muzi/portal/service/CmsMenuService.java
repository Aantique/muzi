package com.antique.muzi.portal.service;

import com.antique.muzi.mbg.model.CmsMenu;


import java.util.List;

public interface CmsMenuService {
    //一级菜单
    List<CmsMenu> getFirstLevel();

    //二级菜单需要一级id
    List<CmsMenu> getSecondLevel(Long id);
}
