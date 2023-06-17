package com.springboot.study.data.dto;

import com.springboot.study.config.annotation.Telephone;
import com.springboot.study.data.group.ValidationGroup1;
import com.springboot.study.data.group.ValidationGroup2;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidatedRequestDto {

    @NotBlank
    private String name;

    @Email
    private String email;

    @Telephone
    private String phoneNumber;

    @Min(value = 20)
    @Max(value = 40)
    private int age;

    @Size(min = 0, max = 40)
    private String description;

    @Positive()
    private int count;

    @AssertTrue
    private boolean booleanCheck;

}
