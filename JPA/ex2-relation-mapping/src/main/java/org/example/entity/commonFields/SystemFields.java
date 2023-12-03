package org.example.entity.commonFields;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class SystemFields {

    private String lastModifiedBy;
    private LocalDateTime lastModifiedDttm;
}
