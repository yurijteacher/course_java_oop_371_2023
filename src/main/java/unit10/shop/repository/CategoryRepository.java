package unit10.shop.repository;

import unit10.shop.config.ConnectionToDB;
import unit10.shop.dao.CategoryDao;
import unit10.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDB implements CategoryDao {


    private final static String url = "jdbc:mysql://localhost:3306/text_course_oop_371_2023";
    private final static String username = "root";
    private final static String password = "root1234";

    private final Connection connection;

    // Statement -
    // PreparedStatement -
    // CallableStatement -

    public CategoryRepository() {
        this.connection = getConnection(url, username, password);
    }


    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `category`");

            while (resultSet.next()){

              int id = resultSet.getInt("id");
              String name =  resultSet.getString("name");
              String description = resultSet.getString("description");
              String image = resultSet.getString("image");

              Category category = new Category();

              category.setId(id);
              category.setName(name);
              category.setDescription(description);
              category.setImage(image);

              categories.add(category);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // err
        }


        return categories;
    }

    @Override
    public Category findById(Long id1) {

        Category category = new Category();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `category` where `id`='"+id1+"'");

            while (resultSet.next()){

                int id = resultSet.getInt("id");
                String name =  resultSet.getString("name");
                String description = resultSet.getString("description");
                String image = resultSet.getString("image");

                category.setId(id);
                category.setName(name);
                category.setDescription(description);
                category.setImage(image);

            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // err
        }

        return category;
    }

    @Override
    public Category findByName(String name) {
        Category category = new Category();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `category` where `name`='"+name+"'");

            while (resultSet.next()){

                int id = resultSet.getInt("id");
                String name1 =  resultSet.getString("name");
                String description = resultSet.getString("description");
                String image = resultSet.getString("image");

                category.setId(id);
                category.setName(name1);
                category.setDescription(description);
                category.setImage(image);

            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // err
        }

        return category;
    }

    @Override
    public void save(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();

            statement.execute("INSERT INTO `category` (`name`, `description`, `image`) VALUES ('"+category.getName()+"', '"+category.getDescription()+"', '"+category.getImage()+"');");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        }


    }

    @Override
    public void update(Category category) {

        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.executeUpdate("UPDATE `category` SET `name` = '"+category.getName()+"', `description` = '"+category.getDescription()+"', `image` = '"+category.getImage()+"' WHERE `id` = '"+category.getId()+"';");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    @Override
    public void delete(Category obj) {
        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM `category` WHERE `id`='"+obj.getId()+"'");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    @Override
    public void deleteAll() {
        Statement statement = null;
        try {
            statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM `category`");
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
