package com.iplay.jsnews.news.model;

import com.iplay.jsnews.news.model.beans.NewsDetailBean;

/**
 * Description : 新闻详情加载回调
 * Author : AstroGypsophila
 * Github  : https://github.com/AstroGypsophila
 * Date   : 2016/8/28
 */
public interface OnLoadNewsDetailListener {

    void onSuccess(NewsDetailBean newsDetailBean);

    void onFailure(String msg, Exception e);
}
