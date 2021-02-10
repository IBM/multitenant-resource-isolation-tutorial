package dev.odo.starter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/loadresources")
public class LoadResources {
    @GET
    public String getRequest(){
        long start = System.currentTimeMillis(); 
        SquareRoots sc = new SquareRoots();
        sc.startApplicationLoad(100000);
        long end = System.currentTimeMillis(); 
        return "CPU was loaded with squareroot computations for : "+ (end - start) + "ms";
    }

}
