
package app.model;

import app.entities.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    
    private static Model instance = new Model();

    public static Model getInstance() {
        return instance;
    }
    
    private List<User> model;
    
    private Model() {
        model = new ArrayList<>();
    }
    
    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getUsername)
                .collect(Collectors.toList());
    }
}
