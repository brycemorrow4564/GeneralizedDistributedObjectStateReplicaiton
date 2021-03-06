package a4;

import inputport.rpc.duplex.ADuplexSentCallCompleterFactory;
import inputport.rpc.duplex.DuplexRPCInputPort;
import inputport.rpc.duplex.DuplexSentCallCompleter;
import inputport.rpc.duplex.LocalRemoteReferenceTranslator;

public class SynchronousSentCallCompleterFactory extends ADuplexSentCallCompleterFactory {
	
	@Override
	public DuplexSentCallCompleter createDuplexSentCallCompleter(
			 DuplexRPCInputPort anInputPort, LocalRemoteReferenceTranslator aTranslator) {
		return new SynchronousSentCallCompleter(anInputPort, aTranslator);
	}
	
}
