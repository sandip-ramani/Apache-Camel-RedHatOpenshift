package com.redhat.training.messaging;

import com.redhat.training.carbonfootprintservice.CarbonFootprintResponse;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;


public class HttpAggregationStrategy implements AggregationStrategy {
public static final String FOOTPRINT_HEADER = "FOOT_PRINT";

public Exchange aggregate(Exchange original, Exchange resource) {

    CarbonFootprintResponse carbonFootprintResponse = resource.getIn().getBody(CarbonFootprintResponse.class);

    original.getIn().setHeader(FOOTPRINT_HEADER, carbonFootprintResponse.getCarbonFootprint());
    
    return original;
    }

}