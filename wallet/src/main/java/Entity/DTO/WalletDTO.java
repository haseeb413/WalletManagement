package Entity.DTO;

import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class WalletDTO {

    Long walledId;

    Long userId;

    BigDecimal balance;
}
