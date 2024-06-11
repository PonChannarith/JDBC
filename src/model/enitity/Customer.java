package model.enitity;
import java.sql.Date;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Customer {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Boolean isDeleted;
    private Date createdDate;

//    public Snippet builder() {
//    }
}
