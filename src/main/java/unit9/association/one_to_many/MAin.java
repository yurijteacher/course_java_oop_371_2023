package unit9.association.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class MAin {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1);
        category.setName("beer");
        category.setDescription("sdfd sdf dsf ");


        Product beer1 = new Product();
        beer1.setId(1);
        beer1.setName("beer1");
        beer1.setDescription("sdf sdf dsf dsf ");
        beer1.setImages(List.of("image1.jpg", "image2.jpg"));
        beer1.setCategory(category);

        Product beer2 = new Product();
        beer2.setId(2);
        beer2.setName("beer2");
        beer2.setDescription("ssdf dsf dsf ");
        beer2.setImages(List.of("image3.jpg", "image4.jpg"));
        beer2.setCategory(category);


    }
}
