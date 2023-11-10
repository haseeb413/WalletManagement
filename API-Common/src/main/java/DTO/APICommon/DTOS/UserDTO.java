package DTO.APICommon.DTOS;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;

    private String name;

    private String address;

    private Long walletId;


    LocalDateTime createdDate;

    LocalDateTime updatedDate;

    String deleted;
}
