package service;

import pojo.SimpleCard;
import pojo.Card;

import java.util.List;

/**
 * @author Florence
 */
public interface CardService {
    /**
     * 获取卡片
     * @param currentPage 当前页数
     * @return 卡片列表
     */
    List<SimpleCard> getCards(int currentPage);


    /**
     * 获取一张卡片的详情
     * @param cardId 卡片id
     * @return 卡片详情
     */
    Card cardDetails(int cardId);
}
