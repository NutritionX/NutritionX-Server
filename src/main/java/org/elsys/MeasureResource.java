package org.elsys;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("measure")
public class MeasureResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public float get() {
        return 0.1f;
    }
}
