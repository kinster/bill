import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.mvc.*;
import play.mvc.Http.*;
import play.libs.F.*;
import static play.mvc.Results.*;

/**
 * @author kinmanli
 * 
 * Global settings for the application
 */
public class Global extends GlobalSettings {
    
	
    public void onStart(Application app) {
    	// should run in background and return view
    }
    
    /**
     * If there is an exception render the error page
     */
    @Override
    public Promise<SimpleResult> onError(RequestHeader request, Throwable t) {
        return Promise.<SimpleResult>pure(internalServerError(
            views.html.errorPage.render(t)
        ));
    }
    
    /**
     * If you navigate to an unavailable action then render "page not found"
     */
    @Override
    public Promise<SimpleResult> onHandlerNotFound(RequestHeader request) {
        return Promise.<SimpleResult>pure(notFound(
            views.html.pageNotFound.render(request.uri())
        ));
    }
    
    /**
     * route found but unable to bind request parameters
     */
    @Override
    public Promise<SimpleResult> onBadRequest(RequestHeader request, String error) {
    	Logger.debug("error: " + error);
        return Promise.<SimpleResult>pure(badRequest(
        		views.html.errorPage.render(new Throwable("Bad Request"))
        ));
    }
}