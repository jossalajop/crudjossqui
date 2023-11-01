package crud.ejemplocrud.compania;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity


public class Compania {
    @Id
    private long id;
    private String ruc;
    private String name;
    private String description;

    public long getId(){
        return id;
    }

    public String getRuc(){
        return ruc;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

}
