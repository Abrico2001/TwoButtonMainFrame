package twoButtonMainFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class HidingAndCooprationCombo extends JFrame 
{
/* */
 JButton saveButton = new JButton("Save");

	private static final long serialVersionUID = 1L;
private JPanel topPanel;
private static String[] args;
private static String[] args1;
javax.swing.table.TableColumn col;
private JTable table;

JButton okaybutton;
private JScrollPane scrollPane1;
TableColumn testColumn ;
private String[] columnNames= new String[3];
private String[][] dataValues=new String[3][3];
private String[] item = {"Sequencial","Coopration","Hiding","Choice"};
boolean testme;
JTextField ceck;
static JButton bt=new JButton("Abrico");
     JComboBox<String> combo = new JComboBox<String>(item);
    JComboBox<String> comboBoxCoo = new JComboBox<String>();
    JComboBox<String> comboBoxCoo2 = new JComboBox<String>();
    JComboBox<String> comboBoxCooandHid= new JComboBox<String>();
JButton button = new JButton();
static Object co;
static Object co2;
static JFrame frame = new JFrame();
JButton button1 = new JButton("Abrico");
static int count;
static String  value;
static	int rowchanged;
static	int colchanged;
static String oldvalue;
static String newvalue;
static JComboBox comb;
static JComboBox comb2;
static Object Coo;
static Object Coo2;
public static Object Hid;

public HidingAndCooprationCombo(Object Coo,Object Hid)
  {
	
	this.Coo=Coo;
	this.Hid=Hid;
	

setTitle("Test");
setSize(601,322);
topPanel= new JPanel();
topPanel.setLayout(new BorderLayout());
getContentPane().add(topPanel);
columnNames=new String[] {"Edit" , "Component one" , "Component two","Type"};
 dataValues = new String[][] {
{"Edit"}};
TableModel model=new myTableModel("");
table =new JTable(model);
table.setPreferredScrollableViewportSize(getMaximumSize());
//table.add(model);
table.getColumn("Edit").setCellRenderer(new ButtonRenderer());
table.getColumn("Edit").setCellEditor(new ButtonEditor(new JCheckBox()));

testColumn = table.getColumnModel().getColumn(3);
testColumn.setCellEditor(new DefaultCellEditor(combo));


 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
combo.addItemListener(new ItemListener() 
{
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if (e.getStateChange() == ItemEvent.SELECTED) {
        	
        	String getItem = (String)combo.getSelectedItem();
        	
       	 if(getItem.equals("Coopration"))
    {
	
 
		for(int i=0;i<5;i++)
		{
          	  javax.swing.table.TableColumn col=table.getColumnModel().getColumn(1);
          	  col.setCellEditor(new DefaultCellEditor(comboBoxCoo));  
           javax.swing.table.TableColumn colco5=table.getColumnModel().getColumn(2);	
            colco5.setCellEditor(new DefaultCellEditor(comboBoxCoo2));
       	   comboBoxCoo.addItem("Hello"+i);
   
       	   
       	   
       	comboBoxCoo.setToolTipText("Choose distribution type");
		// Select correct distribution
      Object a= 	comboBoxCoo.getSelectedItem();
		if (comboBoxCoo.getSelectedItem() != null) {
			comboBoxCoo.setSelectedItem(a);
			//refreshView();
		}
		comboBoxCoo.addItemListener(change_listener);
       	   
       	   
               // comboBoxCoo2.addItem(lss.toString());
 comboBoxCoo2.addItem("Hello"+i);
    	
     } 
System.out.println("what is fennn");
 //
//System.out.println("item"+item);

    }

 if(getItem.equals("Hiding"))
{

 
	for(int i=0; i<6;i++)
    {
///
	  javax.swing.table.TableColumn col5=table.getColumnModel().getColumn(2);	
  col5.setCellEditor(new DefaultCellEditor(comboBoxCooandHid));
  int row = 0,col;
		 comboBoxCooandHid.addItem("Hello"+i);
  	   }
 
    }

System.out.println(e.getItem() + " selected");    
        }
    }
});

ActionListener actionlistener = new ActionListener() {

public void actionPerformed(ActionEvent actionevent)
{
JTextField txt = new JTextField();
	String getItemi = (String)comboBoxCooandHid.getSelectedItem();
	javax.swing.table.TableColumn col=table.getColumnModel().getColumn(1);
col.setCellEditor(new DefaultCellEditor(txt));
table.setValueAt(getItemi, 0, 1);
}
};
comboBoxCooandHid.addActionListener(actionlistener);

saveButtonListener listener1 = new saveButtonListener();
saveButton.addActionListener(listener1);
scrollPane1=new JScrollPane(table);

topPanel.add(scrollPane1,BorderLayout.CENTER); 
topPanel.add(saveButton,BorderLayout.PAGE_END);
topPanel.setBackground(Color.YELLOW);
frame.add(topPanel);
frame.setSize(getPreferredSize());
frame.setVisible(true);

}

