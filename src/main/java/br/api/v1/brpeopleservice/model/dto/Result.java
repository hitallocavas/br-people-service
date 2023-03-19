
package br.api.v1.brpeopleservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String cell;
    private Dob dob;
    private String email;
    private String gender;
    private Id id;
    private Location location;
    private Login login;
    private Name name;
    private String nat;
    private String phone;
    private Picture picture;
    private Registered registered;
}
