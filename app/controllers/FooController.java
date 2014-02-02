package controllers;

import play.mvc.*;
import play.libs.db.*;
import java.sql.*;

public class FooController extends Controller {
    public Result getFoo(long id) {
        Connection conn = DB.getConnection();
        try {
            ResultSet rs = conn.createStatement().executeQuery(
                    "select name from foo where id = " + id
            );
            rs.first();
            return ok("<html><body><p>" +
                    "The name of the foo is " + rs.getString("name") +
                    ".</p></body></html>");
        } finally {
            conn.close();
        }
    }
}
