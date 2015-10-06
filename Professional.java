package csm10jlab06;
import java.util.Vector;


public class Professional {
    private String getName = new String();
    private Vector<String> qualifications = new Vector<String>();
    
    public Professional(String name)
    {
        getName = name;
        qualifications.addElement(getName);
        
    }
    
    public String getName()
    {
        return getName;
    }
    
    public String[] getQualifications()
    {
        return (String[]) qualifications.toArray();
    }
    
    public void addQualification(String name)
    {
        qualifications.addElement(name);
    }
    
    public boolean hasQualification(String name)
    {
        for(int count = 0; count < qualifications.size(); count++)
        {
            if(name.toLowerCase().equals(qualifications.elementAt(count).toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }
}
