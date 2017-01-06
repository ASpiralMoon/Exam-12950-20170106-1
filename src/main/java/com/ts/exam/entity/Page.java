package com.ts.exam.entity;

/**
 * 分页工具类
 * Created by ASpiralMoon on 2016/12/29.
 */
public class Page {

    private Integer current;

    private Integer size = 10;

    private Integer pages;

    private Integer totalCount;

    private Integer offset;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPages() {
        return this.pages;
    }


    public void setPages(Integer pages) {
        this.pages = getTotalCount() % getSize() == 0 ? getTotalCount() / getSize() : getTotalCount() / getSize() + 1;
    }


    public Integer getOffset() {
        offset = (getCurrent() - 1) * getSize();
        return offset;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", size=" + size +
                ", pages=" + pages +
                ", totalCount=" + totalCount +
                ", offset=" + offset +
                '}';
    }
}
