package taco;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {

	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	
	// TODO: seem this error check has problem
	// return page cannot show input list any more
	// it neither show the error message as well
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;
}
