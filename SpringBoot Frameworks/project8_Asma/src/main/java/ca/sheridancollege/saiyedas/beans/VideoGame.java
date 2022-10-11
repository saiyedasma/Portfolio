package ca.sheridancollege.saiyedas.beans;

import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class VideoGame {
	
	private Long id;
	private String title;
    private String publisher;
    private String platform;
    private Long BigDecimalprice;
    
    private final String[] PLATFORMS = {"your", "favourite", "console"};
	


}
