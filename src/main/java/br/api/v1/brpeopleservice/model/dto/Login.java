
package br.api.v1.brpeopleservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    private String md5;
    private String password;
    private String salt;
    private String sha1;
    private String sha256;
    private String username;
    private String uuid;
}
