package airhacks.rockets.boundary;


import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("rockets")
public class RocketsResource {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String get(){
        return "🚀🛸";
    }
}
