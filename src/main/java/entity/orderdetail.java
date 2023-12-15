package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class orderdetail {

    private String orderid;
    private String itemCode;
    private int qty;
    private double unitPrice;


}
