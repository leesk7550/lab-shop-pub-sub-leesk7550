package labshoppub-sub.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
}


