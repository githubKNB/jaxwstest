/**
 * 
 */
package com.jaxrstest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.jaxrstest.helper.DetailsHelper;

/**
 * @author niranjan
 *
 */
@Path("/jaxservice")
public class JaxService {

	@GET
	@Produces("application/xml")
	public String getDetails(){
		return DetailsHelper.getServiceDetails();
	}
}
