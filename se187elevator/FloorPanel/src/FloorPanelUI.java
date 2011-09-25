//import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout; //import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FloorPanelUI extends JPanel {
	
	
	FloorPanel floorPanel;
	JButton UpButton = null;
	JButton DownButton = null;
	int currentFloorNumber = 1;
	FloorPanelColor activeButtonColor = null;
	FloorPanelColor buttonColor = null;
	//FloorIndicator flr=null;
	JTextField floorInd2=null;
	JTextField floorInd4=null;
	JTextField floorInd5=null;
	
	public FloorPanelUI(FloorPanel floorPanel, FloorPanelColor buttonColor,	FloorPanelColor activeButtonColor, int CurrentFloorNumber, String upText, String downText) {
		
		
		this.currentFloorNumber = CurrentFloorNumber;
		this.floorPanel = floorPanel;
		this.activeButtonColor = activeButtonColor;
		this.buttonColor = buttonColor;
		
		
		setLayout(new GridBagLayout());
		JLabel label = new JLabel("FloorNumber "+CurrentFloorNumber);
		add(label);
		
		//Pinky added
		JLabel floorInd1= new JLabel("Car ID");
		add(floorInd1);
		floorInd2 = new JTextField(1);
		add(floorInd2);
		JLabel floorInd3= new JLabel("Car Type");
		add(floorInd3);
		floorInd4 = new JTextField(5);
		add(floorInd4);
		floorInd5 = new JTextField(6);
		add(floorInd5);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridy = 1;
		
		UpButton = new JButton(upText);
		UpButton.setBackground(buttonColor.getJColor());
		UpListener upListener = new UpListener();
		UpButton.addActionListener(upListener);
		add(UpButton, gbc);
		gbc.gridy = 2;
		gbc.gridx = 0;
		
		DownButton = new JButton(downText);
		DownButton.setBackground(buttonColor.getJColor());
		DownListener downListener = new DownListener();
		DownButton.addActionListener(downListener);
		add(DownButton, gbc);
		
			
		//flr=new FloorIndicator();
		
		
	}
	
	
	void disableUpButton(){
		System.out.println("Inside DIsable");
		UpButton.setEnabled(false);
			
	}

	
	void disableDownButton(){
		DownButton.setEnabled(false);
	}
	
	
	void processedRequest(){
		//floorInd4.setText("Test");
		//floorInd2.setText("1");
		UpButton.setBackground(buttonColor.getJColor());
		DownButton.setBackground(buttonColor.getJColor());
		
	}
	
	void processIndicatorRequest(int id,String type){
		floorInd2.setText(new Integer(id).toString());
		floorInd4.setText(type);
		//UpButton.setBackground(buttonColor.getJColor());
		//DownButton.setBackground(buttonColor.getJColor());
		
	}
	void processStatusRequest(int status){
		this.floorInd5.setText(new Integer(status).toString());
		/*floorInd4.setText("Test");
		floorInd2.setText("1");
		UpButton.setBackground(buttonColor.getJColor());
		DownButton.setBackground(buttonColor.getJColor());*/
		
	}
	
	private class UpListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UpButton.setBackground(activeButtonColor.getJColor());
			System.out.println("inside up button");
			floorPanel.setFloorPanelStatus("Active");
			floorPanel.getFloorPanelQueueType().putFloorRequest(currentFloorNumber, Direction.UP);
		}
	}

	private class DownListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			DownButton.setBackground(activeButtonColor.getJColor());
			System.out.println("inside down button");
			floorPanel.setFloorPanelStatus("Active");
			floorPanel.getFloorPanelQueueType().putFloorRequest(currentFloorNumber, Direction.DOWN);
		}
	}
}