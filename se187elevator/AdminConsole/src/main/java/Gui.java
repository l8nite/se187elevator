import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Gui.java
 *
 * Created on May 8, 2010, 8:13:23 AM
 */

/**
 *
 * @author athuluru
 */
public class Gui extends javax.swing.JFrame {

    //private JComboBox jComboBox11;
	//private JLabel jLabel15;
	/** Creates new form Gui */
    public Gui() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3=  new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        
        //jLabel15 = new javax.swing.JLabel();
        
        jComboBox10 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        Authors = new javax.swing.JMenu();
        setjMenuItem2(new javax.swing.JMenuItem());
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.controlHighlight);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setText("Elevator System");
        
        
        
        //jLabel16 = new javax.swing.JLabel();
        
        
        
        //jComboBox11 = new javax.swing.JComboBox();
        

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		String numCars = (String)jComboBox2.getSelectedItem();
        		int numbCar=Integer.parseInt(numCars);

        		arrCombo.clear();	
        		if(numbCar == 1)
        			return;

        		selectionFrame = new JFrame("Select User Panel type");
        		selectionFrame.setVisible(true);
        		selectionFrame.setSize(200,150);

        		JPanel panel = new JPanel();
        		selectionFrame.add(panel);
        		selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		jButton3.setText("Apply");
        		jButton3.addActionListener(new ok());
        		///Combobox setting//////////////////////////////////	
        		javax.swing.GroupLayout layout11 = new javax.swing.GroupLayout(getContentPane());
        		getContentPane().setLayout(layout11);
        		JComboBox j1;
        		JLabel jl1;
        		for(int j=0;j<numbCar;j++){
        			//JLabel lbl= new JLabel("testing");

        			j1 = new JComboBox();
        			jl1 = new javax.swing.JLabel();
        			jl1.setText("Car "+(j+1));
        			j1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seq", "Even", "Odd"}));
        			//javax.swing.GroupLayout layout11 = new javax.swing.GroupLayout(getContentPane());
        			//getContentPane().setLayout(layout11);

        			/*layout11.setHorizontalGroup(
   						layout11.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   						.addGroup(layout11.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   								.addComponent(jl1))
   								.addGap(18, 18, 18)
   								.addGroup(layout11.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
   										.addComponent(j1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
   				);


   				layout11.setVerticalGroup(
   						layout11.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   						.addGroup(layout11.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   								.addGroup(layout11.createSequentialGroup()
   										.addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
   								)
   								.addGroup(layout11.createSequentialGroup()
   										.addComponent(jl1))
   						)
   				);*/

        			//rrCombo.
        			panel.add(jl1);
        			panel.add(j1);
        			arrCombo.add(j1);
        			//j1 = null;
        			//jl1 = null;
        		}
        		panel.add(jButton3);

        		//selectionFrame.
        		selectionFrame.setVisible(true);
        		//jComboBox2.actionPerformed(evt);        		
        	}
        });
        /*JFrame frame = new JFrame("Selecting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComboBox j1=new JComboBox(new String[] {"currrent","even","odd"});
        frame.add(j1,BorderLayout.SOUTH);*/
        
        
        /*ItemListener itemListener = new ItemListener(){
        	public void 
        };*/
        
        
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Door", "Double Door", "Alternate Single/Double Door" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green", "Blue", "Red", "Yellow" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Green", "Red", "Yellow" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Green", "Red", "Yellow" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blue", "Green", "Red", "Yellow", " " }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Text", "Symbol" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Text", "Symbol" }));

        jLabel2.setText("Number of Floors");

        jLabel3.setText("Number of Cars");

        jLabel4.setText("Door Configuration");

        
        //jLabel15.setText("User Selection Type");
        
        jLabel5.setText("User Panel Color");

        jLabel6.setText("User Panel Pressed Button Color");

        jLabel7.setText("Floor Panel Color");

        jLabel8.setText("Floor Panel Pressed Button Color");

        jLabel9.setText("Floor Panel Display");

        jLabel10.setText("Door Panel Display");

        jButton2.setText("Show Elevator");
        
        jButton2.addActionListener(new ShowElevator());
        
             
        jLabel11.setText("Algorithm Type");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shortest Path", "Random", "Highest Floor First" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        
        
        /*String numCars = (String)jComboBox2.getSelectedItem();
		int numbCar=Integer.parseInt(numCars);
        for(int j=0;j<numbCar;j++){
        	JComboBox x= new JComboBox();
        	x.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current", "Even", "Odd"}));
        	//jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current", "Even", "Odd"}));
        }
        */
        //jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current", "Even", "Odd"}));
        jMenuItem1.addActionListener(new Authors());

        Authors.setBackground(java.awt.SystemColor.control);
        Authors.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        Authors.setText("About");
        Authors.setFont(new java.awt.Font("Times New Roman", 0, 12));

       /* jMenuItem2.setText("Elevator System");
        Authors.add(jMenuItem2);
*/
        jMenuItem1.setText("Authors");
        Authors.add(jMenuItem1);

        jMenuBar1.add(Authors);

        setJMenuBar(jMenuBar1);
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    //.addComponent(jLabel15)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                    
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)            
                    //.addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
                
                
               
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        
                        
                        
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)                		
                		
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                /*.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)*/
                 
                         
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );
        
        pack();
    }// </editor-fold>

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }     
   //private void jComboBox1
   class ok implements ActionListener{
	   public void actionPerformed(ActionEvent arg0) {
		   
		   System.out.println(arrCombo.size());
		   
		   for(int i=0;i<arrCombo.size();i++){
			   System.out.println(arrCombo.get(i).getSelectedItem());
			   String selection =(String)arrCombo.get(i).getSelectedItem();
			   if(selection.equalsIgnoreCase("Seq")){
		    		  lst.add(new Integer(0));
		    	  }
			   if(selection.equalsIgnoreCase("Even")){
				   System.out.println("even");
				   lst.add(new Integer(1));
		    	  }
			   if(selection.equalsIgnoreCase("Odd")){
				   lst.add(new Integer(2));
			   }	    
		   }
		   GuiConfiguration.setSelectioArray(lst);
		   selectionFrame.setVisible(false);
		   /*for(int j=0;j<lst.size();j++){
			   System.out.println(GuiConfiguration.getSelectioArray().get(j).intValue());
			  
		   }*/
		   
		  //ElevatorConfigurationReader.showElevator();
	   }
	   
   }
    class ShowElevator implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			String numFloors = (String)jComboBox1.getSelectedItem();
			GuiConfiguration.setNumOfFloors(Integer.parseInt(numFloors));
			
			String numCars = (String)jComboBox2.getSelectedItem();
			GuiConfiguration.setNumOfCars(Integer.parseInt(numCars));
			
			String doorConfig = (String)jComboBox3.getSelectedItem();
			GuiConfiguration.setDoorConfiguration(doorConfig.toString());
			
			String usrPnlColor = (String)jComboBox4.getSelectedItem();
			GuiConfiguration.setUserPanelColor(usrPnlColor.toString());
			
			String usrPnlBtnPressedColor = (String)jComboBox5.getSelectedItem();
			GuiConfiguration.setUserPanelPressedButtonColor(usrPnlBtnPressedColor.toString());
			
			String flrPnlClr = (String)jComboBox6.getSelectedItem();
			GuiConfiguration.setFloorPanelColor(flrPnlClr.toString());
			
			String flrPnlPressedBtnColor = (String)jComboBox7.getSelectedItem();
			GuiConfiguration.setFloorPanelPressedButtonColor(flrPnlPressedBtnColor.toString());
			
			String flrPnlDisplay = (String)jComboBox8.getSelectedItem();
			GuiConfiguration.setFloorPanelDisplay(flrPnlDisplay.toString());
			
			String doorPnlDisplay = (String)jComboBox9.getSelectedItem();
			GuiConfiguration.setDoorPanelDisplay(doorPnlDisplay.toString());
			
			String algoType = (String)jComboBox10.getSelectedItem();
			GuiConfiguration.setAlgorithmType(algoType.toString());
			
			//String userPanelType = (String)jComboBox11.getSelectedItem();
			
			/*if(userPanelType.equalsIgnoreCase("Current")){
	    		  GuiConfiguration.setUserPanelType(0);
	    	  }
  	   if(userPanelType.equalsIgnoreCase("Even")){
  		 GuiConfiguration.setUserPanelType(1);
	    	  }
  	   if(userPanelType.equalsIgnoreCase("Odd")){
  		 GuiConfiguration.setUserPanelType(2);
	    	  }	    
			*/
			//GuiConfiguration.setSelectioArray(lst);
			
			ElevatorConfigurationReader.showElevator();
			
		}
    	
    }
    
    
    static class Authors implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JFrame AboutFrame = new JFrame("Authors");
			AboutFrame.setVisible(true);
			AboutFrame.setSize(200,150);
			JLabel label = new JLabel("Shaun Guth");
			JLabel label1 = new JLabel("Frode Bjerke");
			JLabel label2 = new JLabel("Ash Islam");
			
			JPanel panel = new JPanel();
			AboutFrame.add(panel);
			panel.add(label);
			panel.add(label1);
			panel.add(label2);
		}
    	
    }


   
    
   
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    public void setjMenuItem2(javax.swing.JMenuItem jMenuItem2) {
		this.jMenuItem2 = jMenuItem2;
	}

	public javax.swing.JMenuItem getjMenuItem2() {
		return jMenuItem2;
	}

	// Variables declaration - do not modify
    private javax.swing.JMenu Authors;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
   private javax.swing.JComboBox jComboBox1;
   // private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private ArrayList<JComboBox> arrCombo= new ArrayList<JComboBox>();
    
    ArrayList<Integer> lst=new ArrayList<Integer>();
    
    JFrame selectionFrame;
    
    // End of variables declaration

}
