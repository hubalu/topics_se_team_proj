package app.item;

import app.login.LoginController;
import app.util.Path;
import app.util.ViewUtil;
import org.apache.velocity.runtime.log.Log;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static app.util.RequestUtil.removeSessionAttrLoggedOut;
import static app.util.RequestUtil.removeSessionAttrLoginRedirect;

public class ItemContoller {
    public static Route uploadItem = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        Map<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, Path.Template.ITEM);
    };

    public static Route handleUploadItemPost = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        // database processing
        String item_name = request.queryParams("item_name");
        String item_desc = request.queryParams("description");
        String category = request.queryParams("category");
        Map<String, Object> model = new HashMap<>();
        //response.redirect("/hello");

        return item_name + "/" + item_desc + "/" + category;
    };
}
