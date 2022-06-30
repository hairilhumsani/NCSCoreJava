package p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String projectName;
	private String description;
	private int budget;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String projectName, String description, int budget) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.description = description;
		this.budget = budget;
	}
	
	
	public Project(String projectName, String description, int budget) {
		super();
		this.projectName = projectName;
		this.description = description;
		this.budget = budget;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", description=" + description + ", budget="
				+ budget + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + budget;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + pid;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (budget != other.budget)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (pid != other.pid)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}
	
	
	
}
