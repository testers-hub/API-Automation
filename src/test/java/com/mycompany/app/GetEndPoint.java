//Validate the Homefeed TrendingStoriesCard.
package com.mycompany.app;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

//This script has been validate the Home feed API responses  
@RunWith(SerenityRunner.class)
public class GetEndPoint
{
    private String accessToken = "YWMtoV7sgKocEeir71XixoDLpXou5zLKRxO2Fg3uwuAeo";
    public String apiUrl = "http://api.endpoint/";
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
	public GetEndPoint() {
}

	@Title(" This Test Validate the Responsecode")
	@Test
        public void responseCode() {    
		SerenityRest.given().
        header("Authorization","Bearer"+ ' '+ accessToken).
                when().get(apiUrl).
                then().    
                    assertThat().
                    statusCode(200).
                    header("Content-Type",equalTo("application/vnd.api+json"));                    
                                
        
}              

    	
	@Title(" Validate the response Time")

		@Test
            public void responseTime()  
    	{
    		SerenityRest.given().header("Authorization","Bearer"+ ' '+ accessToken)
              .when ().get (apiUrl)
             .then ().time(lessThan (20000L));
        } 
}