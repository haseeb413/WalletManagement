package common.dtos.Constant;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;

    private String name;

    private String address;

    private Long walletId;


    LocalDateTime createdDate;

    LocalDateTime updatedDate;

    String deleted;
}
