package personal1.bs.domain.po;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order_item
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderItemDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   交易号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.trade_num
     *
     * @mbg.generated
     */
    private Integer tradeNum;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.sku_id
     *
     * @mbg.generated
     */
    private Integer skuId;

    /**
     * Database Column Remarks:
     *   购买数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.num
     *
     * @mbg.generated
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_item
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.id
     *
     * @return the value of order_item.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.id
     *
     * @param id the value for order_item.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.trade_num
     *
     * @return the value of order_item.trade_num
     *
     * @mbg.generated
     */
    public Integer getTradeNum() {
        return tradeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.trade_num
     *
     * @param tradeNum the value for order_item.trade_num
     *
     * @mbg.generated
     */
    public void setTradeNum(Integer tradeNum) {
        this.tradeNum = tradeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.sku_id
     *
     * @return the value of order_item.sku_id
     *
     * @mbg.generated
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.sku_id
     *
     * @param skuId the value for order_item.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.num
     *
     * @return the value of order_item.num
     *
     * @mbg.generated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.num
     *
     * @param num the value for order_item.num
     *
     * @mbg.generated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
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
        OrderItemDO other = (OrderItemDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeNum() == null ? other.getTradeNum() == null : this.getTradeNum().equals(other.getTradeNum()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeNum() == null) ? 0 : getTradeNum().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
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
        sb.append(", tradeNum=").append(tradeNum);
        sb.append(", skuId=").append(skuId);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}