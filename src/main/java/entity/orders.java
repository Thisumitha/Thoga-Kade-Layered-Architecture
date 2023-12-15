package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class orders {
    private String id;
    private String date;
    private String customerid;
}
