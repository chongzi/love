package com.bkn.system.entity;

public class LoveUserInfoOrder {
    /** �������� */
    private Integer orderId;

    /** �û�ID */
    private Integer userId;

    /** ֧����ʽ��1��΢��֧�� 2��֧���� 3��ƻ��֧���� */
    private Integer paySign;

    /** ֧���ײ����� */
    private Integer payCategory;

    /** ֧����� */
    private Integer payMoney;

    /** �������� */
    private String outTradeNo;

    /** ������������ */
    private String signNo;

    /** ����ʱ�� */
    private String createTime;

    /** ����ʱ�� */
    private String finishTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPaySign() {
        return paySign;
    }

    public void setPaySign(Integer paySign) {
        this.paySign = paySign;
    }

    public Integer getPayCategory() {
        return payCategory;
    }

    public void setPayCategory(Integer payCategory) {
        this.payCategory = payCategory;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getSignNo() {
        return signNo;
    }

    public void setSignNo(String signNo) {
        this.signNo = signNo == null ? null : signNo.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
    }
}