package model.enitity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Integer id;
    private String productName;
    private String productCode;
    private Boolean isDeleted;
    private Date importedAt;
    private Date expiredAt;
    private String productDescription;
}
