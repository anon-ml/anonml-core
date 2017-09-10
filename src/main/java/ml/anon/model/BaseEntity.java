package ml.anon.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
public class BaseEntity {


    @Id
    private String id;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date lastModified;
}
