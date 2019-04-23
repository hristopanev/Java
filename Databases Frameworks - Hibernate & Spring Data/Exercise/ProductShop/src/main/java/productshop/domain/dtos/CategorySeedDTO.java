package productshop.domain.dtos;

import com.google.gson.annotations.Expose;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CategorySeedDTO {

    @Expose
    private String name;

    public CategorySeedDTO() {
    }

    @NotNull(message = "Name cannot be null.")
    @Size(min = 3, max = 15, message = "Name must be from 3 to 15 symbols long.")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
