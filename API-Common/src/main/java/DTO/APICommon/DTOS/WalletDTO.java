package DTO.APICommon.DTOS;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class WalletDTO {

    Long walledId;

    Long userId;

    BigDecimal balance;
}
