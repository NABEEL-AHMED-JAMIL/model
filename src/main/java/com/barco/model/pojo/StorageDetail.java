package com.barco.model.pojo;

import com.barco.model.JsonBinaryType;
import com.barco.model.enums.KeyType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;


@Entity
@Table(name = "storage_detail")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class StorageDetail extends BaseEntity {

    @GenericGenerator(
        name = "keySequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "key_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "keySequenceGenerator")
    private Long id;

    @Column(nullable = false)
    private String storageKeyName;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private Object storageDetailJson;;

    // efs, aws, ftp, db(mysql,pg)
    @Column(nullable = false)
    private KeyType keyType;

    public StorageDetail() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStorageKeyName() { return storageKeyName; }
    public void setStorageKeyName(String storageKeyName) { this.storageKeyName = storageKeyName; }

    public Object getStorageDetailJson() { return storageDetailJson; }
    public void setStorageDetailJson(Object storageDetailJson) { this.storageDetailJson = storageDetailJson; }

    public KeyType getKeyType() { return keyType; }
    public void setKeyType(KeyType keyType) { this.keyType = keyType; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
