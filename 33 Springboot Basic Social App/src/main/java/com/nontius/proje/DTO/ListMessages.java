package com.nontius.proje.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ListMessages {

	private List<String> send;
	private List<String> recived;
}
