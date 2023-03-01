import java.util.Date;

public class Task {
	private String Description;
	private Date dueDate;
	private boolean Complete;
	private TaskType type;
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public boolean getComplete() {
		return Complete;
	}
	public void setComplete(boolean Complete) {
		this.Complete = Complete;
	}
	
	public boolean gettype() {
		return type;
	}
	public void setType(TaskType type) {
		this.type = type;
	}
	

}
