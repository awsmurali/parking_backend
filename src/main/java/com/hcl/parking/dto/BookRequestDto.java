package com.hcl.parking.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer regId;
	private Integer availableSlotId;

}
