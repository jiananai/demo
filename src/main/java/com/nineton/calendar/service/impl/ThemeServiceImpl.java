package com.nineton.calendar.service.impl;

import com.nineton.calendar.mapper.ThemeMapper;
import com.nineton.calendar.pojo.Theme;
import com.nineton.calendar.pojo.ThemeExample;
import com.nineton.calendar.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {
    @Autowired
    private ThemeMapper themeMapper;

    @Override
    public List<Theme> findAllTheme() {
        ThemeExample example=new ThemeExample();
        List<Theme> themes = themeMapper.selectByExample(example);
        return themes;
    }

    @Override
    public void insertTheme(Theme theme) {
        themeMapper.insert(theme);
    }
}
