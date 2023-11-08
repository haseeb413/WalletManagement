package Entity;

import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Wallet {
    Long id ;

    Long userId;

    BigDecimal Balance;


}