/////////////////////////////
public static void main(String[] args2)

{
	
	HidingAndCooprationCombo ff=new HidingAndCooprationCombo(Coo,Hid);

for(int i=0; i<count;i++)
{
System.out.println(i);
}
}
class ButtonRenderer extends JButton implements TableCellRenderer 
{
public ButtonRenderer() 
{
setOpaque(true);
}
public Component getTableCellRendererComponent(JTable table, Object value,
boolean isSelected, boolean hasFocus, int row, int column) 
{
setText((value == null) ? "" : value.toString());
return this;
}
}
class ButtonEditor extends DefaultCellEditor 
{
private String label;
public ButtonEditor(JCheckBox checkBox)
{
super(checkBox);
}

public Component getTableCellEditorComponent(JTable table, Object value,

boolean isSelected, int row, int column) 
{
label = (value == null) ? "Hello" : value.toString();
button.setText(label);
return button;
}
public Object getCellEditorValue()
{
return new String(label);
}
}

class ButtonEditor1 extends DefaultCellEditor 
{
private String label;
public ButtonEditor1(JCheckBox checkBox)
{
super(checkBox);
}

public Component getTableCellEditorComponent(JTable table, Object value,

boolean isSelected, int row, int column) 
{
label = (value == null) ? "Distribution Area" : value.toString();
button1.setText(label);
return button1;
}
public Object getCellEditorValue()
{
return new String(label);
}
}

public class myTableModel extends DefaultTableModel

{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

String dat;

JButton button=new JButton("");

myTableModel(String tname)
{
super(dataValues,columnNames);
dat=tname;
}
public boolean isCellEditable(int row,int cols)
{
if( dat=="owntable")
{
if(cols==0){return true;}
 }
return true;
 }
}  
class MyComboBoxRenderer extends JComboBox implements TableCellRenderer {
	  
	  /**
 * 
 */
private static final long serialVersionUID = 1L;

public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, 
      boolean hasFocus, int row, int column) {
    if (isSelected) {
      setForeground(table.getSelectionForeground());
      super.setBackground(table.getSelectionBackground());
    } else {
      setForeground(table.getForeground());
      setBackground(table.getBackground());
    }
    setSelectedItem(value);
    return this;
  }
}


//////////////Test
private class saveButtonListener implements ActionListener 
{
    
        @Override
        public void actionPerformed(ActionEvent event) 
        {
        	  if (comboBoxCoo.getSelectedItem()!=null) 
    	        {
    	        	Coo=	comboBoxCoo.getSelectedItem();
    	        	//Hid=comboBoxCooandHid.getSelectedItem();
Coo2=comboBoxCoo2.getSelectedItem();
comboBoxCoo.setSelectedItem(Coo);
//comboBoxCooandHid.setSelectedItem(Hid);
	comboBoxCoo2.setSelectedItem(Coo2);
 System.out.println(Coo);
 frame.dispose();

} 
else {
	
	JOptionPane.showMessageDialog(
			HidingAndCooprationCombo.this,
			"Error in distribution parameters: "
+ "Hello",
"Wrong parameters error", JOptionPane.ERROR_MESSAGE);
    	        }
     	
        }
   
}

protected ItemListener change_listener = new ItemListener() {
	public void itemStateChanged(ItemEvent e) {
		
		
		comboBoxCoo = (JComboBox) e.getSource();

        // The item affected by the event.
        Object item = e.getItem();

       // textArea.setText("Affected items: " + item.toString());

        if (e.getStateChange() == ItemEvent.SELECTED) {
        	item.toString();
        }

        if (e.getStateChange() == ItemEvent.DESELECTED) {
        	item.toString();
        }
		
	}
};
}