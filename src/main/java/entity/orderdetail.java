package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class orderdetail {
@Id
    private String orderid;
    private String itemCode;
    private int qty;
    private double unitPrice;


}
