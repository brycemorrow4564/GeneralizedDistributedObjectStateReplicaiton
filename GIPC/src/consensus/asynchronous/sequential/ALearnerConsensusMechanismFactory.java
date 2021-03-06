package consensus.asynchronous.sequential;

import sessionport.rpc.group.GIPCSessionRegistry;
import sessionport.rpc.group.GroupRPCSessionPort;
import consensus.AnAbstractConsensusMechanismFactory;
import consensus.ConsensusMechanism;
import consensus.synchronous.sequential.ASynchronousConsensusMechanism;

public class ALearnerConsensusMechanismFactory<StateType> extends AnAbstractConsensusMechanismFactory<StateType> {

	@Override
	protected ConsensusMechanism instantiateConsensusMehanism(
			GIPCSessionRegistry aRegistry, String anObjectName, short aMyId) {
		return new ALearnerConsensusMechanism(aRegistry, anObjectName, aMyId);
	}

}
