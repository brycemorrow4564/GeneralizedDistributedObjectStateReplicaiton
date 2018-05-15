package slgc;
import java.awt.Frame;
import java.awt.Panel;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.BorderLayout;

import slm.ShapesList;
import slc.SLComposer;
import slgc.ButtonAdapter;
    {
        //private SLComposer slComposer;
        //private SLModel slModel;
        //private SLGView slGView;
        //private Panel controlPanel;
        private MouseController mouseController;
        public TextPromptDialog newShapeDialog, fileNameDialog;
		
		
        public SLGController (SLComposer theSLComposer, ShapesList theSLModel,
            SLGView theSLGView, Frame theFrame, Undoer theUndoer)
        {
            //slComposer = theSLComposer;
            //slModel = theSLModel;
            //slGView = theSLGView;
            undoer = theUndoer;
            //Panel theControlPanel = new Panel();
            //theControlPanel.setLayout(new GridLayout(14,1));
            newShapeDialog = new TextPromptDialog(theFrame, "Enter Shape Label");
            fileNameDialog = new TextPromptDialog(theFrame, "Enter File Name");
	    CreateCommands(controlPanel, theSLModel, theSLGView, theSLComposer);
            CreateModes(controlPanel, theSLModel, theSLGView);
            //theSLGView.setMouseController(mouseController);
			numComponents = components.size();
            theSLComposer.add(controlPanel, BorderLayout.WEST);
            */
		boolean initShowControlPanel = true;
		
            SLGView theSLGView, Frame theFrame, Undoer theUndoer, boolean initShowControlPanel)
        {
			//showControlPanel = initShowControlPanel;
            //slComposer = theSLComposer;
            //slModel = theSLModel;
            //slGView = theSLGView;
            undoer = theUndoer;
            //Panel theControlPanel = new Panel();
            //theControlPanel.setLayout(new GridLayout(14,1));
            newShapeDialog = new TextPromptDialog(theFrame, "Enter Shape Label");
            fileNameDialog = new TextPromptDialog(theFrame, "Enter File Name");
	    CreateCommands(controlPanel, theSLModel, theSLGView, theSLComposer);
            CreateModes(controlPanel, theSLModel, theSLGView);
            //theSLGView.setMouseController(mouseController);
			numComponents = components.size();
            theSLComposer.add(controlPanel, BorderLayout.WEST);
            */
		
		/*
            SLGView theSLGView, Frame theFrame, Undoer theUndoer)
        {
            setComposer(theSLComposer);
        }
		*/
        {
            
        }
			return retVal; 
		public Vector getAlwaysExcludeFacets() {
								"EnabledComponent", 
								 "EnabledComponents", 
								 "VisibleComponent", 
								 "VisibleComponents" ,
								 "Incremental",
								  "NewShapeDialog",
								 
			return toVector (tempArray);
		*/	
		
		
		SLComposer slComposer;
			//System.out.println("composer" + theSLComposer);
		ShapesList slModel;
			//System.out.println("set model in controller" + theSLModel);
		
		public void setView (SLGView theSLGView) {			
			//System.out.println("view" + theSLGView);
			slgView = theSLGView;
		}
		Undoer undoer;	
		
			//System.out.println("undoer" + theUndoer);
		Frame frame;		
			//System.out.println ("frame" + theFrame);
		BusAgent busAgent;
			System.out.println ("busAgent" + theBusAgent);
		ScrollPane spane = new ScrollPane();
		boolean register = false;
		public void init() {
		}
		public void init(boolean initShowControlPanel, boolean registerParam) {
		}
			//System.out.println ("frame" + frame);
			newShapeDialog = new TextPromptDialog(frame, "Enter Shape Label");
            fileNameDialog = new TextPromptDialog(frame, "Enter File Name");			
			//CreateCommands(controlPanel, slModel, slgView, slComposer);
            //CreateModes(controlPanel, slModel, slgView);
            //theSLGView.setMouseController(mouseController);
			numComponents = components.size();
			//slComposer.add(spane, BorderLayout.WEST);
			//slComposer.getContainer().add
            slComposer.getContainer().add(controlPanel, BorderLayout.WEST);
							   SLGView theSLGView, Frame theFrame, Undoer theUndoer, boolean initShowControlPanel) {
            slModel = theSLModel;
            slgView = theSLGView;
            undoer = theUndoer;
		}
        private void CreateCommands(Panel parentPanel, ShapesList slModel,
            SLGView slgView, SLComposer slComposer)
        {
            try
            {
                //CreateButton(parentPanel, "Refresh", slgView,
                    //Class.forName("slgc.RefreshAdapter"));
                CreateButton(parentPanel, "Undo", slgView,
                    Class.forName("slgc.UndoAdapter"));
                CreateButton(parentPanel, "Redo", slgView,
                    Class.forName("slgc.RedoAdapter"));
                CreateButton(parentPanel, "Clear", slModel,
                    Class.forName("slgc.ClearAdapter"));
                CreateButton(parentPanel, "Load", slModel,
                    Class.forName("slgc.LoadAdapter"));
                    //Class.forName("slgc.LoadAdapter"));
                CreateButton(parentPanel, "Save", slModel,
                    Class.forName("slgc.SaveAdapter"));
                CreateButton(parentPanel, "Keys", slgView,
                    Class.forName("slgc.KeysAdapter"));				
                CreateButton(parentPanel, "Labels", slgView,
                    Class.forName("slgc.LabelsAdapter"));
                CreateButton(parentPanel, "Prompt", this,
                    Class.forName("slgc.PromptAdapter"));
                    Class.forName("slgc.IncrementalAdapter"));
                CreateButton(parentPanel, "NewView", slComposer,
                    Class.forName("slgc.NewViewAdapter"));
            }
            catch (Exception e)
            {
                System.err.println("The perils of extreme parameterization:" + e.toString());
            }
        }
		/*
        {
            try
            {
                //CreateButton(parentPanel, "Refresh", slgView,
                    //Class.forName("slgc.RefreshAdapter"));
                CreateButton(parentPanel, "Undo", slgView,
                    Class.forName("slgc.UndoAdapter"));
                CreateButton(parentPanel, "Redo", slgView,
                    Class.forName("slgc.RedoAdapter"));
                CreateButton(parentPanel, "Clear", slModel,
                    Class.forName("slgc.ClearAdapter"));
                //CreateButton(parentPanel, "Load", slModel,
                    //Class.forName("slgc.LoadAdapter"));
                    Class.forName("slgc.LoadAdapter"));
                CreateButton(parentPanel, "Save", slModel,
                    Class.forName("slgc.SaveAdapter"));
                CreateButton(parentPanel, "Keys", slgView,
                    Class.forName("slgc.KeysAdapter"));
                CreateButton(parentPanel, "Prompt", this,
                    Class.forName("slgc.PromptAdapter"));
                    Class.forName("slgc.IncrementalAdapter"));
                //CreateButton(parentPanel, "NewView", slComposer,
                    //Class.forName("slgc.NewViewAdapter"));
            }
            catch (Exception e)
            {
                System.err.println("The perils of extreme parameterization:" + e.toString());
            }
        }
		*/
        {
			ButtonAdapter button;
            try
            {
                //CreateButton(parentPanel, "Refresh", slgView,
                    //Class.forName("slgc.RefreshAdapter"));
                button = CreateButton(parentPanel, "Undo",
                    Class.forName("slgc.UndoAdapter"));
				if (!register) {
				   ((UndoAdapter) button).setUndoer(undoer);
                button = CreateButton(parentPanel, "Redo", 
                    Class.forName("slgc.RedoAdapter"));
				   ((RedoAdapter) button).setUndoer(undoer);
                button = CreateButton(parentPanel, "Clear", 
                    Class.forName("slgc.ClearAdapter"));				
                    Class.forName("slgc.LoadAdapter"));								
                button = CreateButton(parentPanel, "Save", 
                    Class.forName("slgc.SaveAdapter"));												
                button = CreateButton(parentPanel, "Keys", 
                    Class.forName("slgc.KeysAdapter"));																
                button = CreateButton(parentPanel, "Labels", 
                    Class.forName("slgc.LabelsAdapter"));												
                CreateButton(parentPanel, "Prompt", 
                    Class.forName("slgc.PromptAdapter"));
				button = CreateButton(parentPanel, "Label", 
                    Class.forName("slgc.LabelAdapter"));
				/*
                    Class.forName("slgc.IncrementalAdapter"));
				*/
                CreateButton(parentPanel, "NewView", slComposer,
                    Class.forName("slgc.NewViewAdapter"));
            }
            catch (Exception e)
            {
                System.err.println("The perils of extreme parameterization:" + e.toString());
            }
        }
    
        private void CreateModes (Panel parentPanel, ShapesList slModel, SLGView slgView)
        {
            try
            {
                CheckboxGroup modes = new CheckboxGroup();
                CreateCommandMode(modes,"Move", parentPanel, slModel, slgView,
                    Class.forName("slgc.MoveController"));
                CreateCommandMode(modes,"Resize", parentPanel, slModel, slgView,
                    Class.forName("slgc.ResizeController"));
                CreateCommandMode(modes,"Delete", parentPanel, slModel, slgView,
                    Class.forName("slgc.DeleteController"));
                CreateCommandMode(modes,"Line", parentPanel, slModel, slgView,
                    Class.forName("slgc.NewLineController"));
                CreateCommandMode(modes,"Oval", parentPanel, slModel, slgView,
                    Class.forName("slgc.NewOvalController"));
                CreateCommandMode(modes,"Rectangle", parentPanel, slModel, slgView,
                    Class.forName("slgc.NewRectangleController"));
                    //Class.forName("slgc.ComponentController"));
            }
            catch (Exception e)
            {
                System.err.println("The perils of extreme parameterization:" + e.toString());
                e.printStackTrace();
            }
        }
	
        {
            try
            {
                CheckboxGroup modes = new CheckboxGroup();
                CreateCommandMode(modes,"Select", parentPanel,
                    Class.forName("slgc.SelectOperandController"));
                    Class.forName("slgc.MoveController"));
                CreateCommandMode(modes,"Resize", parentPanel, 
                    Class.forName("slgc.ResizeController"));
                CreateCommandMode(modes,"Delete", parentPanel, 
                    Class.forName("slgc.DeleteController"));
                CreateCommandMode(modes,"Line", parentPanel, 
                    Class.forName("slgc.NewLineController"));
                CreateCommandMode(modes,"Oval", parentPanel, 
                    Class.forName("slgc.NewOvalController"));
                CreateCommandMode(modes,"Rectangle", parentPanel,
                    Class.forName("slgc.NewRectangleController"));
                    Class.forName("slgc.IncrementalController"));
				incrementalCheckbox.setState(incremental);
                    Class.forName("slgc.PromptController"));
            }
            catch (Exception e)
            {
                System.err.println("The perils of extreme parameterization:" + e.toString());
                e.printStackTrace();
            }
        }		
		public void repaintView() {
		}
		Vector selectionListeners = new Vector();
		public void addSelectionListener(SelectionListener listener) {
		}
		public void removeSelectionListener(SelectionListener listner) {
		}
			selectOperandController.select(key, shapeModel);
			selectOperandController.unselect(key, shapeModel);
		public void shapeSelected(String newVal) {
			  selectedShape = slModel.get(selection);
		    else
				selectedShape = null;
			notifySelectionListeners();
		}
			for (Enumeration elements = selectionListeners.elements();
				 elements.hasMoreElements();)
				((SelectionListener) elements.nextElement()).selectionChanged(selection, selectedShape);
		public String getSelection() {
		}
		public RemoteShape getSelectedShape() {
			
		}
		
		public void setSelectOperandController(SelectOperandController newVal) {
		}
		public SelectOperandController getSelectOperandController() {
		}
		Dictionary components = new Hashtable();
        private void CreateButton(Panel parentPanel,String buttonName,
            Object target, Class adapterClass)
        {
            try
            {
                Button button = new Button( buttonName);
                ButtonAdapter adapter = (ButtonAdapter) adapterClass.newInstance();
                adapter.init(target, this);
                button.addActionListener(adapter);
                parentPanel.add(button);
            }
            catch (Exception e)
            {
                System.err.println("Tried to instantiate " + adapterClass.getName());
                e.printStackTrace();
            }

        }
        {
            try
            {
                Button button = new Button( buttonName);
                   //busAgent.register (adapter); 
                button.addActionListener(adapter);
                parentPanel.add(button);
            }
            catch (Exception e)
            {
                System.err.println("Tried to instantiate " + adapterClass.getName());
                e.printStackTrace();
            }

        }
		TextField textField;
        {
			try {
                //busAgent.register (textField);
				if (register)
                parentPanel.add(textField);
				return textField;
				return null;
        }

        private Checkbox CreateCommandMode(CheckboxGroup modes, String modeName,
            Panel parentPanel, ShapesList slModel, SLGView slgView,
            Class mouseControllerClass)
        {
            try
            {
                Checkbox checkbox = new Checkbox(modeName, modes, false);
                components.put(modeName, checkbox);
                    (MouseController) mouseControllerClass.newInstance();
				//mouseControllers.put(modeName, mouseController);
                mouseController.init(slModel, slgView, this);
                checkbox.addItemListener(mouseController);
                parentPanel.add(checkbox);
            }
            catch (Exception e)
            {
                System.err.println("Tried to instantiate " + mouseControllerClass.getName());
            }
        }
			SelectOperandController controller = new SelectOperandController();
			controller.init(slModel, slgView, this);
			setSelectOperandController((SelectOperandController) controller);					
			slgView.setMouseController(controller);
		
            Panel parentPanel, Class controllerClass)
        {
            try
            {
                Checkbox checkbox = new Checkbox(modeName, modes, false);
                components.put(modeName, checkbox);
				Object controller;
				if (controllerClass.equals(Class.forName("slgc.SelectOperandController")))
					controller = this.getSelectOperandController();
				else
				if (controller instanceof MouseController) {
				} else
					mouseController = null;
				    //busAgent.register (controller); 
				else if (mouseController != null) {
					mouseController.init(slModel, slgView, this);
					if (mouseController instanceof NewComponentController) 
				} else if (controller instanceof PromptController) {
				}
				    //slgView.setMouseController(mouseController);
				/*
                    (MouseController) mouseControllerClass.newInstance());
				//mouseControllers.put(modeName, mouseController);
                //mouseController.init(slModel, slgView, this);
                //checkbox.addItemListener(mouseController);
                parentPanel.add(checkbox);
            }
            catch (Exception e)
            {
                System.err.println(e + "Tried to instantiate " + controllerClass.getName());
            }
        }
		
		public void setVisibleComponents(boolean isVisible) {
			
		public void removeComponents() {
			numComponents--;
			setControlPanelLayout();
            controlPanel.setLayout(new GridLayout(numComponents,1));
			//controlPanel.setLayout(new GridLayout(1, numComponents));
		public void setControlPanelBackground (Color c) {
			Enumeration e = components.elements();
		
		public void togglePrompt() {
		
		public void setPrompt(boolean newPrompt) {
			if (promptCheckbox != null)
				promptCheckbox.setState(prompt);
		private boolean incremental = false;
		public void toggleIncremental() {
			if (incrementalCheckbox != null)
				incrementalCheckbox.setState(incremental);
		public void setIncremental(boolean newIncremental) {
		
		Vector uneditableKeys = new Vector();
		public void setUneditable(String key) {
		}
		public boolean isEditable(String key) {
		}
		Vector undeletableKeys = new Vector();
		public void setUndeletable(String key) {
		}
		public boolean isDeletable(String key) {
		}
		Object register(Object o) throws Exception {
			/*
		    return retVal;
			*/
		

    }
