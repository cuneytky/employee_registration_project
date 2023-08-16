package com.cydeo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {


//    @NotNull        --->    Field shouldn't be null
//    @NotEmpty       --->    Field shouldn't be ""
//    @NotBlank       --->    Field shouldn't be "       "

//    @NotNull  -> @NotNull
//    @NotEmpty -> @NotNull + @NotEmpty
//    @NotBlank -> @NotNull + @NotEmpty + @NotBlank

    // @Size(max = 12, min = 2)

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;

  //  @NotBlank
   // @Size(max = 12, min = 2)
    private String lastName;

    // Thmeleaf accepts yyyy-mm-dd, but Local Date accepts mm-dd-yyyy - yyyy-dd-mm

//   @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

//    @NonNull
//    @Email
    private String email;

  //  @NotBlank
 //   @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
}
