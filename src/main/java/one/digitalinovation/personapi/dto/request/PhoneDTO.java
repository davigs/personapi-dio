package one.digitalinovation.personapi.dto.request;

import one.digitalinovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PhoneDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
