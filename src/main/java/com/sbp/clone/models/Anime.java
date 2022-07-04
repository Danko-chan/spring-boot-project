package com.sbp.clone.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Anime {
	
	private final String id;
	private final String name;
	private final Type status;
	
	public static enum Type {
	Completed, Watching, OnHold, Watchlist
	}

}
