package ru.cbrrate.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.*;

//@Value
//@AllArgsConstructor(onConstructor = @__(@JsonCreator))
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyRate {
    String numCode;
    String charCode;
    String nominal;
    String name;
    String value;

}
