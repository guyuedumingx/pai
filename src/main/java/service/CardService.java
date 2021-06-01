package service;

import pojo.CardDTO;
import pojo.DetailDTO;

import javax.smartcardio.Card;
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
    List<CardDTO> getCards(int currentPage);


    /**
     * 获取一张卡片的详情
     * @param cardId 卡片id
     * @return 卡片详情
     */
    DetailDTO cardDetails(int cardId);
}
