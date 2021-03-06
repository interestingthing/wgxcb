package personal.bs.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import personal.bs.domain.vo.CustomAttributeItems;
import personal.bs.domain.vo.SpecSku;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table spu_desc
 *
 * @mbg.generated do_not_delete_during_merge
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDescDto implements Serializable {

    @JsonProperty("id")
    private Integer spuid;

    private String introduction;

    private List<SpecSku> specificationItems;

    private List<CustomAttributeItems> customAttributeItems;

    private List<String> itemImages;

    private String packageList;

    private String saleService;

}