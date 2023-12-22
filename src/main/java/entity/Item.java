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
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private double unitPrice;


}
