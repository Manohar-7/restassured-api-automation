package com.api.filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilter implements Filter {
    private static final Logger logger= LogManager.getLogger(LoggingFilter.class);
    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification, FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
        LogRequest(filterableRequestSpecification);
        Response response=filterContext.next(filterableRequestSpecification,filterableResponseSpecification); //request to going to execute
        LogResponse(response);
        return response;
    }

    public void LogRequest(FilterableRequestSpecification filterableRequestSpecification){
        logger.info("BASE URI:"+filterableRequestSpecification.getBaseUri());
        logger.info("Request Header:"+filterableRequestSpecification.getHeaders());
        logger.info("Request payload:"+filterableRequestSpecification.getBody());
    }

    public void LogResponse(Response response){
        logger.info("Status code:"+response.statusCode());
        logger.info("Response Header:"+response.headers());
        logger.info("Response Body:"+response.getBody().prettyPrint());
    }
}
