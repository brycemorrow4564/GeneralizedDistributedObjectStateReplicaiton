package a1.client.nio;

import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;

import a1.client.SimulationClient;
import a1.common.Util;
import a1.common.InitialConfigurations.BroadcastMode;
import a1.common.message.Message;
import a1.common.message.Message.MsgType;
import a1.common.nio.NIOByteBufferWrapper;

public class NIOClientCommunicatorProcessor implements Runnable {
	
	ArrayBlockingQueue<NIOByteBufferWrapper> commandQueue;
	SimulationClient client; 
	
	public NIOClientCommunicatorProcessor(ArrayBlockingQueue<NIOByteBufferWrapper> commandQueue, SimulationClient client) {
		this.commandQueue = commandQueue; 
		this.client = client; 
	}
	
	private void processMessage(Message msg) {
		if (Util.getBroadcastModeFromState() == BroadcastMode.ATOMIC) {
			client.getSimulation().setConnectedToSimulation(true);
			client.getSimulation().processCommand(msg.getCommandToExecute());
			client.getSimulation().setConnectedToSimulation(false);
		} else {
			client.getSimulation().processCommand(msg.getCommandToExecute());
		}
	}
	
	@Override
	public void run() {
		NIOByteBufferWrapper wrapper = null; 
		ByteBuffer buf = null;
		while (true) {
			try   { 
				wrapper = this.commandQueue.take(); 
				buf	= wrapper.getByteBuffer(); 
				byte[] arr = new byte[buf.remaining()];
				buf.get(arr);
				Message msg = Util.deserializeMessage(arr);
				processMessage(msg); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
		}
	}

}
