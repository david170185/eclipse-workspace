package pack03;

public class BookVO {
	//가방안에 변수들로 공간을 만들어둔다.
	String id;
	String title;
	String story;
	String company;
	
	//source 메뉴에서 generate setters, getters 적용(자동 생성)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
