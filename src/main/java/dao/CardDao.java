package dao;

import pojo.Card;

/**
 * @author yohoyes
 * @date 2021/6/1 22:22
 */
public interface CardDao {

    /**
     * @return 主键
     */
    int add(Card card);

    int delete(int id);

    int update(Card card);

    Card getCardById(int id);

}
