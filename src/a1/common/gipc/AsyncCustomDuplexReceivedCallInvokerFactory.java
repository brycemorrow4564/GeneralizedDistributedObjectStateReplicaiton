package a1.common.gipc;

import inputport.datacomm.duplex.DuplexInputPort;
import inputport.rpc.RPCRegistry;
import inputport.rpc.duplex.AnAsynchronousSingleThreadDuplexReceivedCallInvoker;
import inputport.rpc.duplex.DuplexReceivedCallInvoker;
import inputport.rpc.duplex.LocalRemoteReferenceTranslator;

public class AsyncCustomDuplexReceivedCallInvokerFactory extends ACustomDuplexReceivedCallInvokerFactory {

	@Override
	public DuplexReceivedCallInvoker createDuplexReceivedCallInvoker(
			LocalRemoteReferenceTranslator aRemoteHandler,
			DuplexInputPort<Object> aReplier, RPCRegistry anRPCRegistry) {
		return new AnAsynchronousSingleThreadDuplexReceivedCallInvoker(
				super.createDuplexReceivedCallInvoker(aRemoteHandler, aReplier, anRPCRegistry));
	}
}