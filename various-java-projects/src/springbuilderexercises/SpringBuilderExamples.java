package springbuilderexercises;

public class SpringBuilderExamples {

	private String messageInMethod;

	public SpringBuilderExamples() {
		super();
	}

	public String getMessageInMethod() {
		return messageInMethod;
	}

	public void setMessageInMethod(String messageInMethod) {
		this.messageInMethod = messageInMethod;
	}

	public String hello(String name) {
		StringBuilder str = new StringBuilder();
		String greetingMessage = "Hello";
		StringBuilder messageInString = str.append(greetingMessage).append(",").append(" ").append(name).append("!");
		String messageInMethod = messageInString.toString();

		return messageInMethod;

	}

	public String helloSolution(String friendName) {
		if (friendName.equals("Craftsman") || friendName.equals("Mr. X")) {
			friendName = "Hello, World!";
		}
		return friendName;
	}

}
