
package br.api.v1.brpeopleservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private String city;
    private Coordinates coordinates;
    private String country;
    private Long postcode;
    private String state;
    private Street street;
    private Timezone timezone;
}
