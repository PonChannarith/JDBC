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
public class Order {
    private Integer id;
    private String orderName;
    private String orderDescription;
    private Date orderedDate;
    private Customer customer;
}
