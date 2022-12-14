package com.redhat.training.combine;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CombineRouteBuilder extends RouteBuilder {
    private static String SEPARATOR = System.getProperty("line.separator");

    @Override
    public void configure() throws Exception {
        from( "file:orders/incoming?noop=true" )
	.routeId( "split-combine-pipeline" )
        // TODO: Split and Aggregate
        .split( body().tokenize( SEPARATOR ) )
        .aggregate( constant(true),(oldExchange, newExchange)->{
            if (oldExchange == null){
                return newExchange;
            }
            String oldBody = oldExchange.getIn().getBody( String.class );
            String newBody = newExchange.getIn().getBody( String.class );
            oldExchange.getIn().setBody( oldBody + SEPARATOR + newBody );
            return oldExchange;
        })
        .completionSize( 10 )
        .to( "file:orders/outgoing?fileName=orders2.csv" );
    }
}
