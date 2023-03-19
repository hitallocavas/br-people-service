
package br.api.v1.brpeopleservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeopleResponse {
    private Info info;
    private List<Result> results;
}
