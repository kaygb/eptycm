package ink.wgb.eptycm;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name= "typecho_comments")
public class Comments {

    @Id
    @Column
    Integer cid;

    @Column
    String author;

    @Column
    String mail;

}
