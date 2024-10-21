package airhacks.rockets.boundary;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("rockets")
public class RocketsResource {
    
    @GET
    public String get(){
        return "🚀🛸";
    }
}
