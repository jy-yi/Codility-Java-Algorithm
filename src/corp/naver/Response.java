package corp.naver;

public class Response {
	private String status;
	private String current;

	public Response() {}

	public Response(String status, String current) {
		this.status = status;
		this.current = current;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

}
