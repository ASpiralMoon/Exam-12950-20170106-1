package com.ts.exam.dao;

import com.ts.exam.entity.Film;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@Repository
public interface IFilmDao {

    /**
     * 单条增加电影
     *
     * @param film 电影对象
     * @return 插入操作影响数据库行数
     */
    int addOneFilm(Film film);

    /**
     * 根据条件查询电影信息,如无条件则查询所有电影
     *
     * @param title       电影标题
     * @param description 电影描述
     * @param offset
     * @param size
     * @return
     */
    List<Film> queryFilmInfoByParams(@Param("filmId") Short filmId, @Param("title") String title, @Param("description") String description, @Param("offset") Integer offset, @Param("size") Integer size);

    /**
     * 单条编辑电影
     *
     * @param film 电影对象
     * @return 更新操作影响数据库行数
     */
    int editOneFilm(Film film);

    /**
     * 根据filmId单条删除电影
     *
     * @param filmId 电影id
     * @return 删除操作影响数据库行数
     */
    int delOneFilm(Short filmId);

    /**
     * 查询数据总数
     *
     * @return 数据总数
     */
    int queryTotalCount();

    /**
     * 根据条件查询总数
     */
    int queryTotalByFilm(Film film);

}
