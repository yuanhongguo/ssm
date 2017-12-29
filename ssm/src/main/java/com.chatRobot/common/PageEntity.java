package com.chatRobot.common;

public class PageEntity {
    private int limit = 5;//每页数据的数量，默认为十条
    private int offset = 1;//第几页，默认为第一页
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    @Override
    public String toString() {
        return "PageTerry [limit=" + limit + ", offset=" + offset + "]";
    }
}
