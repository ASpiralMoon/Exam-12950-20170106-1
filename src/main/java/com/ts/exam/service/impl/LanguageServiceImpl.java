package com.ts.exam.service.impl;

import com.ts.exam.dao.ILanguageDao;
import com.ts.exam.entity.Language;
import com.ts.exam.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@Service
public class LanguageServiceImpl implements ILanguageService {

    @Autowired
    private ILanguageDao iLanguageDao;

    @Override
    public List<Language> queryAllLanguage() {
        List<Language> list = iLanguageDao.queryAllLanguage();
        return list;
    }
}
