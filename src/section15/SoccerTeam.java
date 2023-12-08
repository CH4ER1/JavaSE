package section15;

public class SoccerTeam implements Cloneable {

	public String name;
	public String location;
	public String since;
	public String league;
	
	public SoccerTeam(String name, String location, String since, String league) {
		this.name = name;
		this.location = location;
		this.since = since;
		this.league = league;
	}
	@Override
	public String toString() {
		return name + "@" + league;
		}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public Object callClone() throws CloneNotSupportedException {
		return clone(); //protected 되어있는 clone을 public으로 바꾸면 다른 패키지에서도 사용 가능
	}
}
