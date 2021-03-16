package uk.co.rspievakc.springcassandrademo.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@ToString
@Data
public class User {

    @PrimaryKey
    private final String id;

    private final String name;
    private final int age;

}
