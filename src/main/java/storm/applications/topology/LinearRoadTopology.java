package storm.applications.topology;

import org.apache.flink.storm.api.FlinkTopology;
import backtype.storm.Config;
import backtype.storm.generated.StormTopology;
import org.slf4j.Logger;

/**
 *
 * @author mayconbordin
 */
public class LinearRoadTopology extends BasicTopology {

    public LinearRoadTopology(String topologyName, Config config) {
        super(topologyName, config);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public FlinkTopology buildTopology() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConfigPrefix() {
        return "lr";
    }
    
}
