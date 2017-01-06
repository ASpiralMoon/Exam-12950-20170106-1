package com.ts.exam.dao;

import com.ts.exam.entity.Language;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/4.
 */
@Repository
public interface ILanguageDao {

    /**
     * 查询所有language
     *
     * @return List<Language>
     */
    List<Language> queryAllLanguage();

}
