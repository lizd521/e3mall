package cn.e3mall.cart.service;

import java.util.List;

import cn.e3mall.common.pojo.E3Result;
import cn.e3mall.pojo.TbItem;

public interface CartService {

	E3Result addCart(long userId, long itemId, int num);
	E3Result mergeCartItem(long userId, List<TbItem> itemList);
	E3Result updateItemNum(long userId, long itemId, int num);
	List<TbItem> getCartList(long userId);
	E3Result deleteCartItem(long userId, long itemid);
}
