package slc;
import java.awt.Container;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.Frame;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import bus.uigen.widgets.swing.DelegateJPanel;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.io.IOException;

import util.misc.StreamTokenizer;
import util.undo.CommandHistory;
import util.undo.HistoryUndoer;
import util.undo.ToggleUndoer;
import util.undo.Undoer;
import shapes.LineModel;
import shapes.OvalModel;
import slm.SLModel;
import slm.ShapesList;
import slm.SLUndoProxy;
import slgv.SLGView;
import sltv.SLTView;
import sltv.SLTokens;
import slgc.SLGController;
import sltc.SLTController;

import java.awt.Dimension;
import java.awt.Color;

//public class SLComposer extends JPanel
public class SLComposer 
{
  public final static int FRAME_WIDTH = 300;
  public Dimension getPreferredSize() {
    //Dimension d = super.getPreferredSize();
	Dimension d = getContainer().getPreferredSize();
    return d;
  }
   public Container getContainer() {
	   return container;
   }
   public void setContainer(Container theContainer) {
	   container = theContainer;
   }
    static public void main (String args[]) throws Exception
    {
        Frame frame = new Frame();
        SLComposer slComposer = new SLComposer(frame);
        frame.add(slComposer.getContainer());
        //frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        //frame.setLocation(numGViews*50, numGViews*50);
        //frame.add(controlPanel, BorderLayout.WEST);
        //add(slgView);
        frame.setVisible(true);
        System.out.println("Set main frame visible");
    }


    //private GridBagLayout gbLayout;
     int numGViews = 0;
     Undoer undoer;
    //private Undoer undoer = new ToggleUndoer();
     SLModel slModel;// = new SLModel();
     SLUndoProxy slModelUndoProxy;
    public SLComposer (Frame frame) throws Exception
    {
		init (frame, new SLModel());
        //System.out.println("SLComposer called");
        //Frame frame = new Frame("GraphicsView");
		
		System.out.println ("Cmposer called");
		busAgent = new BusAgentImpl("Drawing", true);	
		
		System.out.println("composer = " + busAgent.register(this, "composer"));
        System.out.println("undoer = " + busAgent.register(undoer = new HistoryUndoer(), "history_undoer"));
        setLayout(new BorderLayout());
        this.createSLGEditor(frame);
        //this.createSLTEditor();
        //int foo = System.in.read();
        //System.out.println("Read Value");
        //setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
	boolean showControlPanel = true;
    {
		init(frame, newSLModel);
	public SLComposer (Frame frame, SLModel newSLModel, boolean initShowControlPanel, Container theContainer) throws Exception
    {
		showControlPanel = initShowControlPanel;
		init(frame, newSLModel, theContainer);
	}
	
	public SLComposer() {
		showControlPanel = false;
		undoer = new HistoryUndoer();
		slModelUndoProxy = new SLUndoProxy();
	}
	
    {
		init(frame, newSLModel);
        //System.out.println("SLComposer called");
        //Frame frame = new Frame("GraphicsView");		
		if (newSLModel == null) return;		
		slModel = newSLModel;
		setLayout(new BorderLayout());
		//busAgent = new BusAgentImpl("Drawing", true);
		System.out.println("composer = " + busAgent.register(this, "composer"));
        System.out.println("undoer = " + busAgent.register(undoer = new HistoryUndoer(), "history_undoer"));
        //setLayout(new BorderLayout());
        this.createSLGEditor(frame);
        //this.createSLTEditor();
        //int foo = System.in.read();
        //System.out.println("Read Value");
        //setSize(300, 300);
		*/
    }
	public void init (Frame frame, SLModel newSLModel) throws Exception {
		init(frame, newSLModel, new JPanel());
	}
	public void init (Frame frame, SLModel newSLModel, Container theContainer) throws Exception {
		setContainer(theContainer);
		getContainer().setLayout(new BorderLayout());
		undoer = new HistoryUndoer();
		slModelUndoProxy = new SLUndoProxy();
		if (newSLModel == null) return;	
		setModel(newSLModel);
		slModel = newSLModel;
	}
		/*
		busAgent.register(busAgent);
		System.out.println("composer = " + busAgent.register(this, "composer"));
        System.out.println("undoer = " + busAgent.register(undoer = new HistoryUndoer(), "history_undoer"));
		*/
		
		setModel(newSLModel, null);
	}
	
	
		if (newSLModel == null) return;
			if (slModel == null) {
				slModel = newSLModel;
				connect();
				if (viewPanel == null)
				else
					createSLGEditor(viewPanel);
				System.out.println("newmodel" + newSLModel);
				System.out.println("composer = " + busAgent.register(this, "composer"));
				System.out.println("undoer = " + busAgent.register(undoer = new HistoryUndoer(), "history_undoer"));
				//setLayout(new BorderLayout());
				this.createSLGEditor(myFrame);
				
			} else {
				//System.out.println("changing model");
				slgController.setModel(slModel);
				slModel.addListener(slgView);
				slgView.setSLModel(slModel);				
		} catch (Exception e)
		{ System.out.println("exception ");}

    public SLModel getModel () { return slModel;}
		Frame frame = new Frame("GraphicsView");
	 SLGController slgController;
    public void createSLGEditor (Frame frame)throws Exception
    {
        connectEditor();
		
        numGViews++;
        //System.out.println("createSLGView");
        //frame.setSize(300,300);
        //frame.setLocation(numGViews*50, numGViews*50);
        //frame.add(controlPanel, BorderLayout.WEST);
        /*
        //add(slgView, BorderLayout.CENTER);
		add(scrollPane, BorderLayout.CENTER);
		*/
        getContainer().add(slgView.getContainer(), BorderLayout.CENTER);
		//uiFrame uiframe = uiGenerator.generateUIFrame(busAgent, null);
		//uiframe.setVisible(true);
        //slgView.setBackground(java.awt.Color.red);
	//frame.setVisible(true);
    }
    public void createSLGEditor (DelegateJPanel panel)throws Exception
    {
	    slgView = new SLGView();
	    slgView.setContainer(panel);
		slgController = new SLGController();
        connectEditor();
		
		//slgController.init(true);
		
        numGViews++;
        
        //getContainer().add(slgView.getContainer(), BorderLayout.CENTER);
		
		
    }
		//busAgent.register (slgView); 
		slModel.addListener(slgView);
		slgView.setSLModel(slModel);
		//busAgent.registerProxy(slModelUndoProxy,SLGController.class, "Model", "Controller","Model", "Controller", ShapesList.class);
		//busAgent.registerProxy(slModelUndoProxy,SLGController.class, "Model", null,"Model", null, ShapesList.class);
		//busAgent.registerProxy(slModelUndoProxy,Object.class, "Model", null,"Model", null, ShapesList.class);
        /*
            (this, slModelUndoProxy,slgView, frame, undoer);
		*/
        //slgView.setController(slgController);
		//busAgent.connect(slModel, "Listener");
        slgController = new SLGController
            (this, slModelUndoProxy,slgView, frame, undoer);
		
		
		slgController.setUndoer(undoer);
		slgController.init(showControlPanel, false);
		//busAgent.connect(slgController, "Model", slModel, "Controller");
		//busAgent.connect(slgController, "Model", slModel, null);
		//busAgent.connect(slgView, "Controller", slgController, null);
		slgView.setController(slgController);

    public void createSLTEditor ()
       throws IOException
    {
        SLTView slTView = new SLTView (slModelUndoProxy);
        slModel.addListener(slTView);
        SLTController slTController =
           new SLTController(this, slModelUndoProxy, undoer, new StreamTokenizer(System.in));
        slTController.processCommands();
    }


}
