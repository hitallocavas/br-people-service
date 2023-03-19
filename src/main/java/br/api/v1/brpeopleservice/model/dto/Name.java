
package br.api.v1.brpeopleservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    private String first;
    private String last;
    private String title;
}
