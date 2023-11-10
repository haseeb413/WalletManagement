package common.dtos.Constant;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class WalletDto {

    Long walledId;

    Long userId;

    BigDecimal balance;
}
