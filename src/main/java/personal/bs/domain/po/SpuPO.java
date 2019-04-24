package personal.bs.domain.po;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table spu
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SpuPO implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.type_id")
    private Integer typeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.store_id")
    private Integer storeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.sale_num")
    private Integer saleNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.upload_date")
    private Date uploadDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.status")
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.type_id")
    public Integer getTypeId() {
        return typeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.type_id")
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.description")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.store_id")
    public Integer getStoreId() {
        return storeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.store_id")
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.sale_num")
    public Integer getSaleNum() {
        return saleNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.sale_num")
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.upload_date")
    public Date getUploadDate() {
        return uploadDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.upload_date")
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: spu.status")
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spu
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
        SpuPO other = (SpuPO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()))
            && (this.getUploadDate() == null ? other.getUploadDate() == null : this.getUploadDate().equals(other.getUploadDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spu
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        result = prime * result + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spu
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
        sb.append(", name=").append(name);
        sb.append(", typeId=").append(typeId);
        sb.append(", description=").append(description);
        sb.append(", storeId=").append(storeId);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", uploadDate=").append(uploadDate);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}