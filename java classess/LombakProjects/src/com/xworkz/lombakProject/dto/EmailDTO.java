package com.xworkz.lombakProject.dto;

public class EmailDTO {

}
package com.xworkz.lombokproject.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmailDTO implements Serializable {

	private String from;
	private String to;
	private String subject;
	private String message;

}