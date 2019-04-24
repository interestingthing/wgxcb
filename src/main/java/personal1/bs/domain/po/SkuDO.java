package personal1.bs.domain.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sku
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SkuDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.spu_id
     *
     * @mbg.generated
     */
    private Integer spuId;

    /**
     * Database Column Remarks:
     *   图片链接
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.img_url
     *
     * @mbg.generated
     */
    private String imgUrl;

    /**
     * Database Column Remarks:
     *   价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   库存
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.repertory
     *
     * @mbg.generated
     */
    private String repertory;

    /**
     * Database Column Remarks:
     *   属性集合
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku.spu_spec_ids
     *
     * @mbg.generated
     */
    private String spuSpecIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sku
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.id
     *
     * @return the value of sku.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.id
     *
     * @param id the value for sku.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.spu_id
     *
     * @return the value of sku.spu_id
     *
     * @mbg.generated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.spu_id
     *
     * @param spuId the value for sku.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.img_url
     *
     * @return the value of sku.img_url
     *
     * @mbg.generated
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.img_url
     *
     * @param imgUrl the value for sku.img_url
     *
     * @mbg.generated
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.price
     *
     * @return the value of sku.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.price
     *
     * @param price the value for sku.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.repertory
     *
     * @return the value of sku.repertory
     *
     * @mbg.generated
     */
    public String getRepertory() {
        return repertory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.repertory
     *
     * @param repertory the value for sku.repertory
     *
     * @mbg.generated
     */
    public void setRepertory(String repertory) {
        this.repertory = repertory == null ? null : repertory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku.spu_spec_ids
     *
     * @return the value of sku.spu_spec_ids
     *
     * @mbg.generated
     */
    public String getSpuSpecIds() {
        return spuSpecIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku.spu_spec_ids
     *
     * @param spuSpecIds the value for sku.spu_spec_ids
     *
     * @mbg.generated
     */
    public void setSpuSpecIds(String spuSpecIds) {
        this.spuSpecIds = spuSpecIds == null ? null : spuSpecIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sku
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
        SkuDO other = (SkuDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getRepertory() == null ? other.getRepertory() == null : this.getRepertory().equals(other.getRepertory()))
            && (this.getSpuSpecIds() == null ? other.getSpuSpecIds() == null : this.getSpuSpecIds().equals(other.getSpuSpecIds()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sku
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getRepertory() == null) ? 0 : getRepertory().hashCode());
        result = prime * result + ((getSpuSpecIds() == null) ? 0 : getSpuSpecIds().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sku
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
        sb.append(", spuId=").append(spuId);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", price=").append(price);
        sb.append(", repertory=").append(repertory);
        sb.append(", spuSpecIds=").append(spuSpecIds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}