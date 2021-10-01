package com.antique.muzi.portal.service.serviceImpl;

import com.antique.muzi.mbg.mapper.CmsMenuMapper;
import com.antique.muzi.mbg.model.CmsMenu;
import com.antique.muzi.mbg.model.CmsMenuExample;
import com.antique.muzi.portal.service.CmsMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CmsMenuServiceImpl implements CmsMenuService {
    @Autowired
    private CmsMenuMapper menuMapper;

    @Override
    public List<CmsMenu> getFirstLevel() {
        CmsMenuExample example = new CmsMenuExample();
        example.createCriteria().andLevelEqualTo(0).andHiddenEqualTo(0);
        return menuMapper.selectByExample(example);
    }

    @Override
    public List<CmsMenu> getSecondLevel(Long id) {
        CmsMenuExample example = new CmsMenuExample();
        example.createCriteria().andParentIdEqualTo(id).andLevelEqualTo(1).andHiddenEqualTo(0);
        List<CmsMenu> list = menuMapper.selectByExample(example);
        list.sort(Comparator.comparing(CmsMenu::getSort));
        return list;
    }
}
