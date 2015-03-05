package controllers;

import java.io.IOException;

import models.Bill;
import play.mvc.*;
import utils.JsonReader;
import views.html.*;

/**
 * @author kinmanli
 *
 * Controller for showing the main bill page
 */
public class Application extends Controller {

    /**
     * @return a Result for the view to use to render
     * @throws IOException
     */
    public static Result index() throws IOException {
    	String endPoint = play.Play.application().configuration().getString("sky.bill.endpoint");
    	Bill bill = JsonReader.convertJsonToBill(endPoint);
        return ok(index.render("Your Sky Bill", bill));
    }    
}
