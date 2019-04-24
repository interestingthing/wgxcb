package personal.bs.domain.po;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderPO implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.address_id")
    private Integer addressId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_status")
    private String orderStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_num")
    private Integer orderNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_time")
    private Date payTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_type")
    private String payType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.trade_num")
    private Integer tradeNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.delivery_id")
    private Integer deliveryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.invoice_id")
    private Integer invoiceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_status")
    private String payStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_money")
    private String orderMoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_money")
    private String payMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.address_id")
    public Integer getAddressId() {
        return addressId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.address_id")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_status")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_num")
    public Integer getOrderNum() {
        return orderNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_num")
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_time")
    public Date getPayTime() {
        return payTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_time")
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_type")
    public String getPayType() {
        return payType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_type")
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.trade_num")
    public Integer getTradeNum() {
        return tradeNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.trade_num")
    public void setTradeNum(Integer tradeNum) {
        this.tradeNum = tradeNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.delivery_id")
    public Integer getDeliveryId() {
        return deliveryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.delivery_id")
    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.invoice_id")
    public Integer getInvoiceId() {
        return invoiceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.invoice_id")
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_status")
    public String getPayStatus() {
        return payStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_status")
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_money")
    public String getOrderMoney() {
        return orderMoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.order_money")
    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney == null ? null : orderMoney.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_money")
    public String getPayMoney() {
        return payMoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: order.pay_money")
    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney == null ? null : payMoney.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderPO other = (OrderPO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getTradeNum() == null ? other.getTradeNum() == null : this.getTradeNum().equals(other.getTradeNum()))
            && (this.getDeliveryId() == null ? other.getDeliveryId() == null : this.getDeliveryId().equals(other.getDeliveryId()))
            && (this.getInvoiceId() == null ? other.getInvoiceId() == null : this.getInvoiceId().equals(other.getInvoiceId()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getOrderMoney() == null ? other.getOrderMoney() == null : this.getOrderMoney().equals(other.getOrderMoney()))
            && (this.getPayMoney() == null ? other.getPayMoney() == null : this.getPayMoney().equals(other.getPayMoney()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getTradeNum() == null) ? 0 : getTradeNum().hashCode());
        result = prime * result + ((getDeliveryId() == null) ? 0 : getDeliveryId().hashCode());
        result = prime * result + ((getInvoiceId() == null) ? 0 : getInvoiceId().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getOrderMoney() == null) ? 0 : getOrderMoney().hashCode());
        result = prime * result + ((getPayMoney() == null) ? 0 : getPayMoney().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressId=").append(addressId);
        sb.append(", userId=").append(userId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", payType=").append(payType);
        sb.append(", tradeNum=").append(tradeNum);
        sb.append(", deliveryId=").append(deliveryId);
        sb.append(", invoiceId=").append(invoiceId);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}