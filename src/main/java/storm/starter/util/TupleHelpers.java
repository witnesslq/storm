package storm.starter.util;

import backtype.storm.Constants;
import backtype.storm.tuple.Tuple;

public final class TupleHelpers {

  private TupleHelpers() {
  }

  public static boolean isTickTuple(Tuple tuple) {
//	    public static final String SYSTEM_COMPONENT_ID = "__system";
//	    public static final String SYSTEM_TICK_STREAM_ID = "__tick";	  
    return tuple.getSourceComponent().equals(Constants.SYSTEM_COMPONENT_ID) && tuple.getSourceStreamId().equals(
        Constants.SYSTEM_TICK_STREAM_ID);
  }

}
