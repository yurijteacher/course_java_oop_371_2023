package unit10.shop;

import unit10.shop.entity.Category;
import unit10.shop.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CategoryRepository categoryRepository = new CategoryRepository();

        Category category = new Category();
        category.setName("beer");
        category.setDescription("sad sad as dsa");
        category.setImage("/images/beer.jpg");

//        categoryRepository.save(category);

        List<Category> categories = new ArrayList<>();
        categories = categoryRepository.findAll();

        for (Category c : categories
             ) {
            System.out.println(c);
        }


        Category category1 = categoryRepository.findById(2L);


        category1.setName("apple");

        categoryRepository.update(category1);

        List<Category> categories1 = new ArrayList<>();
        categories1 = categoryRepository.findAll();

        for (Category c : categories1
        ) {
            System.out.println(c);
        }

        categoryRepository.delete(category1);

        List<Category> categories2 = new ArrayList<>();
        categories2 = categoryRepository.findAll();


        for (Category c : categories2) { System.out.println(c); }



    }


}
