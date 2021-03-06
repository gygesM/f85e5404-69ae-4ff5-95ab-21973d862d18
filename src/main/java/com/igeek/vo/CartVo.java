package com.igeek.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Gyges on 2017/6/9.
 * 封装cartProductVo
 */
public class CartVo {

    private List<CartProductVo> cartProductVoList; //
    private BigDecimal cartTotalPrice; //购物车总价格
    private Boolean allChecked; //是否全选
    private String imageHost; //图片地址


    public List<CartProductVo> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
